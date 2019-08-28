package com.nazarite.produce1.designPattern.factory.simple;

/**
 * @Author:elbert
 * @Date:2019-08-28
 *
 * 通用的静态工厂  实际需要扩展使用
 */

public class Client {
    public static void main(String[] args) {
        ConcreteProduct concreteProduct=ProductFactory.produce(ConcreteProduct.class);
        concreteProduct.method2();
    }
}
