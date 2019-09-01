package com.nazarite.produce1.reflect;

import org.apache.ibatis.reflection.TypeParameterResolver;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Author:elbert
 * @Date:2019-08-29
 */

public class Client {

    SubClassA<Long> sa=new SubClassA<Long>();
    public static void main(String[] args) throws NoSuchFieldException {
      Field field =  ClassA.class.getDeclaredField("map");
      System.out.println(field.getGenericType());
        System.out.println(field.getGenericType() instanceof ParameterizedType);
//       Type type =TypeParameterResolver.resolveFieldType(field,
//                ParameterizedTypeImpl.make(SubClassA.class,new Type[]{Long.class},Client.class));

        Type type =TypeParameterResolver.resolveFieldType(field,
                Client.class.getDeclaredField("sa").getType());
        System.out.println("type:"+type.getClass());
        Type geneticType =TypeParameterResolver.resolveFieldType(field,
                Client.class.getDeclaredField("sa").getGenericType());
        System.out.println("geneticType:"+geneticType.getClass());


        ParameterizedType p = (ParameterizedType) geneticType ;
        System.out.println("getRawType"+p.getRawType());
        for (Type e:p.getActualTypeArguments()){
            System.out.println("ActualTypeArguments:"+e);
        }


    }




}
