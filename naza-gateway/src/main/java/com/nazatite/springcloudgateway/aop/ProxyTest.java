package com.nazatite.springcloudgateway.aop;

import java.lang.reflect.Proxy;

/**
 * @Author:elbert
 * @Date:2019-08-14
 */

public class ProxyTest {
    public static void main(String[] args) {

        LogicClassFir logicClassFir = new LogicClassFir();
        ProxyService targetService = new ProxyServiceImpl();
        ProxyService proxyService = (ProxyService) Proxy.newProxyInstance(
                ProxyCreator.class.getClassLoader(),
                new Class[]{ProxyService.class}, new ProxyCreator(targetService, logicClassFir));
        proxyService.testProxy();

    }

}
