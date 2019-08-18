package com.nazatite.springcloudgateway.designPattern.stateDesign.pattern;


/**
 * @Author:elbert
 * @Date:2019-08-16
 */

public class Context {
    public final static OpenningState openningState=new OpenningState();
    public final static StoppingState stoppingState=new StoppingState();
    public final static RunningState  runningState =new RunningState();
    public final static ClosingState  closingState=new ClosingState();
   public LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //当前环境通知到各个实现类中
        this.liftState.setContext(this);
    }
    public void open(){
        this.liftState.open();
    }
    public void close(){
        this.liftState.close();
    }
    public void run(){
        this.liftState.run();
    }
    public void stop(){
        this.liftState.stop();
    }


    
}
