package org.smart4j.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @Author japing
 * @Date 2016/10/29 14:34
 * @param ${tags}
 * @Description:数组工具类
 */
public class ArrayUtil {
    /**
     *判断数组是否为空
     */
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }


    /**
     * 判断数组是否为空
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
