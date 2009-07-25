package org.xmdl.lib.dao.hib;

import static org.xmdl.lib.dao.PersistentEnum.get;

import org.hibernate.HibernateException;
import org.hibernate.usertype.ParameterizedType;
import org.hibernate.usertype.UserType;
import org.xmdl.lib.dao.PersistentEnum;

import java.io.Serializable;
import java.sql.Types;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Properties;


/**
 * $Id: PersistentEnumType.java,v 1.1 2006/03/01 14:46:14 tr001\tr1d2643 Exp $
 * Created: 15.Þub.2006 10:23:10
 *
 * @author hd
 */
public class PersistentEnumType implements UserType, ParameterizedType {

    private static final int[] SQL_TYPES = new int[]{Types.INTEGER};
    private Class<?> targetClass;

    public void setParameterValues(Properties parameters) {
        String targetClassName = parameters.getProperty("targetClass");
        try {
            targetClass = Class.forName(targetClassName);
            if (!(PersistentEnum.class.isAssignableFrom(targetClass))) {
                throw new HibernateException("Class " + targetClassName +
                        " is not a PersistentEnum");
            }
        } catch (ClassNotFoundException e) {
            throw new HibernateException("Class " + targetClassName + " not found ", e);
        }
    }

    public int[] sqlTypes() {
        return SQL_TYPES;
    }

    public Class<?> returnedClass() {
        return targetClass;
    }

    public boolean equals(Object x, Object y) throws HibernateException {
        return (x == y);
    }

    public int hashCode(Object x) throws HibernateException {
        return x.hashCode();
    }

    public Object nullSafeGet(ResultSet rs, String[] names, Object owner) throws HibernateException, SQLException {
        int value = rs.getInt(names[0]);
        return rs.wasNull() ? null : get(targetClass, value);
    }

    public void nullSafeSet(PreparedStatement st, Object value, int index) throws HibernateException, SQLException {
        if (value == null) {
            st.setNull(index, Types.INTEGER);
        } else {
            st.setInt(index, ((PersistentEnum) value).getOrdinal());
        }
    }

    public Object deepCopy(Object value) throws HibernateException {
        return value;
    }

    public boolean isMutable() {
        return false;
    }

    public Serializable disassemble(Object value) throws HibernateException {
        return (Serializable) value;
    }

    public Object assemble(Serializable cached, Object owner) throws HibernateException {
        return cached;
    }

    public Object replace(Object original, Object target, Object owner) throws HibernateException {
        return original;
    }
}
