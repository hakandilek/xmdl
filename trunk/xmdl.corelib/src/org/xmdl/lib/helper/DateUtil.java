package org.xmdl.lib.helper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.i18n.LocaleContextHolder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Date Utility Class
 * This is used to convert Strings to Dates and Timestamps
 * <p/>
 * <p/>
 * <a href="DateUtil.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 *         Modified by <a href="mailto:dan@getrolling.com">Dan Kibler </a>
 *         to correct time pattern. Minutes should be mm not MM
 *         (MM is month).
 * @version $Revision: 1.3 $ $Date: 2006/02/13 17:04:11 $
 */
public class DateUtil implements GeneralConstants {
    //~ Static fields/initializers =============================================

    private static Log LOGGER = LogFactory.getLog(DateUtil.class);

    private static String defaultDatePattern = null;
    private static String defaultTimePattern = null;
    private static String timePattern = "HH:mm";

    //~ Methods ================================================================

    /**
     * Return default datePattern (MM/dd/yyyy)
     *
     * @return a string representing the date pattern on the UI
     */
    public static synchronized String getDatePattern() {
        Locale locale = LocaleContextHolder.getLocale();
        LOGGER.debug("locale = " + locale);
        try {
            String pattern = ResourceBundle.getBundle(GeneralConstants.BUNDLE_KEY, locale)
                                .getString("date.format");
            LOGGER.debug("pattern = " + pattern);
            defaultDatePattern = pattern;
        } catch (MissingResourceException mse) {
            try {
                LOGGER.debug("trying with no locale.");
                String pattern = ResourceBundle.getBundle(GeneralConstants.BUNDLE_KEY).getString("date.format");
                LOGGER.debug("pattern = " + pattern);
                defaultDatePattern = pattern;
            } catch (MissingResourceException e) {
                defaultDatePattern = "MM/dd/yyyy";
                LOGGER.warn("missing resource, using date pattern = " + defaultDatePattern);
            }
        }

        return defaultDatePattern;
    }

    /**
     * Return default datePattern (MM/dd/yyyy HH:mm)
     *
     * @return a string representing the date pattern on the UI
     */
    public static synchronized String getTimePattern() {
        Locale locale = LocaleContextHolder.getLocale();
        LOGGER.debug("locale = " + locale);
        try {
            String pattern = ResourceBundle.getBundle(GeneralConstants.BUNDLE_KEY, locale)
                                .getString("time.format");
            LOGGER.debug("pattern = " + pattern);
            defaultTimePattern = pattern;
        } catch (MissingResourceException mse) {
            try {
                LOGGER.debug("trying with no locale.");
                String pattern = ResourceBundle.getBundle(GeneralConstants.BUNDLE_KEY).getString("time.format");
                LOGGER.debug("pattern = " + pattern);
                defaultTimePattern = pattern;
            } catch (MissingResourceException e) {
                defaultTimePattern = "MM/dd/yyyy HH:mm";
                LOGGER.warn("missing resource, using default pattern = " + defaultDatePattern);
            }
        }

        return defaultTimePattern;
    }

    /**
     * This method attempts to convert an Oracle-formatted date
     * in the form dd-MMM-yyyy to mm/dd/yyyy.
     *
     * @param aDate date from database as a string
     * @return formatted string for the ui
     */
    public static final String getDate(Date aDate) {
        SimpleDateFormat df = null;
        String returnValue = "";

        if (aDate != null) {
            df = new SimpleDateFormat(getDatePattern());
            returnValue = df.format(aDate);
        }

        return (returnValue);
    }

    /**
     * This method generates a string representation of a date/time
     * in the format you specify on input
     *
     * @param aMask   the date pattern the string is in
     * @param strDate a string representation of a date
     * @return a converted Date object
     * @throws ParseException
     * @see java.text.SimpleDateFormat
     */
    public static final Date convertStringToDate(String aMask, String strDate)
            throws ParseException {
        SimpleDateFormat df = null;
        Date date = null;
        df = new SimpleDateFormat(aMask);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("converting '" + strDate + "' to date with mask '"
                    + aMask + "'");
        }

        try {
            date = df.parse(strDate);
        } catch (ParseException pe) {
            //LOGGER.error("ParseException: " + pe);
            throw new ParseException(pe.getMessage(), pe.getErrorOffset());
        }

        return (date);
    }

    /**
     * This method returns the current date time in the format:
     * MM/dd/yyyy HH:MM a
     *
     * @param theTime the current time
     * @return the current date/time
     */
    public static String getTimeNow(Date theTime) {
        return getDateTime(timePattern, theTime);
    }

    /**
     * This method returns the current date in the format: MM/dd/yyyy
     *
     * @return the current date
     * @throws ParseException
     */
    public static Calendar getToday() throws ParseException {
        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat(getDatePattern());

        // This seems like quite a hack (date -> string -> date),
        // but it works ;-)
        String todayAsString = df.format(today);
        Calendar cal = new GregorianCalendar();
        cal.setTime(convertStringToDate(todayAsString));

        return cal;
    }

    /**
     * This method generates a string representation of a date's date/time
     * in the format you specify on input
     *
     * @param aMask the date pattern the string is in
     * @param aDate a date object
     * @return a formatted string representation of the date
     * @see java.text.SimpleDateFormat
     */
    public static final String getDateTime(String aMask, Date aDate) {
        SimpleDateFormat df = null;
        String returnValue = "";

        if (aDate == null) {
            LOGGER.error("aDate is null!");
        } else {
            df = new SimpleDateFormat(aMask);
            returnValue = df.format(aDate);
        }

        return (returnValue);
    }

    /**
     * This method generates a string representation of a date based
     * on the System Property 'dateFormat'
     * in the format you specify on input
     *
     * @param aDate A date to convert
     * @return a string representation of the date
     */
    public static final String convertDateToString(Date aDate) {
        return getDateTime(getDatePattern(), aDate);
    }

    /**
     * This method converts a String to a date using the datePattern
     *
     * @param strDate the date to convert (in format MM/dd/yyyy)
     * @return a date object
     * @throws ParseException
     */
    public static Date convertStringToDate(String strDate)
            throws ParseException {
        Date aDate = null;

        try {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("converting date with pattern: " + getDatePattern());
            }

            aDate = convertStringToDate(getDatePattern(), strDate);
        } catch (ParseException pe) {
            LOGGER.error("Could not convert '" + strDate
                    + "' to a date, throwing exception");
            pe.printStackTrace();
            throw new ParseException(pe.getMessage(),
                    pe.getErrorOffset());

        }

        return aDate;
    }
}
