package chrome.xmdl.lib.test;

import java.util.*;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.*;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import chrome.xmdl.lib.dao.*;

/**
 * Base class for running DAO tests.
 *
 * @author hd
 */
public abstract class BaseDAOTestCase <E extends Entity> extends AbstractTransactionalDataSourceSpringContextTests {

    protected final Log LOGGER = LogFactory.getLog(getClass());
    
    protected ResourceBundle rb;

    protected Identifier identifier = newIdentifier();

    protected String[] getConfigLocations() {
        return new String[]{
            "classpath*:/**/dao/applicationContext-*.xml",
            "classpath*:/**/applicationContext-*.xml",
        };
    }


    protected Identifier newIdentifier() {
        return new BasicIdentifier();
    }


    public BaseDAOTestCase() {
        Locale.setDefault(Locale.ENGLISH);

        // Since a ResourceBundle is not required for each class, just
        // do a simple check to see if one exists
        String className = getClass().getName();

        try {
            rb = ResourceBundle.getBundle(className);
        } catch (MissingResourceException mre) {
            //LOGGER.warn("No resource bundle found for: " + className);
        }
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
        Map map = new HashMap();

        for (Enumeration keys = rb.getKeys(); keys.hasMoreElements();) {
            String key = (String) keys.nextElement();
            map.put(key, rb.getString(key));
        }

        BeanUtils.copyProperties(obj, map);

        return obj;
    }
}