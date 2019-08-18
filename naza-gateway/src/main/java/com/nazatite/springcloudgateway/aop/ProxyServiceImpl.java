package com.nazatite.springcloudgateway.aop;

/**
 * @Author:elbert
 * @Date:2019-08-14
 */

public class ProxyServiceImpl implements ProxyService {
    @Override
    public void testProxy() {
        System.out.println("我是ProxyService中的测试方法......");
    }
}
