package org.xmdl.genext.internal.l10n;

import org.eclipse.osgi.util.NLS;

/**
 * Localized message container. Those messages are automatically loaded by the
 * plugin.
 * 
 * @author Hakan Dilek
 * 
 */
public class GenExtMessages extends NLS {

    private static final String BUNDLE_NAME = "org.xmdl.genext.internal.l10n.GenExtMessages"; //$NON-NLS-1$

    private GenExtMessages() {
    }

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, GenExtMessages.class);
    }

    /** used to denote a missing attribute */
    public static String TagLib_MissingAttribute;

}
