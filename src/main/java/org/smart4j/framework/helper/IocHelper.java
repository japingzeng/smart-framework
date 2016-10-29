package org.smart4j.framework.helper;

import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.util.ArrayUtil;
import org.smart4j.framework.util.CollectionUtil;
import org.smart4j.framework.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @Author japing
 * @Date 2016/10/29 14:32
 * @param ${tags}
 * @Description:依赖注入助手类
 * Ioc框架中管理的对象都是单列的，由于Ioc框架底层还是从BeanHelper中获取Bean Map的，而Bean Map中的对象都是事先创建好放入这个Bean 容器的，所以，所有的对象都是单列的。
 */
public class IocHelper {

    static {
        //获取所有的Bean类与Bean实例之间的映射关系（简称 Bean Map)
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            //遍历 Bean Map
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                //从 BeanMap 中获取Bean 类 与 Bean 实例
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                //获取beanClass 类定的所有成员变量（简称 Bean Field）
                Field[] beanFields = beanClass.getFields();
                if (ArrayUtil.isNotEmpty(beanFields)) {
                    //遍历Bean Field
                    for (Field beanField : beanFields) {
                        //判断当前Bean Field是否带有Inject 注解
                        if (beanField.isAnnotationPresent(Inject.class)) {
                            //在 Bean Map 中获取 Bean Field对应的实例
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if (null != beanFieldInstance) {
                                //通过反射初始化BeanField的值
                                ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
