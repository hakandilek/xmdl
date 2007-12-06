package org.xmdl.ida.platform;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
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
import org.xmdl.ida.templates.core.test.rsc.JDBCProperties;
import org.xmdl.ida.templates.core.test.rsc.Log4jXML;
import org.xmdl.ida.templates.core.test.rsc.MailProperties;
import org.xmdl.ida.templates.core.test.rsc.PersistenceXML;
import org.xmdl.ida.templates.core.test.rsc.SampleDataXML;
import org.xmdl.ida.templates.eclipse.Classpath;
import org.xmdl.ida.templates.maven.CorePomXML;
import org.xmdl.ida.templates.maven.RootPomXML;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.AbstractTaskFactory;
import chrome.xmdl.xgen.Task;
import chrome.xmdl.xgen.TaskFactory;
import chrome.xmdl.xgen.Template;

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

    private static final Logger LOGGER = Logger
            .getLogger(IDATaskFactory.class);

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
        if (predecessorTasks == null){
            predecessorTasks = new ArrayList<Task>();
        }
        return predecessorTasks;
    }

    @Override
    public List<Task> createSuccessorTasks(XProject project, List<EObject> list) {
        if (successorTasks == null){
            successorTasks = new ArrayList<Task>();
        }
        return successorTasks;
    }

    private void init() {
        try {
            if (templates == null) {
                templates = new ArrayList<Template>();
                templates.clear();

                //eclipse project files
                templates.add(new Classpath());//project .classpath
                
                // build
                templates.add(new RootPomXML());//project pom.xml
                templates.add(new CorePomXML());//core module pom.xml

                //Project General
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

                //jsp

                //core tests
                templates.add(new HibernateConfigurationTest());
                templates.add(new EntityDAOTest());
                templates.add(new EntityServiceTest());
                
                //core test resources
                templates.add(new ApplicationContextResourcesXML());
                templates.add(new ApplicationContextTestXML());
                templates.add(new JDBCProperties());
                templates.add(new Log4jXML());
                templates.add(new MailProperties());
                templates.add(new PersistenceXML());
                templates.add(new SampleDataXML());
            }
        } catch (Throwable e) {
            LOGGER.warn("FATAL ", e);
        }
    }

}
