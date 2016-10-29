package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by japing on 16-10-22.
 */
public class StringUtil {
    public static boolean isEmpty(String str){
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static  boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static String[] splitString(String param, String regex) {
        String[] array = null;
        if (isNotEmpty(param)) {
            array = param.split(regex);
        }
        return array;
    }
}
