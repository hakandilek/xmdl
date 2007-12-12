package chrome.xmdl.meta;

import chrome.xmdl.XClass;
import chrome.xmdldb.DTable;

/**
 * Local class used to locate related {@link DTable} of a {@link XClass}}
 * 
 * @author Hakan Dilek
 * 
 */
class LocateTableFromClass extends AbstractLocator<XClass, DTable> {

	public LocateTableFromClass(XClass x) {
		super(x);
	}

	protected boolean matches(DTable d) {
		XClass c = d.getXClass();
		if (c == null)
			return false;
		return c.equals(getMatch());
	}

    @Override
    public boolean visitEnter(DTable d) {
        return enter(d);
    }

    @Override
    public boolean visitLeave(DTable d) {
        return leave(d);
    }

    
}
