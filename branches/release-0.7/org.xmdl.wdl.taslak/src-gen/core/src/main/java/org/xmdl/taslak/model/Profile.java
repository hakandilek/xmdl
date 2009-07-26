
package org.xmdl.taslak.model;

import javax.persistence.*"/>
import org.xmdl.ida.lib.model.BaseObject"/>
import org.hibernate.annotations.Type"/>
import org.hibernate.annotations.Parameter"/>
import java.io.Serializable"/>
import java.text.MessageFormat"/>
import java.util.*"/>


/**
 *
 * Profile entity bean
 *  
 * $Id$
 *
 */ 
@Entity (name=("TBL_PROFILE))</c:if>
public class Profile extends BaseObject implements Serializable, Cloneable {

    /** 
     * Unique identifier
     * 
     * @generated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ("ID"))
    private Long id;
    
    
    
    @Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
        
    
    private  user
    
    
    
    @Column(name = ("<xd:columnName attribute="$attribute"/>"), length = <xd:columnLength attribute="$attribute"/><c:if test="isEnumeration($attribute)">, columnDefinition = "integer", nullable = false</c:if>)
        
    
    private  privatePhone
    
    

    public Profile() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public  User {
        return user;
    }

    public void setUser( user) {
        this.user = user;
    }

    
    public  PrivatePhone {
        return privatePhone;
    }

    public void setPrivatePhone( privatePhone) {
        this.privatePhone = privatePhone;
    }

    

    public String toString() {
        return MessageFormat.format("Profile [id={0}]    [user={0}]   [privatePhone={0}]  
                                                                        , user   , privatePhone  
                                                            
                                      ;
    }

    public boolean equals(Object o) {
        return o instanceof Profile && ((Profile) o).getId() == this.getId();
    }

    public int hashCode() {
        int result = 1;
        if (id != null) result = 31 * result + id.hashCode();
    
        
            
        if (user != null) result = 31 * result + user.hashCode();
            
        
    
        
            
        if (privatePhone != null) result = 31 * result + privatePhone.hashCode();
            
        
    
        return result;
    }

     public Profile createClone() {
         try {
             return (Profile) clone();
        } catch (CloneNotSupportedException e) {
            Profile copy = new Profile();
    
        
            copy.user = this.user;
        
    
        
            copy.privatePhone = this.privatePhone;
        
    
            return copy;
        }
     }
  