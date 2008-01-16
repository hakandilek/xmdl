package org.xmdl.core.platform;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.xmdl.core.plugin.XMDLCorePlugin;
import org.xmdl.core.templates.build.POM;
import org.xmdl.core.templates.context.ApplicationContextDAO;
import org.xmdl.core.templates.context.ApplicationContextDB;
import org.xmdl.core.templates.context.ApplicationContextService;
import org.xmdl.core.templates.context.ApplicationContextWEB;
import org.xmdl.core.templates.context.ApplicationResourcesProp;
import org.xmdl.core.templates.context.DatabaseProperties;
import org.xmdl.core.templates.context.EhCache;
import org.xmdl.core.templates.context.Log4JProp;
import org.xmdl.core.templates.dao.EntityDAOImplTemplate;
import org.xmdl.core.templates.dao.EntityDAOTemplate;
import org.xmdl.core.templates.dao.hbm.PackageHBMTemplate;
import org.xmdl.core.templates.model.EntityImplTemplate;
import org.xmdl.core.templates.model.EntitySearchImplTemplate;
import org.xmdl.core.templates.model.EntitySearchTemplate;
import org.xmdl.core.templates.model.EntityTemplate;
import org.xmdl.core.templates.model.EnumerationTemplate;
import org.xmdl.core.templates.service.AbstractEntityService;
import org.xmdl.core.templates.service.EntityServiceImplTemplate;
import org.xmdl.core.templates.service.EntityServiceTemplate;
import org.xmdl.core.templates.service.SampleListenerImplTemplate;
import org.xmdl.core.templates.service.SampleListenerTemplate;
import org.xmdl.core.templates.test.bo.BOTestPropertiesTemplate;
import org.xmdl.core.templates.test.bo.BOTestTemplate;
import org.xmdl.core.templates.test.dao.DAOTestPropertiesTemplate;
import org.xmdl.core.templates.test.dao.DAOTestTemplate;
import org.xmdl.core.templates.test.ui.web.action.EntityActionTest;
import org.xmdl.core.templates.test.ui.web.form.EntityFormTest;
import org.xmdl.core.templates.ui.web.Constants;
import org.xmdl.core.templates.ui.web.MessageKeys;
import org.xmdl.core.templates.ui.web.ParameterKeys;
import org.xmdl.core.templates.ui.web.StrutsLayout;
import org.xmdl.core.templates.ui.web.action.EntityAction;
import org.xmdl.core.templates.ui.web.decorator.Application01;
import org.xmdl.core.templates.ui.web.form.EntityForm;
import org.xmdl.core.templates.ui.web.include.FooterJSP;
import org.xmdl.core.templates.ui.web.include.HeaderJSP;
import org.xmdl.core.templates.ui.web.include.HomeJSP;
import org.xmdl.core.templates.ui.web.include.MenuJSP;
import org.xmdl.core.templates.ui.web.include.MetaJSP;
import org.xmdl.core.templates.ui.web.include.TaglibsJSP;
import org.xmdl.core.templates.ui.web.jsp.EntityEditJSP;
import org.xmdl.core.templates.ui.web.jsp.EntitySearchJSP;
import org.xmdl.core.templates.ui.web.taglib.SampleTag;
import org.xmdl.core.templates.ui.web.webinf.CustomTLD;
import org.xmdl.core.templates.ui.web.webinf.DecoratorsXML;
import org.xmdl.core.templates.ui.web.webinf.MenuConfigXML;
import org.xmdl.core.templates.ui.web.webinf.SitemeshXML;
import org.xmdl.core.templates.ui.web.webinf.StrutsConfigXML;
import org.xmdl.core.templates.ui.web.webinf.ValidationXML;
import org.xmdl.core.templates.ui.web.webinf.ValidatorRulesCustomXML;
import org.xmdl.core.templates.ui.web.webinf.ValidatorRulesXML;
import org.xmdl.core.templates.ui.web.webinf.WebXML;
import org.xmdl.xgen.AbstractTaskFactory;
import org.xmdl.xgen.Task;
import org.xmdl.xgen.Template;
import org.xmdl.xgen.TemplateAdapter;
import org.xmdl.xgen.UnzipTask;
import org.xmdl.xmdl.XProject;


