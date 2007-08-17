package chrome.xmdl.core.platform;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import chrome.xmdl.XProject;
import chrome.xmdl.core.plugin.XMDLCorePlugin;
import chrome.xmdl.core.templates.build.POM;
import chrome.xmdl.core.templates.context.ApplicationContextDAO;
import chrome.xmdl.core.templates.context.ApplicationContextDB;
import chrome.xmdl.core.templates.context.ApplicationContextService;
import chrome.xmdl.core.templates.context.ApplicationContextWEB;
import chrome.xmdl.core.templates.context.ApplicationResourcesProp;
import chrome.xmdl.core.templates.context.DatabaseProperties;
import chrome.xmdl.core.templates.context.EhCache;
import chrome.xmdl.core.templates.context.Log4JProp;
import chrome.xmdl.core.templates.dao.EntityDAOImplTemplate;
import chrome.xmdl.core.templates.dao.EntityDAOTemplate;
import chrome.xmdl.core.templates.dao.hbm.PackageHBMTemplate;
import chrome.xmdl.core.templates.model.EntityImplTemplate;
import chrome.xmdl.core.templates.model.EntitySearchImplTemplate;
import chrome.xmdl.core.templates.model.EntitySearchTemplate;
import chrome.xmdl.core.templates.model.EntityTemplate;
import chrome.xmdl.core.templates.model.EnumerationTemplate;
import chrome.xmdl.core.templates.service.AbstractEntityService;
import chrome.xmdl.core.templates.service.EntityServiceImplTemplate;
import chrome.xmdl.core.templates.service.EntityServiceTemplate;
import chrome.xmdl.core.templates.service.SampleListenerImplTemplate;
import chrome.xmdl.core.templates.service.SampleListenerTemplate;
import chrome.xmdl.core.templates.test.bo.BOTestPropertiesTemplate;
import chrome.xmdl.core.templates.test.bo.BOTestTemplate;
import chrome.xmdl.core.templates.test.dao.DAOTestPropertiesTemplate;
import chrome.xmdl.core.templates.test.dao.DAOTestTemplate;
import chrome.xmdl.core.templates.test.ui.web.action.EntityActionTest;
import chrome.xmdl.core.templates.test.ui.web.form.EntityFormTest;
import chrome.xmdl.core.templates.ui.web.Constants;
import chrome.xmdl.core.templates.ui.web.MessageKeys;
import chrome.xmdl.core.templates.ui.web.ParameterKeys;
import chrome.xmdl.core.templates.ui.web.StrutsLayout;
import chrome.xmdl.core.templates.ui.web.action.EntityAction;
import chrome.xmdl.core.templates.ui.web.decorator.Application01;
import chrome.xmdl.core.templates.ui.web.form.EntityForm;
import chrome.xmdl.core.templates.ui.web.include.FooterJSP;
import chrome.xmdl.core.templates.ui.web.include.HeaderJSP;
import chrome.xmdl.core.templates.ui.web.include.HomeJSP;
import chrome.xmdl.core.templates.ui.web.include.MenuJSP;
import chrome.xmdl.core.templates.ui.web.include.MetaJSP;
import chrome.xmdl.core.templates.ui.web.include.TaglibsJSP;
import chrome.xmdl.core.templates.ui.web.jsp.EntityEditJSP;
import chrome.xmdl.core.templates.ui.web.jsp.EntitySearchJSP;
import chrome.xmdl.core.templates.ui.web.taglib.SampleTag;
import chrome.xmdl.core.templates.ui.web.webinf.CustomTLD;
import chrome.xmdl.core.templates.ui.web.webinf.DecoratorsXML;
import chrome.xmdl.core.templates.ui.web.webinf.MenuConfigXML;
import chrome.xmdl.core.templates.ui.web.webinf.SitemeshXML;
import chrome.xmdl.core.templates.ui.web.webinf.StrutsConfigXML;
import chrome.xmdl.core.templates.ui.web.webinf.ValidationXML;
import chrome.xmdl.core.templates.ui.web.webinf.ValidatorRulesCustomXML;
import chrome.xmdl.core.templates.ui.web.webinf.ValidatorRulesXML;
import chrome.xmdl.core.templates.ui.web.webinf.WebXML;
import chrome.xmdl.xgen.AbstractTaskFactory;
import chrome.xmdl.xgen.Task;
import chrome.xmdl.xgen.Template;
import chrome.xmdl.xgen.UnzipTask;

public class XmdlTaskFactory extends AbstractTaskFactory {
	protected List<Template> templates;

