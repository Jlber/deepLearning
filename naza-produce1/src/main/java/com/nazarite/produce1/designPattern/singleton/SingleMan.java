package com.nazarite.produce1.designPattern.singleton;

/**
 * @Author:elbert
 * @Date:2019-09-01
 */

public class SingleMan {

    //加volatile 为了防止指令重排序
    // 类的初始化包括三个步骤   1 分配内存 2 构造器初始化成员变量 形成实例 3 将对象指向内存(此时 判断==null 就会false))
    //线程A执行了 1，3 步骤，此时线程B 到了第一次if,就认为singMan不为空了，就返回了实例，而此时的实例是有问题的实例
    private static volatile SingleMan singleMan=null;
    static {
        System.out.println("初始化啦~~~~");
    }

    private SingleMan() {
    }

    //不加synchronized 可能会有多个singleMan，
    //线程A在实例化过程中且未实例化完毕时， 线程B进入if判断也为Null，就也进行了实例化  导致两个实例
    public static SingleMan getInstance(){
        if (singleMan==null){
            synchronized (SingleMan.class){
                if (singleMan==null){
                    singleMan=new SingleMan();
                }
            }

        }
        return singleMan;
    }


    public static void main(String[] args) {
        SingleMan.getInstance();
        SingleMan.getInstance();
    }
}
