package org.xmdl.taslak.model;

import javax.persistence.*;
import org.xmdl.ida.lib.model.BaseObject;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.Parameter;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.*;
import org.xmdl.mesken.model.*;

/**
 * Profile entity bean
 */
@Entity(name = "TBL_PROFILE")
public class Profile
		extends
			/*PROTECTED REGION ID(Profile.ent.ext) ENABLED START*/BaseObject
/*PROTECTED REGION END*/implements Serializable, Cloneable /*PROTECTED REGION ID(Profile.ent.imp) ENABLED START*//*, AnotherInterface *//*PROTECTED REGION END*/{

	/** Unique identifier */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private User user;

	@Column(name = "F_PRIVATEPHONE", length = 15)
	private String privatePhone;

	public Profile() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String toString() {
		return MessageFormat
				.format("Profile[privatePhone={0}], ", privatePhone);
	}

	public boolean equals(Object o) {
		return o instanceof Profile && ((Profile) o).getId() == this.getId();
	}

	public int hashCode() {
		int result = 1;
		if (id != null)
			result = 31 * result + id.hashCode();
		if (privatePhone != null)
			result = 31 * result + ("" + privatePhone).hashCode();
		return result;
	}

	public Profile createClone() {
		try {
			return (Profile) clone();
		} catch (CloneNotSupportedException e) {
			Profile copy = new Profile();
			copy.privatePhone = this.privatePhone;
			return copy;
		}
	}

	/*PROTECTED REGION ID(Profile.ent.bdy) ENABLED START*/
	//This is the protected region that will not be overwritten on generation
	/*PROTECTED REGION END*/
}
