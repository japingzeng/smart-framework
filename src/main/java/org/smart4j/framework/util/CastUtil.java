package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by japing on 16-10-22.
 */
public class CastUtil {
    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }


    public static double castDouble(Object obj) {
        return CastUtil.castDouble(obj, 0);
    }

    public static  double castDouble(Object obj, double defaultValue) {
        double doubleValue = defaultValue;

        if (obj != null) {
            String strvalue = castString(obj);
            if (StringUtil.isNotEmpty(strvalue)) {
                try {
                    doubleValue = Double.valueOf(strvalue);
                } catch (NumberFormatException e) {
                    doubleValue = defaultValue;
                }
            }
        }
        return  doubleValue;
    }

    public static long castLong(Object obj) {
        return CastUtil.castLong(obj, 0);
    }

    public static  long castLong(Object obj, long defaultValue) {
        long longValue = defaultValue;

        if (obj != null) {
            String strvalue = castString(obj);
            if (StringUtil.isNotEmpty(strvalue)) {
                try {
                    longValue = Long.valueOf(strvalue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return  longValue;
    }

    public static int castInt(Object obj) {
        return CastUtil.castInt(obj, 0);
    }

    public static int castInt(Object obj, int defaultValue) {
        int intValue = defaultValue;

        if (obj != null) {
            String strvalue = castString(obj);
            if (StringUtil.isNotEmpty(strvalue)) {
                try {
                    intValue = Integer.valueOf(strvalue);
                } catch (NumberFormatException e) {
                    intValue = defaultValue;
                }
            }
        }
        return  intValue;
    }


    public static boolean castBoolean(Object obj) {
        return CastUtil.castBoolean(obj, false);
    }

    public static boolean castBoolean(Object obj, boolean defaultVaule) {
        boolean booleanValue = defaultVaule;

        if (obj != null) {
            booleanValue = Boolean.parseBoolean(castString(obj));
        }

        return booleanValue;
    }
}
