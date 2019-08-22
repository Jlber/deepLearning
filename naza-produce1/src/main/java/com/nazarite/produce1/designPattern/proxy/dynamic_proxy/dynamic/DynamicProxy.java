package com.nazarite.produce1.designPattern.proxy.dynamic_proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author:elbert
 * @Date:2019-08-21
 */

public class DynamicProxy<T>  {

    public static <T>T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler ih){
       return (T) Proxy.newProxyInstance(classLoader,interfaces,ih);
    }

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        List<String> list2=new LinkedList<>();
        List<Integer> list3=new ArrayList<>();
        System.out.println(list.getClass());
        System.out.println(list2.getClass());
        System.out.println(list3.getClass());

    }
}
