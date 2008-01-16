package org.xmdl;

import java.util.Collection;

import org.xmdl.xmdl.XType;
import org.xmdl.xmdl.XmdlTypes;


import junit.framework.TestCase;

public class XmdlTypesTest extends TestCase {

    public void testGetInstance() {
        assertNotNull(XmdlTypes.getInstance());
    }

    public void testGetType() {
        assertNotNull(XmdlTypes.getInstance().getType("int"));
        assertEquals("int", XmdlTypes.getInstance().getType("int").getName());

        assertNull(XmdlTypes.getInstance().getType("nonsense"));
    }

    public void testGetRegisteredTypes() {
        Collection<XType> registeredTypes = XmdlTypes.getRegisteredTypes();
        assertNotNull(registeredTypes);
        assertEquals(20, registeredTypes.size());
    }

    public void testContains() {
        assertTrue(XmdlTypes.contains(XmdlTypes.INT));
    }

    public void testAllTypes() {
        assertNotNull(XmdlTypes.BOOLEAN);
        assertNotNull(XmdlTypes.VOID);
        assertNotNull(XmdlTypes.INT);
        assertNotNull(XmdlTypes.BOOLEAN);
        assertNotNull(XmdlTypes.DOUBLE);
        assertNotNull(XmdlTypes.BYTE);
        assertNotNull(XmdlTypes.CHAR);
        assertNotNull(XmdlTypes.FLOAT);
        assertNotNull(XmdlTypes.SHORT);
        assertNotNull(XmdlTypes.LONG);
        assertNotNull(XmdlTypes.JAVA_STRING);
        assertNotNull(XmdlTypes.JAVA_INTEGER);
        assertNotNull(XmdlTypes.JAVA_BOOLEAN);
        assertNotNull(XmdlTypes.JAVA_DOUBLE);
        assertNotNull(XmdlTypes.JAVA_DATE);
        assertNotNull(XmdlTypes.JAVA_DATETIME);
        assertNotNull(XmdlTypes.JAVA_BYTE);
        assertNotNull(XmdlTypes.JAVA_CHARACTER);
        assertNotNull(XmdlTypes.JAVA_FLOAT);
        assertNotNull(XmdlTypes.JAVA_SHORT);
        assertNotNull(XmdlTypes.JAVA_LONG);

        assertEquals("void", XmdlTypes.VOID.getClassName());
        assertEquals("int", XmdlTypes.INT.getClassName());
        assertEquals("boolean", XmdlTypes.BOOLEAN.getClassName());
        assertEquals("double", XmdlTypes.DOUBLE.getClassName());
        assertEquals("byte", XmdlTypes.BYTE.getClassName());
        assertEquals("char", XmdlTypes.CHAR.getClassName());
        assertEquals("float", XmdlTypes.FLOAT.getClassName());
        assertEquals("short", XmdlTypes.SHORT.getClassName());
        assertEquals("long", XmdlTypes.LONG.getClassName());
        assertEquals("java.lang.String", XmdlTypes.JAVA_STRING.getClassName());
        assertEquals("java.lang.Integer", XmdlTypes.JAVA_INTEGER.getClassName());
        assertEquals("java.lang.Boolean", XmdlTypes.JAVA_BOOLEAN.getClassName());
        assertEquals("java.lang.Double", XmdlTypes.JAVA_DOUBLE.getClassName());
        assertEquals("java.util.Date", XmdlTypes.JAVA_DATE.getClassName());
        assertEquals("java.util.DateTime", XmdlTypes.JAVA_DATETIME.getClassName());
        assertEquals("java.lang.Byte", XmdlTypes.JAVA_BYTE.getClassName());
        assertEquals("java.lang.Character", XmdlTypes.JAVA_CHARACTER.getClassName());
        assertEquals("java.lang.Float", XmdlTypes.JAVA_FLOAT.getClassName());
        assertEquals("java.lang.Short", XmdlTypes.JAVA_SHORT.getClassName());
        assertEquals("java.lang.Long", XmdlTypes.JAVA_LONG.getClassName());
    }

}
