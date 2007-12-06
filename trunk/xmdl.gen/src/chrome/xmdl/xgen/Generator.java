package chrome.xmdl.xgen;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.JCompilationUnit;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jet.BodyContentWriter;
import org.eclipse.jet.BufferedJET2Writer;
import org.eclipse.jet.IWriterListener;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.transform.TransformContextExtender;

import chrome.xmdl.XModel;
import chrome.xmdl.XProject;
import chrome.xmdl.gen.plugin.XMDLGenPlugin;
import chrome.xmdl.init.Initializer;
import chrome.xmdl.xgen.util.IFileUtils;
import chrome.xmdl.xgen.util.ResourceHelper;
import chrome.xmdl.xgen.util.URIHelper;
import chrome.xmdlbo.XmdlboFactory;
import chrome.xmdldb.XmdldbFactory;
import chrome.xmdlgen.XmdlgenFactory;

public class Generator {

	private static final Logger LOGGER = Logger.getLogger(Generator.class);

	public static final String KEEP_EXPRESSION = "@keep";

	private XProject project;

	private IWorkspaceRoot workspaceRoot;

	private List<GeneratorListener> listeners = new ArrayList<GeneratorListener>();

	private List<XModel> subModels = new ArrayList<XModel>();

	private URI mergeURI;

	public Generator() {
		super();
	}

	public Generator(XProject project) {
		this();
		setProject(project);
		subModels.add(XmdlgenFactory.eINSTANCE.createXMDLGenModel());
		subModels.add(XmdldbFactory.eINSTANCE.createXMDLDBModel());
		subModels.add(XmdlboFactory.eINSTANCE.createXMDLBOModel());
	}

	/**
	 * @param project
	 *            The project to set.
	 */
	public void setProject(XProject project) {
		LOGGER.debug("Project set:" + project);
		this.project = project;
	}

	/**
	 * @return Returns the project.
	 */
	public XProject getProject() {
		return project;
	}

	/**
	 * @param workspaceRoot
	 *            The workspaceRoot to set.
	 */
	public void setWorkspaceRoot(IWorkspaceRoot workspaceRoot) {
		this.workspaceRoot = workspaceRoot;
	}

	/**
	 * Generates the source code
	 */
	public void generate(Platform platform) {
		fireGenerationInitialized();
		LOGGER.info("Generating project : " + project);

		XProject prj = getProject();

		TaskFactory tf = platform.taskFactory();
		List<EObject> roots = initialize();
		List<GenerationTask> gTasks = tf.createTasks(prj, roots);
		List<Task> preTasks = tf.createPredecessorTasks(prj, roots);
		List<Task> postTasks = tf.createSuccessorTasks(prj, roots);
		
		
		// Create a merger
		JMerger merger = createMerger();

		int size = gTasks != null ? gTasks.size() : 0;
		size += preTasks != null ? preTasks.size() : 0;
		size += postTasks != null ? postTasks.size() : 0;
		
		fireGenerationStarted(size);

		// progressMonitor.beginTask("XMDL generate", tasks.size());
		LOGGER.debug("XMDL generate");

		run(preTasks);
		generate(gTasks, merger);
		run(postTasks);
		fireGenerationFinished();

	}

	protected void run(List<Task> tasks) {
		if (tasks != null){
			for (Task task : tasks) {
				LOGGER.debug(" running task = " + task);
				task.run();
			}
		}		
	}

	@SuppressWarnings("unchecked")
	public List<EObject> initialize() {

		Resource resource = project.eResource();
		if (resource == null){
			LOGGER.error("Project has no resource");
			return null;			
		}
		URI uri = resource.getURI();

		List list = new ArrayList<EObject>();
		
		for (int i = 0; i < subModels.size(); i++) {
			XModel subModel = subModels.get(i);
			EObject subRoot = null;

			URI subURI = subModel.path(uri);

			File subFile = new File(URIHelper.asLocalURI(subURI).toFileString());
			LOGGER.debug("subFile.canRead() = " + subFile.canRead());

			if (subFile.exists()) {
				LOGGER.info("Sub Model resource exists, loading " + subURI);
				subRoot = ResourceHelper.loadResource(subURI);
			} else {
				LOGGER.info("Sub Model resource does not exist, creating "
						+ subURI);
				subRoot = subModel.createRoot(project, uri);
			}

			if (subRoot == null) {
				LOGGER.error("Sub Model is null");
				return null;
			}

			list.add(subRoot);
			LOGGER.debug("Initializing Sub Model : " + subModel.name());
			Initializer init = subModel.getInitializer();
			init.initialize(project, subRoot);
			LOGGER.debug("Sub Model initialized.");

			LOGGER.debug("Saving Sub model...");
			try {
				ResourceHelper.saveResource(subURI, subRoot);
			} catch (IOException e) {
				LOGGER.error("Error Saving resource", e);
			}
			// subResource.save(saveOptions);
			LOGGER.info("Sub Model saved : " + subModel.name());
		}
		return list;
	}

