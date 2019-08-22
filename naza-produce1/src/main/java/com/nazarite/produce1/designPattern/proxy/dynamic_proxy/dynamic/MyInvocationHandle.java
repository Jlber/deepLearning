package com.nazarite.produce1.designPattern.proxy.dynamic_proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:elbert
 * @Date:2019-08-21
 */

public class MyInvocationHandle implements InvocationHandler {

    private Object obj;//被代理的对象

    public MyInvocationHandle(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //寻找JointPoint连接点   AOP里有定义 --》在什么地方执行什么通知
        if (true){ //执行一个前置通知
            new BeforeAdvice().exec();
        }

        return method.invoke(this.obj,args);
    }
}
