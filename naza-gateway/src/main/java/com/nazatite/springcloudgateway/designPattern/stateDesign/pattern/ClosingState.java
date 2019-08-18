package com.nazatite.springcloudgateway.designPattern.stateDesign.pattern;

/**
 * @Author:elbert
 * @Date:2019-08-16
 */

public class ClosingState extends LiftState {
    @Override
    void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    void close() {
        System.out.println("电梯门要关了。。");
    }

    @Override
    void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    void stop() {
         super.context.setLiftState(Context.stoppingState);
         super.context.getLiftState().stop();
    }
}
