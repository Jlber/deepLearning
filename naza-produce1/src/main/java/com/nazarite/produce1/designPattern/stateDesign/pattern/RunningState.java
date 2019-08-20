package com.nazarite.produce1.designPattern.stateDesign.pattern;

/**
 * @Author:elbert
 * @Date:2019-08-16
 */

public class RunningState extends LiftState {
    @Override
    void open() {
       //运行时就不开门了
    }

    @Override
    void close() {
         //本来就关门的
    }

    @Override
    void run() {
        System.out.println("开始运行");
    }

    @Override
    void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
