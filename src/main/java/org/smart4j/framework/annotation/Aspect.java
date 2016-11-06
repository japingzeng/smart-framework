package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * @Author japing
 * @Date 2016/11/6 14:39
 * @param ${tags}
 * @Description:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    /**
     * 注解
     */
    Class<? extends Annotation> value();
}
