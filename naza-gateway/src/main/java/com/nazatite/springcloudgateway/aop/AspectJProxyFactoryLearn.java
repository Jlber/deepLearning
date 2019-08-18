package com.nazatite.springcloudgateway.aop;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @Author:elbert
 * @Date:2019-08-14
 */

public class AspectJProxyFactoryLearn {
    public static void main(String[] args) {
        //手工创建一个实例
        AspectJService aspectJService = new AspectJServiceImpl();
        //使用AspectJ语法 自动创建代理对象
        AspectJProxyFactory aspectJProxyFactory = new AspectJProxyFactory(aspectJService);
        //添加切面和通知类
        aspectJProxyFactory.addAspect(AopAdviceConfig.class);
        //创建代理对象
        AspectJService proxyService = aspectJProxyFactory.getProxy();
        //进行方法调用
        proxyService.afterAdvice();
    }
}
