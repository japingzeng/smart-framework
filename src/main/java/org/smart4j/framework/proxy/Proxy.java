package org.smart4j.framework.proxy;

/**
 * @Author japing
 * @Date 2016/11/6 14:42
 * @param ${tags}
 * @Description:
 */
public interface Proxy {

    /**
     * 执行链式代理
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
