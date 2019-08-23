package com.nazarite.produce1.designPattern.proxy.dynamic_proxy;

import com.nazarite.produce1.designPattern.proxy.ordinary_proxy.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.stream.Stream;

/**
 * @Author:elbert
 * @Date:2019-08-21
 *
 * 这里生成的   proxy 实际类型不是IGamePlayer
 * 而是proxy真实类型是com.sun.proxy.$Proxy0 $Proxy0是动态生成的（在ProxyClassFactory里的apply方法里生成)
 * 所以 proxy.login 会调用Invocationhandle的invoke来调用   需要看字节码
 * proxy调用的是被代理类GamePlayer的所有接口类的方法，所以若被代理的类没有实现任何接口，就不能被jdk代理，要用Cglib进行代理
 *
 * Cglib采用的是继承方式增强方法，所以final的类就不能被代理
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
//
//        System.out.println("proxy的实际类型"+proxy.getClass());
//        System.out.println("proxy父类"+proxy.getClass().getSuperclass());
//        Stream.of(proxy.getClass().getMethods()).forEach(m-> System.out.println("proxy的方法"+m.getName()));
//


    }
}
