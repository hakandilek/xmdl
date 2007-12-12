package chrome.xmdl.meta;

import chrome.xmdl.XAttribute;
import chrome.xmdldb.DField;

public class LocateColumnFromAttribute extends AbstractLocator<XAttribute, DField> {

    public LocateColumnFromAttribute(XAttribute x) {
        super(x);
    }

    @Override
    protected boolean matches(DField d) {
        XAttribute a = d.getXAttribute();
        if (a == null)
            return false;
        return a.equals(getMatch());
    }

    @Override
    public boolean visitEnter(DField d) {
        return true;
    }

    @Override
    public boolean visitLeave(DField d) {
        return true;
    }

    @Override
    public boolean visit(DField d) {
        return enter(d);
    }

}
