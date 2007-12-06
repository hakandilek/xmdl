package org.xmdl.genext;

import org.eclipse.jet.BodyContentWriter;
import org.eclipse.jet.BufferedJET2Writer;
import org.eclipse.jet.IWriterListener;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2TemplateManager.ITemplateRunner;
import org.eclipse.jet.transform.TransformContextExtender;


import junit.framework.TestCase;

public class BaseTemplateTestCase extends TestCase {
    private String pluginID;
    private JET2Context context;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        pluginID = "xmdl.genext.test";
        context = new JET2Context(null);
        // Set up a context extender... ???
        TransformContextExtender.getInstance(context);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        pluginID = null;
        context = null;
    }

    protected void setVariable(String name, Object value) {
        getContext().setVariable(name, value);
    }

    protected String runTemplate(String templateClass) {
        final BufferedJET2Writer out = new BodyContentWriter();

        String pluginID = getPluginID();
        JET2Context context = getContext();

        ITemplateRunner templateRunner = new TemplateRunner(pluginID);
        
        
        templateRunner.generate(templateClass, context, out);

        final IWriterListener[] eventListeners = out.getEventListeners();
        for (int i = 0; i < eventListeners.length; i++)
        {
          eventListeners[i].finalizeContent(out, null);
        }

        String output = out.getContent();
        
        for (int i = 0; i < eventListeners.length; i++)
        {
          eventListeners[i].postCommitContent(out, output);
        }

        return output;
    }

    public String getPluginID() {
        return pluginID;
    }

    public void setPluginID(String pluginID) {
        this.pluginID = pluginID;
    }

    public JET2Context getContext() {
        return context;
    }

    public void setContext(JET2Context context) {
        this.context = context;
    }

}
