package com.nazarite.produce1.designPattern.stateDesign.pattern;

/**
 * @Author:elbert
 * @Date:2019-08-17
 * 状态模式定义  一个对象内在状态改变时，其对应的动作也跟着改变(表面上这个对象换了个类一样)
 *
 * 状态模式  用多个状态类代替了switch和if else
 * 现在要增加状态  只需要增加状态类 再分别重写对应的方法即可 符合迪米特法则
 */

public class Client {
    public static void main(String[] args) {
        Context context=new Context();
        context.setLiftState(new RunningState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }


}