	private List<Task> successorTasks;

	private List<Task> predecessorTasks;

	private static final Logger LOGGER = Logger
			.getLogger(XmdlTaskFactory.class);

	public XmdlTaskFactory() {
		super();
		LOGGER.debug(" new instance");
		init();
	}

	
	/**
	 * @return Returns the templates.
	 */
	protected List<Template> getTemplates() {
		return templates;
	}

	private void init() {
		try {
			if (templates == null) {
				templates = new ArrayList<Template>();
				templates.clear();
				//build
				templates.add(new POM());

				// model
				templates.add(new EnumerationTemplate());
				templates.add(new EntityTemplate());
				templates.add(new EntityImplTemplate());
				templates.add(new EntitySearchTemplate());
				templates.add(new EntitySearchImplTemplate());

				// dao
				templates.add(new PackageHBMTemplate());
				templates.add(new EntityDAOTemplate());
				templates.add(new EntityDAOImplTemplate());
				//templates.add(new ProjectCFGTemplate()); no need for this

				// CONTEXT
				templates.add(new ApplicationContextDB());
				templates.add(new ApplicationContextDAO());
				templates.add(new ApplicationContextWEB());
				templates.add(new ApplicationContextService());

				templates.add(new ApplicationResourcesProp());
				//templates.add(new CommonResourcesProp());

				templates.add(new EhCache());
				templates.add(new Log4JProp());

				// bo
				templates.add(new EntityServiceTemplate());
				templates.add(new AbstractEntityService());
				templates.add(new EntityServiceImplTemplate());
				templates.add(new SampleListenerTemplate());
				templates.add(new SampleListenerImplTemplate());

				// ui.web
				templates.add(new StrutsLayout());
				templates.add(new CustomTLD());
				templates.add(new DecoratorsXML());
				templates.add(new MenuConfigXML());
				templates.add(new SitemeshXML());
				templates.add(new WebXML());
				templates.add(new ValidationXML());
				templates.add(new ValidatorRulesXML());
				templates.add(new ValidatorRulesCustomXML());
				templates.add(new StrutsConfigXML());						
				templates.add(new Constants());
				templates.add(new MessageKeys());
				templates.add(new ParameterKeys());
				templates.add(new EntityAction());
				templates.add(new EntityForm());
				templates.add(new SampleTag());
				//jsp
				templates.add(new EntityEditJSP());
				templates.add(new EntitySearchJSP());
				templates.add(new Application01());
				templates.add(new FooterJSP());
				templates.add(new HeaderJSP());
				templates.add(new HomeJSP());
				templates.add(new MenuJSP());
				templates.add(new MetaJSP());
				templates.add(new TaglibsJSP());

				//tests
				templates.add(new DatabaseProperties());
				templates.add(new DAOTestTemplate());
				templates.add(new DAOTestPropertiesTemplate());
				templates.add(new BOTestTemplate());
				templates.add(new BOTestPropertiesTemplate());
				templates.add(new EntityActionTest());
				templates.add(new EntityFormTest());
			}

		} catch (Throwable e) {
			LOGGER.warn("FATAL ", e);
		}
	}

	public List<Task> createPredecessorTasks(XProject project, List<EObject> list) {
		if (predecessorTasks == null){
			predecessorTasks = new ArrayList<Task>();

			String projectName = project.getName();
			String targetBase = "/" + projectName + "/";

			Map<String, String> filenameReplacement = new HashMap<String, String>();
			filenameReplacement.put("project.name", projectName);

			//IFolder target = null;
			InputStream input = null;
			try {
				//IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
				//target = root.getFolder(new Path(targetBase));
				URL baseURL = XMDLCorePlugin.INSTANCE.getBaseURL();
				
				URL file = new URL(baseURL, "/res/defaultContent.zip");
				
				input = file.openStream();
			} catch (Exception e) {
				LOGGER.debug("Exception :" + targetBase, e);
			}
			
//			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//			root.getFolder(targetBase +".");

			URI targetURI = URI.createFileURI(targetBase);
			targetURI = URIHelper.asLocalURI(targetURI);
			String dest = targetBase;
			UnzipTask unzipTask = new UnzipTask(input, dest);
			unzipTask.setFilenameReplacement(filenameReplacement);
			predecessorTasks.add(unzipTask);
		}
		return predecessorTasks;
	}

	public List<Task> createSuccessorTasks(XProject project, List<EObject> list) {
		if (successorTasks == null){
			successorTasks = new ArrayList<Task>();
		}
		return successorTasks;
	}

}
