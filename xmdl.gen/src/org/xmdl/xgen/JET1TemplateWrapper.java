package org.xmdl.xgen;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

/**
 * Used to easily wrap and reuse JET1 templates as in JET2 structure.
 * 
 * @author Hakan Dilek
 *
 */
public class JET1TemplateWrapper implements JET2Template {

    private static final String JET1_ARGUMENT_CONTEXT_VAR = "argument"; //$NON-NLS-1$
    
    private final Object template;
    private final Method generateMethod;

    public JET1TemplateWrapper(Class<?> templateClass)
            throws SecurityException, NoSuchMethodException,
            InstantiationException, IllegalAccessException {
        template = templateClass.newInstance();
        generateMethod = templateClass.getMethod(
                "generate", new Class[] { Object.class }); //$NON-NLS-1$
    }

    public void generate(JET2Context context, JET2Writer out) {

        Object arg = context.hasVariable(JET1_ARGUMENT_CONTEXT_VAR) ? context
                .getVariable(JET1_ARGUMENT_CONTEXT_VAR) : null;
        try {
            Object result = generateMethod.invoke(template,
                    new Object[] { arg });
            out.write(result != null ? result.toString() : ""); //$NON-NLS-1$
        } catch (IllegalArgumentException e) {
            context.logError(e.getCause());
        } catch (IllegalAccessException e) {
            context.logError(e.getCause());
        } catch (InvocationTargetException e) {
            context.logError(e.getCause());
        }
    }

}
