package chrome.xmdl.lib.bo;

import org.apache.commons.chain.web.ChainListener;
import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.config.ConfigParser;
import org.apache.commons.chain.impl.CatalogBase;
import org.apache.commons.digester.RuleSet;
import org.springframework.core.io.Resource;

/**
 * @author hd
 */
public class CommandFactoryBean extends ChainListener {
    private Resource[] locations;
    private String ruleSet;

    public void setLocations(Resource[] locations) {
        this.locations = locations;
    }

    public void setRuleSet(String ruleSet) {
        this.ruleSet = ruleSet;
    }

    public CommandFactoryBean() {
        initialize();
    }

    protected void initialize() {
        Catalog catalog = createCatalog();
        // Construct the configuration resource parser we will use
        ConfigParser parser = new ConfigParser();
        if (ruleSet != null) {
            try {
                ClassLoader loader =
                    Thread.currentThread().getContextClassLoader();
                if (loader == null) {
                    loader = this.getClass().getClassLoader();
                }
                Class clazz = loader.loadClass(ruleSet);
                parser.setRuleSet((RuleSet) clazz.newInstance());
            } catch (Exception e) {
                throw new RuntimeException("Exception initalizing RuleSet '"
                                           + ruleSet + "' instance: "
                                           + e.getMessage());
            }
        }

        // Parse the resources specified in our init parameters (if any)
//        if (attr == null) {
//            parseJarResources(context, parser);
//            ChainResources.parseClassResources
//                (classResources, parser);
//            ChainResources.parseWebResources
//                (context, webResources, parser);
//        } else {
//            parseJarResources(catalog, context, parser);
//            ChainResources.parseClassResources
//                (catalog, classResources, parser);
//            ChainResources.parseWebResources
//                (catalog, context, webResources, parser);
//        }

    }

    protected Catalog createCatalog() {
        Catalog catalog = null;
        catalog = new CatalogBase();
        return catalog;
    }
}
