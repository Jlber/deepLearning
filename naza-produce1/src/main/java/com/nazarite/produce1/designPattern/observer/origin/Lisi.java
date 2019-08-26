package com.nazarite.produce1.designPattern.observer.origin;

/**
 * @Author:elbert
 * @Date:2019-08-25
 */

public class Lisi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯开始报告了：");
        this.reportToQInshihuang(context);
        System.out.println("李斯报告完毕");
        
    }

    private void reportToQInshihuang(String context){
        System.out.println("李斯正在报告："+context);
    }
}
