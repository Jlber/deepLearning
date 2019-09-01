package com.nazarite.produce1.reflect;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

/**
 * @Author:elbert
 * @Date:2019-08-29
 *
 * 反射工厂类
 */

public class DefaultObjectFactoryTest {
    public static void main(String[] args) {
     String s = new DefaultObjectFactory().create(String.class);
        System.out.println(s);
    }
}
