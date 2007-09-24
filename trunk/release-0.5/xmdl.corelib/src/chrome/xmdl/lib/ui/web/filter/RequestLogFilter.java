package chrome.xmdl.lib.ui.web.filter;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by IntelliJ IDEA.
 * User: TR1D2643
 * Date: 06.Oca.2006
 * Time: 15:31:15
 * To change this template use File | Settings | File Templates.
 */
public class RequestLogFilter implements Filter {
    private static final Log LOGGER = LogFactory.getLog(RequestLogFilter.class);

    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.info("RequestLogFilter initialized.");
    }

    @SuppressWarnings("unchecked")
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (LOGGER.isDebugEnabled()) {
            StringBuffer sb = new StringBuffer();
            Enumeration<String> names;
            sb.append("Logging : \n");
            names = request.getParameterNames();
            sb.append("--- Request Parameters: ---\n");
            while (names.hasMoreElements()) {
                String name = names.nextElement();
                sb.append("\t").append(name)
                        .append(":").append(request.getParameter(name))
                        .append("\n");
            }

            names = request.getAttributeNames();
            sb.append("--- Request Attributes: ---\n");
            while (names.hasMoreElements()) {
                String name = names.nextElement();
                sb.append("\t").append(name)
                        .append(":").append(request.getAttribute(name))
                        .append("\n");
            }

            LOGGER.debug(sb.toString());
        }
        chain.doFilter(request, response);
    }

    public void destroy() {
        LOGGER.debug("RequestLogFilter destroyed.");
    }
}
