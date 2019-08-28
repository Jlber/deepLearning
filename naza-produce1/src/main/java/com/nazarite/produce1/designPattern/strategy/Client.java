package com.nazarite.produce1.designPattern.strategy;

/**
 * @Author:elbert
 * @Date:2019-08-26
 * 策略模式  通常要与其他模式混用  还能搭配Spring ioc 代替if else
 */

public class Client {
    public static void main(String[] args) {
        Context context=new Context(new ConcreteStrategy1());
        context.doThing();
    }
}
