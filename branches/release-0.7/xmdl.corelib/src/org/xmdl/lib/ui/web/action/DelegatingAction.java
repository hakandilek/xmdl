package org.xmdl.lib.ui.web.action;

import org.springframework.web.struts.DelegatingActionProxy;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.config.ModuleConfig;

import javax.servlet.ServletContext;

/**
 * @author mca
 * @author hd
 */
public class DelegatingAction extends DelegatingActionProxy{
    protected WebApplicationContext getWebApplicationContext(ActionServlet actionServlet, ModuleConfig moduleConfig) throws IllegalStateException {
//        System.out.println("DelegatingAction.getWebApplicationContext");
        ServletContext servletContext = actionServlet.getServletContext();
//        System.out.println("servletContext = " + servletContext);
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
//        System.out.println("webApplicationContext = " + webApplicationContext);
        return webApplicationContext;
    }
}
