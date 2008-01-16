package org.xmdl.lib.ui.web.filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/**
 * Servlet Filter that applies given encoding and locale to the servlet
 *  request & response.
 * @see ServletRequest#setCharacterEncoding
 * @see ServletResponse#setLocale
 *
 * @author hd
 * @version 1.0
 * created  : Jun 25, 2003
 * modified : Jun 25, 2003
 */
public class CharacterEncodingFilter implements Filter {
    /**
     * Request Character Encoding in String representation
     */
    protected String encoding;

    /**
     * Response locale in String representation
     */
    protected String locale;

    /**
     * Filter ignore parameter
     */
    protected boolean ignore;

    public static final String DEFAULT_ENCODING = "ISO-8859-9";
    public static final Locale DEFAULT_LOCALE = new Locale("tr", "TR");

    public CharacterEncodingFilter() {
        encoding = "";
        ignore = true;
    }

    public void init(FilterConfig filterConfig) throws ServletException {
//        this.filterConfig = filterConfig;
        encoding = filterConfig.getInitParameter("encoding");
        String value = filterConfig.getInitParameter("ignore");
        if (value == null
                || value.equalsIgnoreCase("true")
                || value.equalsIgnoreCase("yes")
        )
            ignore = true;
        else
            ignore = false;
        System.out.println("!! @filterInit: [encoding=" + encoding + ", ignore=" + ignore + "]");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (ignore || request.getCharacterEncoding() == null) {
            String encoding = getEncoding();
            try {
                request.setCharacterEncoding(encoding);
                //todo not sure whether necessary
                response.setLocale(getLocale());
            } catch (UnsupportedEncodingException e) {
                request.setCharacterEncoding(DEFAULT_ENCODING);
            }
        }
        chain.doFilter(request, response);
    }


    public void destroy() {
        encoding = null;
        locale = null;
    }

    private Locale getLocale() {
        return (locale!=null&& locale.trim().length()>0)
                ? new Locale(locale, locale.toUpperCase())
                : DEFAULT_LOCALE;
    }

    protected String getEncoding() {
        return encoding;
    }
}
