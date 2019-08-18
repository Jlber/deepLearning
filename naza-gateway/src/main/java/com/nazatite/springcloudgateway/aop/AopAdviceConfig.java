package com.nazatite.springcloudgateway.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author:elbert
 * @Date:2019-08-14
 */

@Aspect
public class AopAdviceConfig {
    @Before("execution(* com.nazatite.springcloudgateway.aop..*.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println(joinPoint.getThis());
        System.out.println("我是前置通知....");
    }
}
