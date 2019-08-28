package com.nazarite.produce1.designPattern.factory.simple;

/**
 * @Author:elbert
 * @Date:2019-08-28
 */

public class ProductFactory  {
    public static  <T extends Product> T produce(Class<T> c) {
        Product product=null;
        try {
            product= (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
         return (T)product;
    }
}
