package com.nazarite.produce1.designPattern.stateDesign.origin;

/**
 * @Author:elbert
 * @Date:2019-08-16
 * 电梯场景类
 */

public class LiftClient {
    public static void main(String[] args) {

             ILift iLift=new Lift();
             //停止状态 人可进去
             iLift.setState(ILift.CLOSING_STATE);
             //开门
             iLift.open();
             //关门
             iLift.close();
             //上楼
             iLift.run();
             iLift.stop();

    }
}
