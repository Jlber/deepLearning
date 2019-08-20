package com.nazarite.produce1.designPattern.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author:elbert
 * @Date:2019-08-20
 */

public class Client {


    //用了导演类  封装性更好  将执行顺序也封装进去
    public static void main(String[] args) {
          Director director=new Director();
          BWMCarModel bwmCarModel=director.getBWMCar1();
          bwmCarModel.run();
          GeelyModel geelyModel1= director.getGeelyCar1();
          geelyModel1.run();
    }

//    public static void main(String[] args) {
//        ArrayList<String> list1=new ArrayList<>();
//        list1.add("start");
//        list1.add("stop");
//        BWMCarBuilder bwmCarBuilder=new BWMCarBuilder();
//        bwmCarBuilder.setSequence(list1);
//        BWMCarModel bwmCarModel =(BWMCarModel) bwmCarBuilder.getCarModel();
//        bwmCarModel.run();
//
//        ArrayList<String> list2=new ArrayList<>();
//        list2.add("start");
//        list2.add("alarm");
//        list2.add("stop");
//        GeelyCarBuilder geelyCarBuilder=new GeelyCarBuilder();
//        geelyCarBuilder.setSequence(list2);
//        GeelyModel geelyModel=(GeelyModel)geelyCarBuilder.getCarModel();
//        geelyModel.run();
//
//    }
}
