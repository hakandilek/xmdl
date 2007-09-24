package chrome.xmdl.lib.helper;

import junit.framework.TestCase;

/**
 * @author hd
 */
public class ArrayUtilTest extends TestCase {
    public static Long[] OSORTED;
    public static Long[] OREVERSED;
    public static Long[] OMIXED;

    public static final long[] SORTED = new long[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, };
    public static final long[] REVERSED = new long[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0, };
    public static final long[] MIXED = new long[]{900, 3, 0, 5, 7, 1, 3, 6, 7, 4, 2, 6, 3, 8, 0, };

    protected void setUp() throws Exception {
        super.setUp();
        OSORTED = toObject(SORTED);
        OREVERSED = toObject(REVERSED);
        OMIXED = toObject(MIXED);
    }

    private Long[] toObject(long[] array) {
        Long[] res = new Long[array.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = array[i];
        }
        return res;
    }

    public void testContains() {
        assertTrue(ArrayUtil.contains(OSORTED, new Long(5)));
        assertTrue(ArrayUtil.contains(OREVERSED, new Long(5)));
        assertTrue(ArrayUtil.contains(OMIXED, new Long(5)));

        assertTrue(ArrayUtil.contains(SORTED, 5));
        assertTrue(ArrayUtil.contains(REVERSED, 5));
        assertTrue(ArrayUtil.contains(MIXED, 5));

        assertFalse(ArrayUtil.contains(OSORTED, new Long(42)));
        assertFalse(ArrayUtil.contains(OREVERSED, new Long(42)));
        assertFalse(ArrayUtil.contains(OMIXED, new Long(42)));

        assertFalse(ArrayUtil.contains(SORTED, 42));
        assertFalse(ArrayUtil.contains(REVERSED, 42));
        assertFalse(ArrayUtil.contains(MIXED, 42));
    }
}
