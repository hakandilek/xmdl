package org.xmdl.ida.platform;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.osgi.framework.Bundle;
import org.xmdl.ida.plugin.XMDLIDAPlugin;
import org.xmdl.ida.plugin.XMDLIDAPlugin.Implementation;
import org.xmdl.ida.templates.core.dao.EntityDAO;
import org.xmdl.ida.templates.core.dao.EntityDAOHibernate;
import org.xmdl.ida.templates.core.model.Entity;
import org.xmdl.ida.templates.core.model.EntitySearch;
import org.xmdl.ida.templates.core.model.Enumeration;
import org.xmdl.ida.templates.core.project.Constants;
import org.xmdl.ida.templates.core.rsc.ApplicationContextDAOXML;
import org.xmdl.ida.templates.core.rsc.ApplicationContextServiceXML;
import org.xmdl.ida.templates.core.rsc.DefaultDataXML;
import org.xmdl.ida.templates.core.rsc.HibernateCFG;
import org.xmdl.ida.templates.core.service.EntityService;
import org.xmdl.ida.templates.core.service.EntityServiceImplementation;
import org.xmdl.ida.templates.core.test.EntityDAOTest;
import org.xmdl.ida.templates.core.test.EntityServiceTest;
import org.xmdl.ida.templates.core.test.HibernateConfigurationTest;
import org.xmdl.ida.templates.core.test.rsc.ApplicationContextResourcesXML;
import org.xmdl.ida.templates.core.test.rsc.ApplicationContextTestXML;
import org.xmdl.ida.templates.core.test.rsc.CoreTestLog4jXML;
import org.xmdl.ida.templates.core.test.rsc.CoreTestSampleDataXML;
import org.xmdl.ida.templates.core.test.rsc.JDBCProperties;
import org.xmdl.ida.templates.core.test.rsc.MailProperties;
import org.xmdl.ida.templates.core.test.rsc.PersistenceXML;
import org.xmdl.ida.templates.eclipse.Classpath;
import org.xmdl.ida.templates.maven.CorePomXML;
import org.xmdl.ida.templates.maven.RootPomXML;
import org.xmdl.ida.templates.maven.WebPomXML;
import org.xmdl.ida.templates.web.action.EntityAction;
import org.xmdl.ida.templates.web.action.ReloadAction;
import org.xmdl.ida.templates.web.jsp.EntityFormJSP;
import org.xmdl.ida.templates.web.jsp.EntityListJSP;
import org.xmdl.ida.templates.web.jsp.MenuJSP;
import org.xmdl.ida.templates.web.jsp.TaglibsJSP;
import org.xmdl.ida.templates.web.listener.StartupListener;
import org.xmdl.ida.templates.web.rsc.ActionValidationXML;
import org.xmdl.ida.templates.web.rsc.ApplicationContextResourcesXMLWeb;
import org.xmdl.ida.templates.web.rsc.ApplicationResourcesProperties;
import org.xmdl.ida.templates.web.rsc.Dummy;
import org.xmdl.ida.templates.web.rsc.EntityValidationXML;
import org.xmdl.ida.templates.web.rsc.HibernateCfgXML;
import org.xmdl.ida.templates.web.rsc.MailPropertiesWeb;
import org.xmdl.ida.templates.web.rsc.StrutsEntityXML;
import org.xmdl.ida.templates.web.rsc.StrutsXML;
import org.xmdl.ida.templates.web.rsc.WebMainLog4jXML;
import org.xmdl.ida.templates.web.site.SiteXML;
import org.xmdl.ida.templates.web.taglib.ConstantsTag;
import org.xmdl.ida.templates.web.taglib.ConstantsTei;
import org.xmdl.ida.templates.web.test.EntityActionTest;
import org.xmdl.ida.templates.web.test.StartupListenerTest;
import org.xmdl.ida.templates.web.test.rsc.WebApplicationContextDAOXML;
import org.xmdl.ida.templates.web.test.rsc.WebApplicationContextServiceXML;
import org.xmdl.ida.templates.web.test.rsc.WebSampleDataXML;
import org.xmdl.ida.templates.web.test.rsc.WebTestLog4jXML;
import org.xmdl.ida.templates.web.test.rsc.WebTestsXML;
import org.xmdl.ida.templates.web.webinf.ApplicationContextHibernateXML;
import org.xmdl.ida.templates.web.webinf.MenuConfigXML;
import org.xmdl.ida.templates.web.webinf.ResinWebXML;
import org.xmdl.ida.templates.web.webinf.TaglibTLD;
import org.xmdl.ida.templates.web.webinf.WebXML;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.AbstractTaskFactory;
import chrome.xmdl.xgen.Task;
import chrome.xmdl.xgen.TaskFactory;
import chrome.xmdl.xgen.Template;
import chrome.xmdl.xgen.UnzipTask;

/**
 * The Task Factory class for the IDA platform. All Code Generation tasks are
 * defined in this class
 * 
 * @author Hakan Dilek
 * 
 */
public class IDATaskFactory extends AbstractTaskFactory implements TaskFactory {

    protected List<Template> templates;

    private List<Task> successorTasks;

