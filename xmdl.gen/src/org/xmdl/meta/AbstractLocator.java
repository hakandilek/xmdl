package org.xmdl.meta;

import org.xmdl.xmdldb.impl.DVisitorBaseImpl;

public abstract class AbstractLocator<X, D> extends DVisitorBaseImpl {

	private final X match;
	private D found;

	public AbstractLocator(X x) {
		super();
		this.match = x;
	}
	
	public boolean enter(D d) {
		if (matches(d)) {
			found = d;
			return false;
		}
		return true;
	}

	public boolean leave(D d) {
		return found == null;
	}
	
    public abstract boolean visitEnter(D d);

    public abstract boolean visitLeave(D d);

    public abstract boolean visit(D d);

    protected abstract boolean matches(D d);

	public D getFound() {
		return found;
	}

	public X getMatch() {
		return match;
	}
	
}
