package com.nazarite.produce1.designPattern.builder;

/**
 * @Author:elbert
 * @Date:2019-08-20
 */

public class BWMCarModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车 开车啦");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车 停车啦");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车 鸣笛啦");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车 引擎隆隆啦");
    }
}
