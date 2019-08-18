package com.nazatite.springcloudgateway.aop;

/**
 * @Author:elbert
 * @Date:2019-08-14
 */

public class AspectJServiceImpl implements AspectJService {
    @Override
    public void beforeAdvice() {
        System.out.println("测试前置通知，我是第一个Service。。。。。。");
    }

    @Override
    public void afterAdvice() {
        System.out.println("测试AspectJ后置通知。。。。");
    }
}
