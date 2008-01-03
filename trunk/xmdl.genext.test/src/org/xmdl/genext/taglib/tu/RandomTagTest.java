package org.xmdl.genext.taglib.tu;

import org.osgi.framework.BundleException;
import org.xmdl.genext.BaseTemplateTestCase;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XProject;
import chrome.xmdl.gen.util.Locator;
import chrome.xmdl.xgen.util.ResourceHelper;

public class RandomTagTest extends BaseTemplateTestCase {

    private XAttribute attribute1;
    private XAttribute attribute2;
    private XAttribute attribute3;
    private XAttribute attribute4;
    private XAttribute attribute5;
    private XAttribute attribute6;
    private XAttribute attribute7;
    private XAttribute attribute8;
    private XAttribute attribute9;
    private XAttribute attribute10;

    protected void setUp() throws Exception {
        super.setUp();
        XProject project = ResourceHelper.loadProject("model/test.xmdl");
        attribute1 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute1");
        attribute2 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute2");
        attribute3 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute3");
        attribute4 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute4");
        attribute5 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute5");
        attribute6 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute6");
        attribute7 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute7");
        attribute8 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute8");
        attribute9 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute9");
        attribute10 = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class3/attribute10");
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        attribute1 = null;
        attribute2 = null;
        attribute3 = null;
        attribute4 = null;
        attribute5 = null;
        attribute6 = null;
        attribute7 = null;
        attribute8 = null;
        attribute9 = null;
        attribute10 = null;
    }

