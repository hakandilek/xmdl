package org.xmdl.lib.test;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mock.web.MockServletContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.xmdl.lib.dao.BasicIdentifier;
import org.xmdl.lib.dao.Entity;
import org.xmdl.lib.dao.Identifier;
import org.xmdl.lib.helper.ConvertUtil;

import servletunit.struts.MockStrutsTestCase;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;


/**
 * This class is extended by all ActionTests.  It basically
 * contains common methods that they might use.
 *
 *
 * @author hd
 * @version $Id: BaseActionTest.java,v 1.3 2006/02/13 08:36:26 tr001\tr1d2643 Exp $
 */
public abstract class BaseActionTest<E extends Entity> extends MockStrutsTestCase {
    private static final Log LOGGER = LogFactory.getLog(BaseActionTest.class);

    //~ Instance fields ========================================================

    protected final Log log = LogFactory.getLog(getClass());
    protected ResourceBundle rb = null;
    protected WebApplicationContext ctx = null;

    protected Identifier identifier = newIdentifier();

    //~ Constructors ===========================================================

    public BaseActionTest(String name) {
        super(name);
        // Since a ResourceBundle is not required for each class, just
        // do a simple check to see if one exists
        String className = this.getClass().getName();

        try {
            rb = ResourceBundle.getBundle(className);
        } catch (MissingResourceException mre) {
            //log.warn("No resource bundle found for: " + className);
        }
    }

    //~ Methods ================================================================

    protected void setUp() throws Exception {
        super.setUp();

        // initialize Spring
//        String pkg = ClassUtils.classPackageAsResourcePath(Constants.class);
        MockServletContext sc = new MockServletContext("");
        sc.addInitParameter(ContextLoader.CONFIG_LOCATION_PARAM,
                "classpath*:/**/applicationContext-*.xml");

        ServletContextListener contextListener = new ContextLoaderListener();
        ServletContextEvent event = new ServletContextEvent(sc);
        contextListener.contextInitialized(event);

        // magic bridge to make StrutsTestCase aware of Spring's Context
        getSession().getServletContext().setAttribute(
                WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE,
                sc.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE));

        ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(
        		    getSession().getServletContext());

    }

    public void tearDown() throws Exception {
        super.tearDown();
        ctx = null;
    }

    /**
     * Utility method to populate a javabean-style object with values
     * from a Properties file
     *
     * @param obj
     * @return
     * @throws Exception
     */
    protected E populate(E obj) throws Exception {
        // loop through all the beans methods and set its properties from
        // its .properties file
        Map<String, String> map = ConvertUtil.convertBundleToMap(rb);

        BeanUtils.copyProperties(obj, map);
        LOGGER.debug("obj = " + obj);
        return obj;
    }

    protected Identifier newIdentifier() {
        return new BasicIdentifier();
    }
    
}
