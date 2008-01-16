package org.xmdl.lib.helper;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.log4j.Logger;

/**
 * DummyCommand.
 *
 * @author tr1a3571
 * @version 1.0
 */
public class DummyCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger(DummyCommand.class);
    private String log=null;
    public boolean execute(Context context) throws Exception {
        LOGGER.debug(log);
        context.put(log,new Boolean(true));
        return false;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}
