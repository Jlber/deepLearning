package com.nazarite.produce1.designPattern.proxy.dynamic_proxy;

import com.nazarite.produce1.designPattern.proxy.ordinary_proxy.IGamePlayer;

/**
 * @Author:elbert
 * @Date:2019-08-21
 */

public class GamePlayer implements IGamePlayer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GamePlayer(String name) {
        this.name = name;
    }

    public GamePlayer(IGamePlayer iGamePlayer, String name) throws Exception {
        if (iGamePlayer==null){
            throw new Exception("无法创建真实角色");
        }else {
            this.name=name;
        }
    }

    @Override
    public void login(String user, String passwd) {
        System.out.println(this.name + " 登录啦,用户名是"+name);
    }

    @Override
    public void killEnemy() {
        System.out.println("杀了一次敌人");
    }

    @Override
    public void upgrade() {
        System.out.println("升级啦");
    }
}
