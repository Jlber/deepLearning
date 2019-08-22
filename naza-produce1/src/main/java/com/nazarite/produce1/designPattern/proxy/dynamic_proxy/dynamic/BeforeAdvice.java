package com.nazarite.produce1.designPattern.proxy.dynamic_proxy.dynamic;


/**
 * @Author:elbert
 * @Date:2019-08-21
 */

public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我的方法前置触发啦~~");
    }
}
