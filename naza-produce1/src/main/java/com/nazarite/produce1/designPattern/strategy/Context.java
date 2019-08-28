package com.nazarite.produce1.designPattern.strategy;

/**
 * @Author:elbert
 * @Date:2019-08-26
 * 封装角色  这个是和代理模式的区别所在   代理模式的的话要和Strategy实现同一个接口
 */

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

   public void doThing(){
       this.strategy.exec();
    }
}
