package com.nazarite.produce1.designPattern.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:elbert
 * @Date:2019-08-21
 */

public class GameplayerIH implements InvocationHandler {


    //被代理者的实例
      Object obj=null;

    public GameplayerIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

       Object result= method.invoke(this.obj,args);//调用被代理的真实方法
        if (method.getName().equalsIgnoreCase("login")){
            System.out.println("我的账号被登录了");
        }
        return result;
    }
}
