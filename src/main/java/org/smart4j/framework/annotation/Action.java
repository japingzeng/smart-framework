package org.smart4j.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author japing
 * @Date 2016/10/29 13:30
 * @param ${tags}
 * @Description:action注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Action {
    /**
     *
     * 请求类型与路径
     */
    String value();
}