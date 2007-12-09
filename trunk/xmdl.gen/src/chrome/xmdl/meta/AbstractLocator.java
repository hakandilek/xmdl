package chrome.xmdl.meta;

import chrome.xmdldb.impl.DVisitorBaseImpl;

public abstract class AbstractLocator<X, D> extends DVisitorBaseImpl {

	private final X match;
	private D found;

	public AbstractLocator(X x) {
		super();
		this.match = x;
	}
	
	public boolean visitEnter(D d) {
		if (matches(d)) {
			found = d;
			return false;
		}
		return true;
	}

	public boolean visitLeave(D d) {
		return found == null;
	}

	protected abstract boolean matches(D d);

	public D getFound() {
		return found;
	}

	public X getMatch() {
		return match;
	}
	
}
