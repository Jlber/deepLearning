package com.nazarite.produce1.designPattern.proxy.dynamic_proxy;

import com.nazarite.produce1.designPattern.proxy.ordinary_proxy.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author:elbert
 * @Date:2019-08-21
 */

public class Client {


    public static void main(String[] args) {
        IGamePlayer iGamePlayer = new GamePlayer("jeq");
        InvocationHandler invocationHandler = new GameplayerIH(iGamePlayer);
        IGamePlayer proxy =(IGamePlayer)Proxy.newProxyInstance(iGamePlayer.getClass().getClassLoader(),
                new Class<?>[] {IGamePlayer.class},invocationHandler);
        proxy.login("jeq","11");
        proxy.killEnemy();
        proxy.upgrade();



    }
}
