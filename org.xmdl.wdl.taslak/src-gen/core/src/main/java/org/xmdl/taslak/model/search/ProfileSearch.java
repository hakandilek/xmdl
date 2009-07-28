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

	private String privatePhoneMin;

	private String privatePhoneMax;

	public ProfileSearch() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPrivatePhoneMin() {
		return privatePhoneMin;
	}

	public void setPrivatePhoneMin(String privatePhoneMin) {
		this.privatePhoneMin = privatePhoneMin;
	}

	public String getPrivatePhoneMax() {
		return privatePhoneMax;
	}

	public void setPrivatePhoneMax(String privatePhoneMax) {
		this.privatePhoneMax = privatePhoneMax;
	}

	/** 
	 * @generated
	 */
	@Override
	public String toString() {
		return MessageFormat.format(
				"Profile[privatePhoneMin={1}][privatePhoneMax={2}]",
				privatePhoneMin, privatePhoneMax);
	}

	/** 
	 * @generated
	 */
	@Override
	public int hashCode() {
		int result = 1;

		if (user != null)
			result = 31 * result + ("" + user).hashCode();

		if (privatePhoneMin != null)
			result = 31 * result + ("" + privatePhoneMin).hashCode();
		if (privatePhoneMax != null)
			result = 31 * result + ("" + privatePhoneMax).hashCode();

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}
}
