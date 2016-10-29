package org.smart4j.framework;

import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.helper.BeanHelper;
import org.smart4j.framework.helper.ClassHelper;
import org.smart4j.framework.helper.IocHelper;
import org.smart4j.framework.util.ClassUtil;

/**
 * @Author japing
 * @Date 2016/10/29 16:04
 * @param ${tags}
 * @Description: 通过该类提供一个入口程序来加载ClassHelper、BeanHelper、IocHelper、ControllerHelper
 */
public class HelperLoader {
    /**
     * 注意加载的顺序,实际上第一次访问类时，就会加载其static块，这里只是为了让加载更加集中
     */
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                Controller.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), true);
        }
    }
}
