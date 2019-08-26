package com.nazarite.produce1.designPattern.observer.origin;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:elbert
 * @Date:2019-08-25
 */

public class Hanfeizi implements IHanfeizi, Observable {
    private List<Observer> list=new ArrayList<>();
    @Override
    public void haveLunch() {
        System.out.println("韩非子:吃午饭了");
        this.notifyObserver("韩非子吃午饭了..");
    }

    @Override
    public void haveSleep() {
        System.out.println("韩非子:睡觉了");
        this.notifyObserver("韩非子睡觉了..");

    }

    @Override
    public void addObserver(Observer observer) {
            this.list.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.list.remove(observer);

    }

    @Override
    public void notifyObserver(String  context) {
        this.list.forEach(observer -> observer.update(context));
        

    }
}
