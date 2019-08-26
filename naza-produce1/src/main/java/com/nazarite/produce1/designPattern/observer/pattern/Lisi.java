package com.nazarite.produce1.designPattern.observer.pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author:elbert
 * @Date:2019-08-26
 */

public class Lisi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯开始报告了：");
        this.reportToQInshihuang(arg.toString());
        System.out.println("李斯报告完毕");
    }

    private void reportToQInshihuang(String context){
        System.out.println("李斯正在报告："+context);
    }
}
