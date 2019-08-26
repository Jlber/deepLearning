package com.nazarite.produce1.designPattern.observer.origin;

/**
 * @Author:elbert
 * @Date:2019-08-25
 */

public class Wangqiang implements Observer {
    @Override
    public void update(String context) {
        System.out.println("王强开始报告了：");
        this.reportToQInshihuang(context);
        System.out.println("王强报告完毕");

    }

    private void reportToQInshihuang(String context){
        System.out.println("王强正在报告："+context);
    }
}
