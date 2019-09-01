package com.nazarite.produce1.javagrammar.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:elbert
 * @Date:2019-08-29
 */

public class MapClient {
    public static void main(String[] args) {
        List<String> strs=new ArrayList<>();
        strs.add("sss");
        strs.add("fgg");
        strs.add("sss");

        Map<String, List<String>> map=new HashMap<>();
        for (String s:strs){
                              //如果map里有对应的key，就返回原来的值，没key，就返回 正在设置的值
            List<String> sublist= map.computeIfAbsent(s,name->new ArrayList<>());
            sublist.add(s);//返回后 再进行设置值
        }
        System.out.println("xxx");


    }
}
