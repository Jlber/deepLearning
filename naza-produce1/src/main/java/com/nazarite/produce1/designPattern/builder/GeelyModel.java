package com.nazarite.produce1.designPattern.builder;

/**
 * @Author:elbert
 * @Date:2019-08-20
 */

public class GeelyModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("吉利车 启动啦");
    }

    @Override
    protected void stop() {
        System.out.println("吉利车 停车啦");
    }

    @Override
    protected void alarm() {
        System.out.println("吉利车 鸣笛啦");
    }

    @Override
    protected void engineBoom() {
        System.out.println("吉利车 引擎隆隆啦");
    }
}