    private List<Task> predecessorTasks;

    private static final Logger LOGGER = Logger.getLogger(IDATaskFactory.class);

    public IDATaskFactory() {
        super();
        LOGGER.debug(" new instance");
        init();
    }

    @Override
    protected List<Template> getTemplates() {
        return templates;
    }

    @Override
    public List<Task> createPredecessorTasks(XProject project,
            List<EObject> list) {
        if (predecessorTasks == null) {
            predecessorTasks = new ArrayList<Task>();
            String projectName = project.getName();
            String targetBase = "/" + projectName + "/";

            Map<String, String> filenameReplacement = new HashMap<String, String>();
            filenameReplacement.put("project.name", projectName);

            //IFolder target = null;
            InputStream input = null;
            try {
                IPath file = new Path("/extras/extras.zip");
                LOGGER.debug("file="+file);
                Implementation plugin = XMDLIDAPlugin.getPlugin();
                LOGGER.debug("plugin="+plugin);
                Bundle bundle = plugin.getBundle();
                LOGGER.debug("bundle="+bundle);
//                URL url = FileLocator.find(bundle, file, new HashMap());
//                LOGGER.debug("url="+url);
//                input = url.openStream();
                input = FileLocator.openStream(bundle, file, false);
                LOGGER.debug("input="+input);
                
//                URL baseURL = XMDLIDAPlugin.INSTANCE.getBaseURL();
//                LOGGER.debug("baseURL="+baseURL);
//                URL file = new URL(baseURL, "/extras/extras.zip");
//                LOGGER.debug("file="+file);
//                input = file.openStream();
            } catch (Exception e) {
                LOGGER.debug("Exception :" + targetBase, e);
            }
            
            UnzipTask unzipTask = new UnzipTask(input, targetBase);
            unzipTask.setFilenameReplacement(filenameReplacement);
            predecessorTasks.add(unzipTask);
        }
        return predecessorTasks;
    }

    @Override
    public List<Task> createSuccessorTasks(XProject project, List<EObject> list) {
        if (successorTasks == null) {
            successorTasks = new ArrayList<Task>();
        }
        return successorTasks;
    }

    private void init() {
        try {
            if (templates == null) {
                templates = new ArrayList<Template>();
                templates.clear();

                // eclipse project files
                templates.add(new Classpath());// project .classpath

                // build
                templates.add(new RootPomXML());// project pom.xml
                templates.add(new CorePomXML());// core module pom.xml
                templates.add(new WebPomXML());// web module pom.xml

                // Project General
                templates.add(new Constants());

                // model
                templates.add(new Entity());
                templates.add(new EntitySearch());
                templates.add(new Enumeration());

                // dao
                templates.add(new EntityDAO());
                templates.add(new EntityDAOHibernate());

                // service
                templates.add(new EntityService());
                templates.add(new EntityServiceImplementation());

                // core.resources
                templates.add(new HibernateCFG());
                templates.add(new DefaultDataXML());
                templates.add(new ApplicationContextServiceXML());
                templates.add(new ApplicationContextDAOXML());

                // core tests
                templates.add(new HibernateConfigurationTest());
                templates.add(new EntityDAOTest());
                templates.add(new EntityServiceTest());

                // core test resources
                templates.add(new ApplicationContextResourcesXML());
                templates.add(new ApplicationContextTestXML());
                templates.add(new JDBCProperties());
                templates.add(new CoreTestLog4jXML());
                templates.add(new MailProperties());
                templates.add(new PersistenceXML());
                templates.add(new CoreTestSampleDataXML());

                //tapestry resources
                templates.add(new SiteXML());
                
                // web module sources
                templates.add(new EntityAction());
                templates.add(new ReloadAction());
                templates.add(new StartupListener());
                templates.add(new ConstantsTag());
                templates.add(new ConstantsTei());

                // web module resources
                templates.add(new ApplicationContextResourcesXMLWeb());
                templates.add(new ApplicationResourcesProperties());
                templates.add(new HibernateCfgXML());
                templates.add(new WebMainLog4jXML());
                templates.add(new MailPropertiesWeb());
                templates.add(new StrutsEntityXML());
                templates.add(new StrutsXML());
                templates.add(new ActionValidationXML());
                templates.add(new EntityValidationXML());
                templates.add(new Dummy());

                // WEB-INF resources
                templates.add(new ApplicationContextHibernateXML());
                templates.add(new MenuConfigXML());
                templates.add(new ResinWebXML());
                templates.add(new TaglibTLD());
                templates.add(new WebXML());

                // jsp files
                templates.add(new EntityFormJSP());
                templates.add(new EntityListJSP());
                templates.add(new MenuJSP());
                templates.add(new TaglibsJSP());
                
                //web tests
                templates.add(new EntityActionTest());
                templates.add(new StartupListenerTest());
                templates.add(new WebApplicationContextDAOXML());
                templates.add(new WebApplicationContextServiceXML());
                templates.add(new WebTestLog4jXML());
                templates.add(new WebSampleDataXML());
                templates.add(new WebTestsXML());
            }
        } catch (Throwable e) {
            LOGGER.warn("FATAL ", e);
        }
    }

}
