package org.xmdl.lib.test;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import org.xmdl.lib.dao.BasicIdentifier;
import org.xmdl.lib.dao.Entity;
import org.xmdl.lib.dao.Identifier;
import org.xmdl.lib.helper.ConvertUtil;

import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Base class for running EntityService (BO) tests.
 *
 * @author hd
 */
public abstract class BaseServiceTest <E extends Entity> extends AbstractTransactionalDataSourceSpringContextTests {
    private static final Log LOGGER = LogFactory.getLog(BaseServiceTest.class);

    protected ResourceBundle rb;

    protected Identifier identifier = newIdentifier();

    protected String[] getConfigLocations() {
        return new String[]{
            "classpath*:/**/applicationContext-*.xml",
        };
    }


    protected Identifier newIdentifier() {
        BasicIdentifier identifier = new BasicIdentifier();
        LOGGER.debug("identifier = " + identifier);
        return identifier;
    }

    //~ Constructors ===========================================================

    public BaseServiceTest() {
        LOGGER.debug("BaseServiceTest.BaseServiceTest");
        Locale defaultLocale = Locale.ENGLISH;
        LOGGER.info("Setting defaultLocale = " + defaultLocale);
        Locale.setDefault(defaultLocale);

        // Since a ResourceBundle is not required for each class, just
        // do a simple check to see if one exists
        String className = this.getClass().getName();
        LOGGER.debug("className = " + className);
        try {
            rb = ResourceBundle.getBundle(className);
        } catch (MissingResourceException mre) {
            LOGGER.warn("No resource bundle found for: " + className);
        }
    }

    //~ Methods ================================================================

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
}
