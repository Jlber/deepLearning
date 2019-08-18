package com.nazatite.springcloudgateway.aop;

/**
 * @Author:elbert
 * @Date:2019-08-14
 */

public interface AspectJService {
    /**
     * 测试前置通知
     */
    void beforeAdvice();

    /**
     * 测试后置通知
     */
    void afterAdvice();
}
