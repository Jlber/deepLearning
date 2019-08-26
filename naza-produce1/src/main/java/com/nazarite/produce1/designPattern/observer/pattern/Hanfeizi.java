package com.nazarite.produce1.designPattern.observer.pattern;

import java.util.Observable;

/**
 * @Author:elbert
 * @Date:2019-08-26
 */

public class Hanfeizi extends Observable {
    public void haveLunch() {
        System.out.println("韩非子:吃午饭了");
        super.setChanged();
        super.notifyObservers("韩非子吃午饭啦~~~");
    }

    public void haveSleep() {
        System.out.println("韩非子：睡觉啦");
        super.setChanged();
        super.notifyObservers("韩非子：睡觉啦~~~~~");
    }
}
