package xmdl.genext.test;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class TestApplication implements IApplication {

    @Override
    public Object start(IApplicationContext context) throws Exception {
        return IApplication.EXIT_OK;
    }

    @Override
    public void stop() {
    }

}
