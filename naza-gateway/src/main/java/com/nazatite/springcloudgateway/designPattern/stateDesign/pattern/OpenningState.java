package com.nazatite.springcloudgateway.designPattern.stateDesign.pattern;

/**
 * @Author:elbert
 * @Date:2019-08-16
 */

public class OpenningState extends LiftState {
    @Override
    void open() {
        System.out.println("电梯开门咯");
    }

    @Override
    void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    @Override
    void run() {
         //门开着就别上下跑了
    }

    @Override
    void stop() {
        System.out.println("电梯停止运行啦！-");
    }
}
