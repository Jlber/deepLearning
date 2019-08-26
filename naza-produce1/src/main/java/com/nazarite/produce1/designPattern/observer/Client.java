package com.nazarite.produce1.designPattern.observer;

/**
 * @Author:elbert
 * @Date:2019-08-25
 *
 * 观察者模式
 * 接口的形式聚合到被观察者类中，  可以动态添加新的观察者
 *
 * 也叫发布订阅 模式
 *
 * 定义了一种一对多的关系，   每当一个对象改变(被观察者)，其聚合或者依赖他的对象都会得到通知并自动更新
 */

public class Client {

    public static void main(String[] args) {
        Observer lisi=new Lisi();
        Observer wangqiang=new Wangqiang();
        Hanfeizi hanfeizi=new Hanfeizi();
        hanfeizi.addObserver(lisi);
        hanfeizi.addObserver(wangqiang);
        hanfeizi.haveLunch();
    }
}
