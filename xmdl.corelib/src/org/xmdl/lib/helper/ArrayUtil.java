package org.xmdl.lib.helper;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.util.Arrays;

/**
 * Helper class for array operations
 *
 * @author hd
 */
public class ArrayUtil {
    private static final Log LOGGER = LogFactory.getLog(ArrayUtil.class);

    /**
     * This method uses sorting, thus indexOf does not work here
     * @param array
     * @param value
     * @return
     */
    private static int indexOf(Comparable<?>[] array, Comparable<?> value) {
        LOGGER.debug("ArrayUtil.indexOf");
        Arrays.sort(array);
        int idx = Arrays.binarySearch(array, value);
        LOGGER.debug("idx = " + idx);
        return idx;
    }

    /**
     * This method uses sorting, thus indexOf does not work here
     * @param array
     * @param value
     * @return
     */
    private  static int indexOf(long[] array, long value) {
        LOGGER.debug("ArrayUtil.indexOf");
        Arrays.sort(array);
        int idx = Arrays.binarySearch(array, value);
        LOGGER.debug("idx = " + idx);
        return idx;
    }

    public static boolean contains(long[] array, long value) {
        LOGGER.debug("ArrayUtil.contains");
        int idx = indexOf(array, value);
        return idx >= 0;
    }

    public static boolean contains(Comparable<?>[] array, Comparable<?> value) {
        LOGGER.debug("ArrayUtil.contains");
        int idx = indexOf(array, value);
        return idx >= 0;
    }
}
