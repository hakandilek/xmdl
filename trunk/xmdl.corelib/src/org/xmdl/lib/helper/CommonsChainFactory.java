package org.xmdl.lib.helper;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.context.ApplicationContext;

import org.apache.commons.chain.Chain;
import org.apache.commons.chain.impl.ChainBase;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * CommonsChainFactory.
 *
 * @author tr1a3571
 * @version 1.0
 */
public class CommonsChainFactory extends AbstractFactoryBean implements org.springframework.context.ApplicationContextAware{
    private static final Logger LOGGER = Logger.getLogger(CommonsChainFactory.class);
    private String[] commandNames;
    private ApplicationContext applicationContext=null;

    public void setCommandNames(String[] commandNames) {
        this.commandNames = commandNames;
    }

    protected Object createInstance() throws Exception {
        if(commandNames==null){
            LOGGER.error("Commmand Names expepected");
            throw new RuntimeException("Commmand Names expepected");
        }
        String[] strings = commandNames/*.split(",")*/;
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < strings.length; i++) {
            String name = strings[i];
            Object bean = applicationContext.getBean(name);
            if(bean==null){
                LOGGER.warn("Bean with name '"+name+"' not found");
                throw new IllegalArgumentException("Bean with name '"+name+"' not found");
            }
            list.add(bean);
        }
        return new ChainBase(list);
    }

    public Class<?> getObjectType() {
        return Chain.class;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}