	private void generate(List<GenerationTask> tasks, JMerger merger) {
		// IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for (Iterator<GenerationTask> iter = tasks.iterator(); iter.hasNext();) {
			GenerationTask task = iter.next();

			Template template = task.getTemplate();
            Object source = task.getSource();
            String targetFile = template.targetFile(source);

			LOGGER.debug("Generation File:" + targetFile);
			String targetDirectory ="";
			if(targetFile.lastIndexOf("/")>=0)
				targetDirectory = targetFile.substring(0, targetFile
					.lastIndexOf("/"));
			if (!targetDirectory.startsWith("/"))
				targetDirectory = "/" + targetDirectory;

			String targetBase = "/" + project.getName();
			LOGGER.debug("base:" + targetBase);
			targetDirectory = targetBase + targetDirectory;
			if (!targetFile.startsWith("/"))
				targetFile = "/" + targetFile;
			targetFile = targetBase + targetFile;
			try {
				IFileUtils.INST.createFolder(targetDirectory);
			} catch (CoreException e1) {
				LOGGER.error("Cannot create directory" + targetDirectory, e1);
			}
			IFile file = workspaceRoot.getFile(new Path(targetFile));
			// File file = new Path(targetFileName).toFile();

			// Perform generation
			try {
				String gen = runTemplate(template, source);
				InputStream generated = new ByteArrayInputStream(gen.getBytes());
				LOGGER.debug("file:" + file.toString() + "?" + file.exists());
				
				InputStream result = generated;
				if (file.exists()) {
					boolean keep = false;
					InputStream targetIn = null;
					try {
						targetIn = new FileInputStream(file.getLocation()
								.toFile());
						// targetIn = new FileInputStream(file);
					} catch (FileNotFoundException e) {
						LOGGER.fatal("File " + file + " must be present", e);
					}
					if (targetFile.endsWith(".java")) {
						// use merging

						// set source
						merger.setSourceCompilationUnit(merger.createCompilationUnitForInputStream(generated));

						// set target
						merger.setTargetCompilationUnit(merger
								.createCompilationUnitForInputStream(targetIn));

						LOGGER.debug("Merging file" + targetFile);
						// merge source and target
						merger.merge();

						// extract merged contents
						JCompilationUnit target = merger
								.getTargetCompilationUnit();
						String mergeResult = target.getContents();
						result = new ByteArrayInputStream(mergeResult.getBytes());

						// LOGGER.debug(targetContents);
					} else {
						String target = StringReader.INST.read(targetIn);					
						keep = target.indexOf(KEEP_EXPRESSION) >=0;
					}

					if (keep){
						file = workspaceRoot.getFile(file.getFullPath().addFileExtension("gen"));
					}
					
					// Save file
					LOGGER.debug("Modifying file :" + file.toString());
					try {
						if (file.exists()) {
							file.setContents(result, true, true, null);
						} else {
							file.create(generated, true, null);
						}
						fireProgress();
					} catch (CoreException e) {
						LOGGER.error("Cannot write to file " + file, e);
						e.printStackTrace();
					}

				} else {
					LOGGER.debug("Creating  file :" + file.toString());
					// does not exist, create a new one
					try {
						file.create(generated, true, null);
						fireProgress();
					} catch (CoreException e) {
						LOGGER.error("Cannot create file " + file, e);
					}
				}

				LOGGER.info("File generated:" + file.toString());
			} catch (Exception e) {
				LOGGER.error("Exceptin generating file :" + file, e);
			}
		}
	}

	public static String runTemplate(Template template, Object parameter) {
        final BufferedJET2Writer out = new BodyContentWriter();

        JET2Context context = new JET2Context(null);
        TransformContextExtender.getInstance(context);
        String parameterName = template.parameterName();
        context.setVariable(parameterName, parameter);
        template.generate(context, out);

        final IWriterListener[] eventListeners = out.getEventListeners();
        for (int i = 0; i < eventListeners.length; i++)
        {
          eventListeners[i].finalizeContent(out, null);
        }

        String output = out.getContent();
        
        for (int i = 0; i < eventListeners.length; i++)
        {
          eventListeners[i].postCommitContent(out, output);
        }

        return output;
    }

    /**
     * Writes contents of source into destination
     * 
     * @param reader
     *            source
     * @param file
     *            destination
     * @throws IOException
     */
	protected void writeTo(Reader reader, File file) throws IOException {
		Writer w = new FileWriter(file);
		writeTo(reader, w);
	}

	/**
	 * Writes contents of source into destination
	 * 
	 * @param inputStream
	 *            source
	 * @param file
	 *            destination
	 * @throws IOException
	 */
	protected void writeTo(InputStream inputStream, File file) throws IOException {
		Writer w = new FileWriter(file);
		writeTo(inputStream, w);
	}

	/**
	 * Writes contents of source into destination
	 * 
	 * @param inputStream
	 *            source
	 * @param writer
	 *            destination
	 * @throws IOException
	 */
	protected void writeTo(InputStream inputStream, Writer writer)
			throws IOException {
		Reader reader = new BufferedReader(new InputStreamReader(inputStream));
		writeTo(reader, writer);
	}

	/**
	 * Writes contents of source into destination
	 * 
	 * @param reader
	 *            source
	 * @param writer
	 *            destination
	 * @throws IOException
	 */
	protected void writeTo(Reader reader, Writer writer) throws IOException {
		char[] buff = new char[8192];
		int i = reader.read(buff);
		while (i > 0) {
			writer.write(buff, 0, i);
			i = reader.read(buff);
		}
		writer.close();
	}


	protected JMerger createMerger() {
		// build URI for merge document
		String mergeXML = null;
		try {
			URI fileURI = mergeURI;
			if (mergeURI == null) {
				URL baseURL = XMDLGenPlugin.getPlugin().getBaseURL();
				fileURI = URI.createURI(baseURL.toString() + "/res/merge.xml");
			}
			mergeXML = fileURI.toString();
		} catch (Throwable e) {
			LOGGER.warn("fatal res exc", e);
		}

		JControlModel controlModel = new JControlModel();
	    String facadeHelperClass = JMerger.DEFAULT_FACADE_HELPER_CLASS;
	    controlModel.initialize(CodeGenUtil.instantiateFacadeHelper(facadeHelperClass), mergeXML);
		JMerger jmerger = new JMerger(controlModel);
		return jmerger;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see chrome.xmdl.xgen.Generator#addListener(chrome.xmdl.xgen.GeneratorListener)
	 */
	public void addListener(GeneratorListener l) {
		listeners.add(l);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see chrome.xmdl.xgen.Generator#removeListener(chrome.xmdl.xgen.GeneratorListener)
	 */
	public void removeListener(GeneratorListener l) {
		listeners.remove(l);
	}

	protected void fireGenerationInitialized() {
		LOGGER.debug("Generation Initialized");
		for (int i = 0; i < listeners.size(); i++) {
			GeneratorListener l = listeners.get(i);
			l.generationInitialized(new GeneratorEvent());
		}
	}

	protected void fireGenerationStarted(int size) {
		LOGGER.debug("Generation Started, size:" + size);
		for (int i = 0; i < listeners.size(); i++) {
			GeneratorListener l = listeners.get(i);
			l.generationStarted(new GeneratorEvent(size));
		}
	}

	protected void fireProgress() {
		LOGGER.debug("Generation progress");
		for (int i = 0; i < listeners.size(); i++) {
			GeneratorListener l = listeners.get(i);
			l.progress(new GeneratorEvent());
		}
	}

	protected void fireGenerationFinished() {
		LOGGER.debug("Generation Finished");
		for (int i = 0; i < listeners.size(); i++) {
			GeneratorListener l = listeners.get(i);
			l.generationFinished(new GeneratorEvent());
		}
	}

	/**
	 * @return Returns the subModels.
	 */
	public List<XModel> getSubModels() {
		return subModels;
	}

	public void setMergeURI(URI mergeURI) {
		this.mergeURI = mergeURI;
	}

}
