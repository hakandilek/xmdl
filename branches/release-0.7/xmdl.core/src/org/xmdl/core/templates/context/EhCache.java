package org.xmdl.core.templates.context;

import org.xmdl.xgen.TemplateConfiguration;
import org.xmdl.xmdl.XProject;
import org.xmdl.core.templates.context.impl.EhCacheImpl;


public class EhCache extends EhCacheImpl implements TemplateConfiguration{

	public String targetFile(Object object) {
		StringBuffer buffer= new StringBuffer("rsc/");
		buffer.append("ehcache.xml");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XProject) ;
	}

}
