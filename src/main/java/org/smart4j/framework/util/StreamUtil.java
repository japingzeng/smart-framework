package org.smart4j.framework.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @Author japing
 * @Date 2016/10/29 16:42
 * @param ${tags}
 * @Description:流操作工具类
 */
public final class StreamUtil {

    private static final Logger LOOGER = LoggerFactory.getLogger(StreamUtil.class);

    /**
     * 从流中读取字符串
     */
    public static String getString(InputStream is) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;
            while (null != (line = reader.readLine())) {
                sb.append(line);
            }
        } catch (Exception e) {
            LOOGER.error("get string failure", e);
            throw new RuntimeException(e);
        }
        return  sb.toString();
    }
}
