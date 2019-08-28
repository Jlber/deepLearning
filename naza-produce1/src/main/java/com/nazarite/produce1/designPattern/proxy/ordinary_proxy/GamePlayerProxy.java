package com.nazarite.produce1.designPattern.proxy.ordinary_proxy;

/**
 * @Author:elbert
 * @Date:2019-08-21
 *
 * 这个类相当于 策略模式的角色类， 这里实现了IGamePlayer 和GamePlayer一样， 策略类就不用实现
 *
 * jdk动态代理中 这个类是动态通过字节码生成的， 要重写和接口的方法
 */

public class GamePlayerProxy implements IGamePlayer {
    private GamePlayer gamePlayer;

    public GamePlayerProxy(String name) {
        try {
            this.gamePlayer = new GamePlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void login(String name, String passwd) {
               this.gamePlayer.login(name,passwd);
    }

    @Override
    public void killEnemy() {
        System.out.println(this.gamePlayer.getName()+"先进行了游走");
             this.gamePlayer.killEnemy();
    }

    @Override
    public void upgrade() {
           this.gamePlayer.upgrade();
    }
}
