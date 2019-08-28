package com.nazarite.produce1.designPattern.factory;

import com.nazarite.produce1.designPattern.factory.simple.Product;

/**
 * @Author:elbert
 * @Date:2019-08-28
 */

public  abstract class AbstractFactory {

    public abstract <T extends Product> T produce(Class<T> c) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}
