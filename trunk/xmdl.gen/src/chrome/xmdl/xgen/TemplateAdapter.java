package chrome.xmdl.xgen;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;

/**
 * The adapter used to adapt JET1 templates to JET2 template structure
 * 
 * @author Hakan Dilek
 * 
 */
public class TemplateAdapter implements Template {

    private static final String JET1_ARGUMENT_CONTEXT_VAR = "argument"; //$NON-NLS-1$
    

    private final TemplateConfiguration configuration;

    public TemplateAdapter(TemplateConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public boolean accept(Object object) {
        return configuration.accept(object);
    }

    @Override
    public String targetFile(Object object) {
        return configuration.targetFile(object);
    }

    @Override
    public void generate(JET2Context context, JET2Writer out) {
        Object arg = context.hasVariable(JET1_ARGUMENT_CONTEXT_VAR) ? context
                .getVariable(JET1_ARGUMENT_CONTEXT_VAR) : null;
        try {
            Method generateMethod = configuration.getClass().getMethod(
                    "generate", new Class[] { Object.class }); //$NON-NLS-1$
            Object result = generateMethod.invoke(configuration,
                    new Object[] { arg });
            out.write(result != null ? result.toString() : ""); //$NON-NLS-1$
        } catch (IllegalArgumentException e) {
            context.logError(e.getCause());
        } catch (IllegalAccessException e) {
            context.logError(e.getCause());
        } catch (InvocationTargetException e) {
            context.logError(e.getCause());
        } catch (SecurityException e) {
            context.logError(e.getCause());
        } catch (NoSuchMethodException e) {
            context.logError(e.getCause());
        }
        
    }

	@Override
	public String parameterName() {
		return JET1_ARGUMENT_CONTEXT_VAR;
	}

}
