package com.nazatite.springcloudgateway.designPattern.stateDesign.pattern;

/**
 * @Author:elbert
 * @Date:2019-08-16
 */

public class StoppingState extends LiftState {
    @Override
    void open() {
             super.context.setLiftState(Context.openningState);
             super.context.getLiftState().open();
    }

    @Override
    void close() {
        //停止状态就不用关门了
//        super.context.setLiftState(Context.closingState);
//        super.context.getLiftState().close();
    }

    @Override
    void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();

    }

    @Override
    void stop() {
        System.out.println("电梯要停止运行了");
    }
}
