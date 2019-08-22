package com.nazarite.produce1.designPattern.proxy.ordinary_proxy;

/**
 * @Author:elbert
 * @Date:2019-08-21
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
