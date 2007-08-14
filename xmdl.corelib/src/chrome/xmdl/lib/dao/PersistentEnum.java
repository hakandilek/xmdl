package chrome.xmdl.lib.dao;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

/**
 * $Id: PersistentEnum.java,v 1.2 2006/03/22 09:36:45 tr001\tr1d2643 Exp $
 * Created: 15.Þub.2006 10:02:03
 *
 * @author hd
 */
public abstract class PersistentEnum implements Serializable {
    protected static Map<Class, Map<String, PersistentEnum>> names = new HashMap<Class, Map<String, PersistentEnum>>(15);
    protected static HashMap<Class, Map<Integer, PersistentEnum>> ordinals = new HashMap<Class, Map<Integer, PersistentEnum>>(15);

    protected int ordinal;
    protected transient String name;

    protected PersistentEnum(String name, int value) {
        this.ordinal = value;
        this.name = name;
        add();
    }

    protected void add() {
        Class<? extends Object> aClass = getClass();
        Map<String, PersistentEnum> namesMap = names.get(aClass);
        Map<Integer, PersistentEnum> ordinalsMap = ordinals.get(aClass);
        if (namesMap == null) {
            namesMap = new HashMap<String, PersistentEnum>();
            names.put(aClass, namesMap);
        }
        if (ordinalsMap == null) {
            ordinalsMap = new HashMap<Integer, PersistentEnum>();
            ordinals.put(aClass, ordinalsMap);
        }
        namesMap.put(this.name, this);
        ordinalsMap.put(this.ordinal, this);
    }

    public static PersistentEnum get(Class aClass, String name) {
        Map<String, PersistentEnum> map = names.get(aClass);
        if (map == null) return null;
        return map.get(name);
    }

    public static PersistentEnum get(Class aClass, int ordinal) {
        Map<Integer, PersistentEnum> map = ordinals.get(aClass);
        if (map == null) return null;
        return map.get(ordinal);
    }

    public int getOrdinal() {
        return ordinal;
    }

    public String getName() {
        return name;
    }

    protected Object readResolve() throws ObjectStreamException {
        return get(getClass(), this.ordinal);
    }

    public String toString() {
        return new StringBuffer()
                .append(name)
                .append("(")
                .append(ordinal)
                .append(")")
                .toString();
    }
}