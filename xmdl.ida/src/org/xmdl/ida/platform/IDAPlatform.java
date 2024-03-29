package org.xmdl.ida.platform;

import org.xmdl.xgen.AbstractPlatform;
import org.xmdl.xgen.TaskFactory;

/**
 * Ida platform definition
 * 
 * @author Hakan Dilek
 *
 */
public class IDAPlatform extends AbstractPlatform {

    private TaskFactory taskFactory = new IDATaskFactory();

    @Override
    public TaskFactory taskFactory() {
        return taskFactory;
    }

    @Override
    public String name() {
        return "IDA";
    }

    @Override
    public String description() {
        return "@author Kemal Dogan, Hakan Dilek, Omer Basar";
    }

    @Override
    public String version() {
        return "1.0.0";
    }

	@Override
	public String id() {
		return "org.xmdl.ida";
	}

}
