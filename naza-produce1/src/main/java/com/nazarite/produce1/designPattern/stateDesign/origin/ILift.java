package com.nazarite.produce1.designPattern.stateDesign.origin;

/**
 * @Author:elbert
 * @Date:2019-08-16
 */
public interface ILift {
    //电梯四个状态
     int OPENNING_STATE=1;
     int CLOSING_STATE=2;
     int RUNNING_STATE=3;
     int STOPPING_STATE=4;

     void setState(int state);

    void close();


    void open();

    void run();

    void stop();
}