    public void testRandomValuePlain() throws BundleException {

        final String templateClass = RandomTagTestTemplatePlain.class.getName();
        setVariable("attribute1", attribute1);
        setVariable("attribute2", attribute2);
        setVariable("attribute3", attribute3);
        setVariable("attribute4", attribute4);
        setVariable("attribute5", attribute5);
        setVariable("attribute6", attribute6);
        setVariable("attribute7", attribute7);
        setVariable("attribute8", attribute8);
        setVariable("attribute9", attribute9);
        setVariable("attribute10", attribute10);
        String output = runTemplate(templateClass);

        // attribute1:string
        assertNotNull(output);
        String[] pieces = output.split("\\;");
        assertNotNull(pieces);
        assertEquals(21, pieces.length);
        assertEquals(15, pieces[0].trim().length());
        assertEquals(15, pieces[1].trim().length());
        assertEquals(pieces[0].trim(), pieces[1].trim());

        // attribute2:long
        try {
            String a = pieces[2].trim();
            String b = pieces[3].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            Long.parseLong(a);
            Long.parseLong(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute3:Long
        try {
            String a = pieces[4].trim();
            String b = pieces[5].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue(a.startsWith("new Long("));
            assertTrue(b.startsWith("new Long("));
            assertTrue(a.endsWith("L)"));
            assertTrue(b.endsWith("L)"));
            String a1 = a.substring(9, a.length() - 2);
            String b1 = b.substring(9, b.length() - 2);
            Long.parseLong(a1);
            Long.parseLong(b1);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute4:int
        try {
            String a = pieces[6].trim();
            String b = pieces[7].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            Integer.parseInt(a);
            Integer.parseInt(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute5:Integer
        try {
            String a = pieces[8].trim();
            String b = pieces[9].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue(a.startsWith("new Integer("));
            assertTrue(b.startsWith("new Integer("));
            assertTrue(a.endsWith(")"));
            assertTrue(b.endsWith(")"));
            String a1 = a.substring(12, a.length() - 2);
            String b1 = b.substring(12, b.length() - 2);
            Integer.parseInt(a1);
            Integer.parseInt(b1);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute6:double
        try {
            String a = pieces[10].trim();
            String b = pieces[11].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            Double.parseDouble(a);
            Double.parseDouble(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute7:Double
        try {
            String a = pieces[12].trim();
            String b = pieces[13].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue(a.startsWith("new Double("));
            assertTrue(b.startsWith("new Double("));
            assertTrue(a.endsWith(")"));
            assertTrue(b.endsWith(")"));
            String a1 = a.substring(11, a.length() - 1);
            String b1 = b.substring(11, b.length() - 1);
            Double.parseDouble(a1);
            Double.parseDouble(b1);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute8:boolean
        try {
            String a = pieces[14].trim();
            String b = pieces[15].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue("true".equals(a) || "false".equals(a));
            assertTrue("true".equals(b) || "false".equals(b));
            Boolean.parseBoolean(a);
            Boolean.parseBoolean(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute9:Boolean
        try {
            String a = pieces[16].trim();
            String b = pieces[17].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue("true".equals(a) || "false".equals(a));
            assertTrue("true".equals(b) || "false".equals(b));
            Boolean.parseBoolean(a);
            Boolean.parseBoolean(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute10:enum
        try {
            String a = pieces[18].trim();
            String b = pieces[19].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue("VALUE1".equals(a) || "VALUE2".equals(a));
            assertTrue("VALUE1".equals(b) || "VALUE2".equals(b));
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }
    }

    public void testRandomValueString() throws BundleException {

        final String templateClass = RandomTagTestTemplateString.class
                .getName();
        setVariable("attribute1", attribute1);
        setVariable("attribute2", attribute2);
        setVariable("attribute3", attribute3);
        setVariable("attribute4", attribute4);
        setVariable("attribute5", attribute5);
        setVariable("attribute6", attribute6);
        setVariable("attribute7", attribute7);
        setVariable("attribute8", attribute8);
        setVariable("attribute9", attribute9);
        setVariable("attribute10", attribute10);
        String output = runTemplate(templateClass);

        // attribute1:string
        assertNotNull(output);
        String[] pieces = output.split("\\;");
        assertNotNull(pieces);
        assertEquals(21, pieces.length);
        assertEquals(15, pieces[0].trim().length());
        assertEquals(15 + 2, pieces[1].trim().length());
        assertEquals("\"" + pieces[0].trim() + "\"", pieces[1].trim());

        // attribute2:long
        try {
            String a = pieces[2].trim();
            String b = pieces[3].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            Long.parseLong(a);
            Long.parseLong(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute3:Long
        try {
            String a = pieces[4].trim();
            String b = pieces[5].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue(a.startsWith("new Long("));
            assertTrue(b.startsWith("new Long("));
            assertTrue(a.endsWith("L)"));
            assertTrue(b.endsWith("L)"));
            String a1 = a.substring(9, a.length() - 2);
            String b1 = b.substring(9, b.length() - 2);
            Long.parseLong(a1);
            Long.parseLong(b1);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute4:int
        try {
            String a = pieces[6].trim();
            String b = pieces[7].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            Integer.parseInt(a);
            Integer.parseInt(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute5:Integer
        try {
            String a = pieces[8].trim();
            String b = pieces[9].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue(a.startsWith("new Integer("));
            assertTrue(b.startsWith("new Integer("));
            assertTrue(a.endsWith(")"));
            assertTrue(b.endsWith(")"));
            String a1 = a.substring(12, a.length() - 2);
            String b1 = b.substring(12, b.length() - 2);
            Integer.parseInt(a1);
            Integer.parseInt(b1);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute6:double
        try {
            String a = pieces[10].trim();
            String b = pieces[11].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            Double.parseDouble(a);
            Double.parseDouble(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute7:Double
        try {
            String a = pieces[12].trim();
            String b = pieces[13].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue(a.startsWith("new Double("));
            assertTrue(b.startsWith("new Double("));
            assertTrue(a.endsWith(")"));
            assertTrue(b.endsWith(")"));
            String a1 = a.substring(11, a.length() - 1);
            String b1 = b.substring(11, b.length() - 1);
            Double.parseDouble(a1);
            Double.parseDouble(b1);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute8:boolean
        try {
            String a = pieces[14].trim();
            String b = pieces[15].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue("true".equals(a) || "false".equals(a));
            assertTrue("true".equals(b) || "false".equals(b));
            Boolean.parseBoolean(a);
            Boolean.parseBoolean(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute9:Boolean
        try {
            String a = pieces[16].trim();
            String b = pieces[17].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue("true".equals(a) || "false".equals(a));
            assertTrue("true".equals(b) || "false".equals(b));
            Boolean.parseBoolean(a);
            Boolean.parseBoolean(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute10:enum
        try {
            String a = pieces[18].trim();
            String b = pieces[19].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue("VALUE1".equals(a) || "VALUE2".equals(a));
            assertTrue("Enumeration1.VALUE1".equals(b)
                    || "Enumeration1.VALUE2".equals(b));
            assertEquals("Enumeration1." + a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }
    }
    public void testRandomValueTrim() throws BundleException {

        final String templateClass = RandomTagTestTemplateTrim.class
                .getName();
        setVariable("attribute1", attribute1);
        setVariable("attribute2", attribute2);
        setVariable("attribute3", attribute3);
        setVariable("attribute4", attribute4);
        setVariable("attribute5", attribute5);
        setVariable("attribute6", attribute6);
        setVariable("attribute7", attribute7);
        setVariable("attribute8", attribute8);
        setVariable("attribute9", attribute9);
        setVariable("attribute10", attribute10);
        String output = runTemplate(templateClass);

        // attribute1:string
        assertNotNull(output);
        String[] pieces = output.split("\\;");
        assertNotNull(pieces);
        assertEquals(21, pieces.length);
        assertEquals(15, pieces[0].trim().length());
        assertEquals(15-5+2, pieces[1].trim().length());
        assertEquals("\"" + pieces[0].trim().substring(0, 10) + "\"", pieces[1].trim());

        // attribute2:long
        try {
            String a = pieces[2].trim();
            String b = pieces[3].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            Long.parseLong(a);
            Long.parseLong(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute3:Long
        try {
            String a = pieces[4].trim();
            String b = pieces[5].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue(a.startsWith("new Long("));
            assertTrue(b.startsWith("new Long("));
            assertTrue(a.endsWith("L)"));
            assertTrue(b.endsWith("L)"));
            String a1 = a.substring(9, a.length() - 2);
            String b1 = b.substring(9, b.length() - 2);
            Long.parseLong(a1);
            Long.parseLong(b1);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute4:int
        try {
            String a = pieces[6].trim();
            String b = pieces[7].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            Integer.parseInt(a);
            Integer.parseInt(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute5:Integer
        try {
            String a = pieces[8].trim();
            String b = pieces[9].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue(a.startsWith("new Integer("));
            assertTrue(b.startsWith("new Integer("));
            assertTrue(a.endsWith(")"));
            assertTrue(b.endsWith(")"));
            String a1 = a.substring(12, a.length() - 2);
            String b1 = b.substring(12, b.length() - 2);
            Integer.parseInt(a1);
            Integer.parseInt(b1);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute6:double
        try {
            String a = pieces[10].trim();
            String b = pieces[11].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            Double.parseDouble(a);
            Double.parseDouble(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute7:Double
        try {
            String a = pieces[12].trim();
            String b = pieces[13].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue(a.startsWith("new Double("));
            assertTrue(b.startsWith("new Double("));
            assertTrue(a.endsWith(")"));
            assertTrue(b.endsWith(")"));
            String a1 = a.substring(11, a.length() - 1);
            String b1 = b.substring(11, b.length() - 1);
            Double.parseDouble(a1);
            Double.parseDouble(b1);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute8:boolean
        try {
            String a = pieces[14].trim();
            String b = pieces[15].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue("true".equals(a) || "false".equals(a));
            assertTrue("true".equals(b) || "false".equals(b));
            Boolean.parseBoolean(a);
            Boolean.parseBoolean(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute9:Boolean
        try {
            String a = pieces[16].trim();
            String b = pieces[17].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue("true".equals(a) || "false".equals(a));
            assertTrue("true".equals(b) || "false".equals(b));
            Boolean.parseBoolean(a);
            Boolean.parseBoolean(b);
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // attribute10:enum
        try {
            String a = pieces[18].trim();
            String b = pieces[19].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertTrue("VALUE1".equals(a) || "VALUE2".equals(a));
            assertTrue("Enumeration1.VALUE1".equals(b)
                    || "Enumeration1.VALUE2".equals(b));
            assertEquals("Enumeration1." + a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }
    }


}
