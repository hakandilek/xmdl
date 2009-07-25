package org.xmdl.xgen;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.xmdl.xgen.util.ModelIterator;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdldb.DModel;


public abstract class AbstractTaskFactory implements TaskFactory {
	private final static Logger LOGGER = Logger
			.getLogger(AbstractTaskFactory.class);

	public List<GenerationTask> createTasks(XProject project, List<EObject> list) {
		List<GenerationTask> taskList = new ArrayList<GenerationTask>();
		ModelIterator objectIterator = new ModelIterator(project);
		while (objectIterator.hasNext()) {
			EObject next = objectIterator.next();
			List<Template> templates = getTemplates();
			for (Iterator<Template> iter = templates.iterator(); iter.hasNext();) {
				Template template = iter.next();
				if (template.accept(next)) {
					taskList.add(new GenerationTask(next, template));
				}

			}
		}
		for (Object object : list) {
			if (object instanceof DModel) {
				DModel dmodel = (DModel) object;
				addTasks(taskList, dmodel);
			}
		}
		return taskList;
	}

	private void addTasks(List<GenerationTask> taskList, DModel dmodel) {
		LOGGER.debug("addTasks Dmodel");
		ModelIterator objectIterator;
		objectIterator = new ModelIterator(dmodel);
		while (objectIterator.hasNext()) {
			EObject next = objectIterator.next();
			List<Template> templates = getTemplates();
			for (Iterator<Template> iter = templates.iterator(); iter.hasNext();) {
				Template template = iter.next();
				if (template.accept(next)) {
					taskList.add(new GenerationTask(next, template));
				}
			}
		}
	}

	protected abstract List<Template> getTemplates();
	
	public UnzipTask getUnzipTask(XProject project) {
        String projectName = project.getName();
        String targetBase = "/" + projectName + "/";

        Map<String, String> filenameReplacement = new HashMap<String, String>();
        filenameReplacement.put("project.name", projectName);

        InputStream input = getZipInput();
        if (input != null) {
            UnzipTask unzipTask = new UnzipTask(input, targetBase);
            unzipTask.setFilenameReplacement(filenameReplacement);
            return unzipTask;
        }

		return null;
	}

	protected abstract InputStream getZipInput();
}
