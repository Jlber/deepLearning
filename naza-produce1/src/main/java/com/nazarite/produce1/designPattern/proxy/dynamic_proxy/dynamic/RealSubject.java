package com.nazarite.produce1.designPattern.proxy.dynamic_proxy.dynamic;

/**
 * @Author:elbert
 * @Date:2019-08-21
 */

public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("我来做点什么吧...");
    }
}
