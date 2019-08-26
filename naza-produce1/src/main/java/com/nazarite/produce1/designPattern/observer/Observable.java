package com.nazarite.produce1.designPattern.observer;

/**
 * @Author:elbert
 * @Date:2019-08-25
 *
 * 被观察者
 */
public interface Observable {

    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver(String  context);
}
