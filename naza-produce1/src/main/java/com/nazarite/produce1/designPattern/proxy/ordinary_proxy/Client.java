package com.nazarite.produce1.designPattern.proxy.ordinary_proxy;

/**
 * @Author:elbert
 * @Date:2019-08-21
 * 普通代理   调用者只知道代理者存在  不用知道被代理者是谁
 */

public class Client {

    public static void main(String[] args) {
       IGamePlayer iGamePlayer= new GamePlayerProxy("丽君");

       iGamePlayer.login("jeq","111");
       iGamePlayer.killEnemy();
       iGamePlayer.upgrade();
    }
}
