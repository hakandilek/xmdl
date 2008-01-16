package org.xmdl.lib.dao;

public abstract class AbstractEntity implements Entity {

	

    private long id;

    public long getID() {
		return id;
	}

	public void setID(long id) {
		this.id = id;
	}


}
