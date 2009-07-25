package org.xmdl.genext.taglib.tu;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.osgi.framework.BundleException;
import org.xmdl.gen.util.Locator;
import org.xmdl.genext.BaseTemplateTestCase;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XProject;


public class RandomPlainTagTest extends BaseTemplateTestCase {

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
    private XAttribute date;

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
        date = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class4/date");
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
        date = null;
    }

    public void testRandomValuePlain() throws BundleException {

        final String templateClass = RandomPlainTagTestTemplatePlain.class
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
        setVariable("date", date);
        String output = runTemplate(templateClass);

        // attribute1:string
        assertNotNull(output);
        String[] pieces = output.split("\\;");
        assertNotNull(pieces);
        assertEquals(22, pieces.length);
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
            Long.parseLong(a);
            Long.parseLong(b);
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
            Integer.parseInt(a);
            Integer.parseInt(b);
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
            Double.parseDouble(a);
            Double.parseDouble(b);
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
            assertTrue(a, "1".equals(a) || "2".equals(a));
            assertTrue(b, "1".equals(b) || "2".equals(b));
            assertEquals(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // date:Date
        {
            String a = pieces[20].trim();
            String b = pieces[21].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertEquals(a, b);
            SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
            f.setLenient(false);//fail if error occurs
            try {
                f.parse(a);
                f.parse(b);
            } catch (ParseException e) {
                fail("wrong date:" + a);
            }
        }
    }

    public void testRandomValueTrim() throws BundleException {

        final String templateClass = RandomPlainTagTestTemplateTrim.class
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
        setVariable("date", date);
        String output = runTemplate(templateClass);

        // attribute1:string
        assertNotNull(output);
        String[] pieces = output.split("\\;");
        int trim = 5;
        assertNotNull(pieces);
        assertEquals(22, pieces.length);
        assertEquals(15, pieces[0].length());
        assertEquals(trim, pieces[1].length());//trim by 5
        assertEquals(pieces[0].trim().substring(0, trim), pieces[1].trim());

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
            Long.parseLong(a);
            Long.parseLong(b);
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
            Integer.parseInt(a);
            Integer.parseInt(b);
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
            Double.parseDouble(a);
            Double.parseDouble(b);
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
            assertTrue(a, "1".equals(a) || "2".equals(a));
            assertTrue(b, "VALUE1".equals(b) || "VALUE2".equals(b));
            assertNotSame(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // date:Date
         {
            String a = pieces[20].trim();
            String b = pieces[21].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertEquals(a, b);
            SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
            f.setLenient(false);//fail if error occurs
            try {
                f.parse(a);
                f.parse(b);
            } catch (ParseException e) {
                fail("wrong date:" + a);
            }
        }
    }
    
    public void testRandomValuePlainVariant() throws BundleException {

        final String templateClass = RandomPlainTagTestTemplatePlainVariant.class
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
        setVariable("date", date);
        String output = runTemplate(templateClass);

        // attribute1:string
        assertNotNull(output);
        String[] pieces = output.split("\\;");
        assertNotNull(pieces);
        assertEquals(22, pieces.length);
        assertTrue(15 <= pieces[0].trim().length());
        assertTrue(15 <= pieces[1].length());
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
            assertNotSame(a, b);
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
            Long.parseLong(a);
            Long.parseLong(b);
            assertNotSame(a, b);
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
            assertNotSame(a, b);
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
            Integer.parseInt(a);
            Integer.parseInt(b);
            assertNotSame(a, b);
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
            assertNotSame(a, b);
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
            Double.parseDouble(a);
            Double.parseDouble(b);
            assertNotSame(a, b);
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
            //might be same
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
            //might be same
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
            assertTrue(a, "1".equals(a) || "2".equals(a));
            assertTrue(b, "1".equals(b) || "2".equals(b));
            assertNotSame(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // date:Date
        {
            String a = pieces[20].trim();
            String b = pieces[21].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertNotSame(a, b);
            SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
            f.setLenient(false);//fail if error occurs
            try {
                f.parse(a);
                f.parse(b);
            } catch (ParseException e) {
                fail("wrong date:" + a);
            }
        }
    }

    public void testRandomValueTrimVariant() throws BundleException {

        final String templateClass = RandomPlainTagTestTemplateTrimVariant.class
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
        setVariable("date", date);
        String output = runTemplate(templateClass);

        // attribute1:string
        assertNotNull(output);
        String[] pieces = output.split("\\;");
        assertNotNull(pieces);
        int trim = 5;
        assertEquals(23, pieces.length);
        assertTrue(14 <= pieces[0].trim().length());
        assertEquals(trim, pieces[1].trim().length());
        assertEquals(pieces[0].trim().substring(0, trim), pieces[1].trim());

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
            assertNotSame(a, b);
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
            Long.parseLong(a);
            Long.parseLong(b);
            assertNotSame(a, b);
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
            assertNotSame(a, b);
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
            Integer.parseInt(a);
            Integer.parseInt(b);
            assertNotSame(a, b);
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
            assertNotSame(a, b);
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
            Double.parseDouble(a);
            Double.parseDouble(b);
            assertNotSame(a, b);
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
            //might be same
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
            //might be same
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
            assertTrue(a, "1".equals(a) || "2".equals(a));
            assertTrue(b, "VALUE1".equals(b) || "VALUE2".equals(b));
            assertNotSame(a, b);
        } catch (Exception e) {
            fail("parsing failed");
        }

        // date:Date
         {
            String a = pieces[20].trim();
            String b = pieces[21].trim();
            assertNotNull(a);
            assertNotNull(b);
            assertNotSame("", a);
            assertNotSame("", b);
            assertNotSame(a, b);
            SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
            f.setLenient(false);//fail if error occurs
            try {
                f.parse(a);
                f.parse(b);
            } catch (ParseException e) {
                fail("wrong date:" + a);
            }
        }
    }

}
