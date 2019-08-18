package com.nazatite.springcloudgateway.designPattern.stateDesign.pattern;

/**
 * @Author:elbert
 * @Date:2019-08-16
 *
 * 抽象电梯状态
 */
public abstract class LiftState {
    //定义上下文环境角色   封装了状态变换引起的功能变化
    protected Context context;
    void setContext(Context context){
        this.context=context;
    }
    abstract void open();
    abstract void close();
    abstract void run();
    abstract void stop();
}