public class CoreTaskFactory extends AbstractTaskFactory {
	protected List<Template> templates;

	private List<Task> successorTasks;

	private List<Task> predecessorTasks;

	private static final Logger LOGGER = Logger
			.getLogger(CoreTaskFactory.class);

	public CoreTaskFactory() {
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
				templates.add(new TemplateAdapter(new POM()));

				// model
				templates.add(new TemplateAdapter(new EnumerationTemplate()));
				templates.add(new TemplateAdapter(new EntityTemplate()));
				templates.add(new TemplateAdapter(new EntityImplTemplate()));
				templates.add(new TemplateAdapter(new EntitySearchTemplate()));
				templates.add(new TemplateAdapter(new EntitySearchImplTemplate()));

				// dao
				templates.add(new TemplateAdapter(new PackageHBMTemplate()));
				templates.add(new TemplateAdapter(new EntityDAOTemplate()));
				templates.add(new TemplateAdapter(new EntityDAOImplTemplate()));
				//templates.add(new TemplateAdapter(new ProjectCFGTemplate())); no need for this

				// CONTEXT
				templates.add(new TemplateAdapter(new ApplicationContextDB()));
				templates.add(new TemplateAdapter(new ApplicationContextDAO()));
				templates.add(new TemplateAdapter(new ApplicationContextWEB()));
				templates.add(new TemplateAdapter(new ApplicationContextService()));

				templates.add(new TemplateAdapter(new ApplicationResourcesProp()));
				//templates.add(new TemplateAdapter(new CommonResourcesProp()));

				templates.add(new TemplateAdapter(new EhCache()));
				templates.add(new TemplateAdapter(new Log4JProp()));

				// bo
				templates.add(new TemplateAdapter(new EntityServiceTemplate()));
				templates.add(new TemplateAdapter(new AbstractEntityService()));
				templates.add(new TemplateAdapter(new EntityServiceImplTemplate()));
				templates.add(new TemplateAdapter(new SampleListenerTemplate()));
				templates.add(new TemplateAdapter(new SampleListenerImplTemplate()));

				// ui.web
				templates.add(new TemplateAdapter(new StrutsLayout()));
				templates.add(new TemplateAdapter(new CustomTLD()));
				templates.add(new TemplateAdapter(new DecoratorsXML()));
				templates.add(new TemplateAdapter(new MenuConfigXML()));
				templates.add(new TemplateAdapter(new SitemeshXML()));
				templates.add(new TemplateAdapter(new WebXML()));
				templates.add(new TemplateAdapter(new ValidationXML()));
				templates.add(new TemplateAdapter(new ValidatorRulesXML()));
				templates.add(new TemplateAdapter(new ValidatorRulesCustomXML()));
				templates.add(new TemplateAdapter(new StrutsConfigXML()));						
				templates.add(new TemplateAdapter(new Constants()));
				templates.add(new TemplateAdapter(new MessageKeys()));
				templates.add(new TemplateAdapter(new ParameterKeys()));
				templates.add(new TemplateAdapter(new EntityAction()));
				templates.add(new TemplateAdapter(new EntityForm()));
				templates.add(new TemplateAdapter(new SampleTag()));
				//jsp
				templates.add(new TemplateAdapter(new EntityEditJSP()));
				templates.add(new TemplateAdapter(new EntitySearchJSP()));
				templates.add(new TemplateAdapter(new Application01()));
				templates.add(new TemplateAdapter(new FooterJSP()));
				templates.add(new TemplateAdapter(new HeaderJSP()));
				templates.add(new TemplateAdapter(new HomeJSP()));
				templates.add(new TemplateAdapter(new MenuJSP()));
				templates.add(new TemplateAdapter(new MetaJSP()));
				templates.add(new TemplateAdapter(new TaglibsJSP()));

				//tests
				templates.add(new TemplateAdapter(new DatabaseProperties()));
				templates.add(new TemplateAdapter(new DAOTestTemplate()));
				templates.add(new TemplateAdapter(new DAOTestPropertiesTemplate()));
				templates.add(new TemplateAdapter(new BOTestTemplate()));
				templates.add(new TemplateAdapter(new BOTestPropertiesTemplate()));
				templates.add(new TemplateAdapter(new EntityActionTest()));
				templates.add(new TemplateAdapter(new EntityFormTest()));
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
