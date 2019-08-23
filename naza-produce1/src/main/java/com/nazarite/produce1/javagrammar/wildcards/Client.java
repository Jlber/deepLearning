package com.nazarite.produce1.javagrammar.wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:elbert
 * @Date:2019-08-22
 *
 * 容器里的类有继承关系  但是容器之间没有
 */

public class Client {

    public static void main(String[] args) {
       // Plate<Fruit> plat0=new Plate<Apple>(new Apple());编译无法通过
        Plate<?extends Fruit> plat1=new Plate<Apple>(new Apple());
       // plat1.setItem(new Apple());//无法添加 Apple以及Fruit
        Plate<?super Apple> plate2=new Plate<>(new Fruit());
        plate2.setItem(new Apple());
        Plate<?> plat3=new Plate<>(new Apple());
//        plat3.setItem(new Apple());
//        Apple apple=plat3.getItem();

        List<?> list=new ArrayList<>();

      //  list.add(new Object());

        //  Apple apple =plate2.getItem(); 下界通配符 不能取
    }
}
