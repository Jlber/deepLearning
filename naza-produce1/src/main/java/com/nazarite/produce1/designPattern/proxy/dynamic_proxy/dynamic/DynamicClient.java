package com.nazarite.produce1.designPattern.proxy.dynamic_proxy.dynamic;

/**
 * @Author:elbert
 * @Date:2019-08-21
 */

public class DynamicClient {


    public static void main(String[] args) {
        Subject subject=new RealSubject();
        Subject proxy=DynamicProxy.newProxyInstance(subject.getClass().getClassLoader()
        ,subject.getClass().getInterfaces(),new MyInvocationHandle(subject));
        proxy.doSomething();
    }
}
