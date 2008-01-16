package org.xmdl.genext;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.JET2TemplateManager.ITemplateRunner;
import org.osgi.framework.Bundle;
import org.xmdl.xgen.JET1TemplateWrapper;


/**
 * Implementation of {@link ITemplateRunner}. and The Template loader
 * implementation that can fetch the template from the Bundle, class loader.
 */
public class TemplateRunner implements ITemplateRunner, JET2TemplateLoader {

    private final String pluginID;

    public TemplateRunner(String pluginID) {
        super();
        this.pluginID = pluginID;
    }

    public String getPluginID() {
        return pluginID;
    }

    public void generate(String className, JET2Context context, JET2Writer out) {
        JET2Template template = getTemplate(className);

        if (template == null) {
            throw new IllegalArgumentException();
        }

        template.generate(context, out);
    }

    @Override
    public JET2Template getTemplate(String className) {
        Bundle bundle = Platform.getBundle(pluginID);
        try {
            Class<?> templateClass = bundle.loadClass(className);
            if (JET2Template.class.isAssignableFrom(templateClass)) {
                return (JET2Template) templateClass.newInstance();
            } else {
                @SuppressWarnings("unchecked")
                Class<?> template = (Class<?>) templateClass;
                return new JET1TemplateWrapper(template);
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
