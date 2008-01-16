package org.xmdl.lib.helper;

import org.springframework.context.i18n.LocaleContextHolder;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import java.text.DecimalFormat;

/**
 * $Id: CurrencyUtil.java,v 1.1 2006/01/26 13:21:00 tr001\tr1d2643 Exp $
 * Created: 26.Oca.2006 12:32:43
 *
 * @author hd
 */
public class CurrencyUtil {
    private static final Log LOGGER = LogFactory.getLog(CurrencyUtil.class);

    private static final String CURRENCY_FORMAT_KEY = "currency.format";

    private static String defaultCurrencyPattern = "###,###.00";
    private static String currencyPattern = null;

    private static DecimalFormat format = null;


    /**
     * Return default datePattern (MM/dd/yyyy)
     *
     * @return a string representing the date pattern on the UI
     */
    public static synchronized String getCurrencyPattern() {
        Locale locale = LocaleContextHolder.getLocale();
        LOGGER.debug("locale = " + locale);
        try {
            String pattern = ResourceBundle.getBundle(GeneralConstants.BUNDLE_KEY, locale)
                    .getString(CURRENCY_FORMAT_KEY);
            LOGGER.debug("pattern = " + pattern);
            currencyPattern = pattern;
        } catch (MissingResourceException mse) {
            try {
                LOGGER.debug("trying with no locale.");
                String pattern = ResourceBundle.getBundle(GeneralConstants.BUNDLE_KEY).getString(CURRENCY_FORMAT_KEY);
                LOGGER.debug("pattern = " + pattern);
                currencyPattern = pattern;
            } catch (MissingResourceException e) {
                currencyPattern = defaultCurrencyPattern;
                LOGGER.warn("missing resource, using date pattern = " + defaultCurrencyPattern);
            }
        }

        return currencyPattern;
    }

    public static DecimalFormat getFormat() {
        if (format == null){
            String currencyPattern = getCurrencyPattern();
            format = new DecimalFormat(currencyPattern);
        }
        return format;
    }
}
