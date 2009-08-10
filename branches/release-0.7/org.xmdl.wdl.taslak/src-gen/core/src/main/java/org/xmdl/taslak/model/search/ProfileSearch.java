package org.xmdl.taslak.model.search;

import java.util.*;
import java.io.Serializable;
import java.text.MessageFormat;
import org.xmdl.taslak.model.*;
import org.xmdl.mesken.model.*;

/**
 *
 * Profile entity search bean
 *  
 * $Id$
 *
 */
public class ProfileSearch implements Serializable {

	private User user;

	private String privatePhone;

	public ProfileSearch() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPrivatePhone() {
		return privatePhone;
	}

	public void setPrivatePhone(String privatePhone) {
		this.privatePhone = privatePhone;
	}

	/** 
	 * @generated
	 */
	@Override
	public String toString() {
		return MessageFormat.format("ProfileSearch[privatePhone={0}], ",
				privatePhone);
	}

	/** 
	 * @generated
	 */
	@Override
	public int hashCode() {
		int result = 1;

		if (user != null)
			result = 31 * result + ("" + user).hashCode();

		if (privatePhone != null)
			result = 31 * result + ("" + privatePhone).hashCode();

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}
}
