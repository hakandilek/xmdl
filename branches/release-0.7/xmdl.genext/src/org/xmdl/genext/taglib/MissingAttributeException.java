package org.xmdl.genext.taglib;

import java.text.MessageFormat;

import org.eclipse.jet.taglib.JET2TagException;
import org.xmdl.genext.internal.l10n.GenExtMessages;

/**
 * Exception denoting a missing (required) attribute with a localized message.
 * 
 * @author Hakan Dilek
 * 
 */
public class MissingAttributeException extends JET2TagException {

    /**
     * Unique serialization ID
     */
    private static final long serialVersionUID = -8161388119762943222L;

    /** name of the missing attribute */
    private String attributeName;

    /**
     * Public constructor.
     * 
     * @param attributeName
     *            name of the missing attribute
     */
    public MissingAttributeException(String attributeName) {
        super();
        this.attributeName = attributeName;
    }

    public String getLocalizedMessage() {
        return buildMessage();
    }

    public String getMessage() {
        return buildMessage();
    }

    public String toString() {
        return buildMessage();
    }

    private String buildMessage() {
        return MessageFormat.format(getPattern(), getArgs());
    }

    private Object[] getArgs() {
        String args[] = new String[] { attributeName, };
        return args;
    }

    private String getPattern() {
        return GenExtMessages.TagLib_MissingAttribute;
    }

}
