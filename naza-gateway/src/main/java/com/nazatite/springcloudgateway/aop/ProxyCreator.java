package com.nazatite.springcloudgateway.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:elbert
 * @Date:2019-08-14
 */

public class ProxyCreator  implements InvocationHandler {
    private Object proxy;

    private LogicClassFir logicObj;

    public ProxyCreator(Object proxy, LogicClassFir logicObj) {
        this.proxy = proxy;
        this.logicObj = logicObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("xxx11");
        logicObj.logicMethodFir();
        return method.invoke(this.proxy, args);
    }
}
