package com.nazarite.produce1.designPattern.observer.pattern;


import java.util.Observable;
import java.util.Observer;

/**
 * @Author:elbert
 * @Date:2019-08-25
 */

public class Wangqiang implements Observer {

    private void reportToQInshihuang(String context){
        System.out.println("王强正在报告："+context);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("王强开始报告了：");
        this.reportToQInshihuang(arg.toString());
        System.out.println("王强报告完毕");
    }
}
