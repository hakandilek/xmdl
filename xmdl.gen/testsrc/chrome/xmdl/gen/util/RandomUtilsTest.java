package chrome.xmdl.gen.util;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class RandomUtilsTest extends TestCase {

	public void testRandomBoolean() {
		try {
			RandomUtils.INST.randomBoolean();
		} catch (Exception e) {
			fail();
		}
	}

	public void testRandomDouble() {
		double value1 = RandomUtils.INST.randomDouble(100.0);
		double value2 = RandomUtils.INST.randomDouble(100.0);
		assertTrue(value1 <= 100.0);
		assertTrue(value2 <= 100.0);
		assertNotSame(value1, value2);
	}

	public void testRandomInt() {
		int value1 = RandomUtils.INST.randomInt(100);
		int value2 = RandomUtils.INST.randomInt(100);
		assertTrue(value1 <= 100);
		assertTrue(value2 <= 100);
		assertNotSame(value1, value2);
	}

	public void testRandomString() {
		String value1 = RandomUtils.INST.randomString(100);
		String value2 = RandomUtils.INST.randomString(100);
		assertNotNull(value1);
		assertNotNull(value2);
		assertEquals(100, value1.length());
		assertEquals(100, value2.length());
		assertNotSame(value1, value2);
	}

	public void testRandomObject() {
		List<String> l = new ArrayList<String>();
		for (int i = 0; i < 100; i++) {
			l.add(""+ i);
		}		
		Object value1 = RandomUtils.INST.randomObject(l);
		Object value2 = RandomUtils.INST.randomObject(l);
		assertNotNull(value1);
		assertNotNull(value2);
		assertNotSame(value1, value2);
	}
}
