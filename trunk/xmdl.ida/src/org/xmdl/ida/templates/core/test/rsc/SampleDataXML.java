package org.xmdl.ida.templates.core.test.rsc;

import chrome.xmdl.xgen.Template;
import chrome.xmdldb.DModel;

/**
 * Sample data configuration template file
 * 
 * @author Hakan Dilek
 *
 */
public class SampleDataXML extends SampleDataXMLImpl implements Template {

    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer("core/src/test/resources/sample-data.xml");
        return buffer.toString();
    }

    public boolean accept(Object object) {
        return (object instanceof DModel);
    }

}
