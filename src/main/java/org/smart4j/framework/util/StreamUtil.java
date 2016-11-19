package org.smart4j.framework.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

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

    /**
     * 将输入流复制到输出流
     */
    public static void copyStream(InputStream inputStream, OutputStream outputStream) {
        try {
            int length;
            byte[] buffer = new byte[4*1024];
            while ((length = inputStream.read(buffer, 0, buffer.length))!= -1) {
                outputStream.write(buffer, 0, length);
            }
            outputStream.flush();
        } catch (Exception e) {
            LOOGER.error("copy stream failure", e);
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (Exception e) {
                LOOGER.error("close stream failre", e);
            }
        }
    }
}
