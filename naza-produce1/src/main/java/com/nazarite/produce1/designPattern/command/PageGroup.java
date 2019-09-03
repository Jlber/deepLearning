package com.nazarite.produce1.designPattern.command;

/**
 * @Author:elbert
 * @Date:2019-09-03
 */

public class PageGroup extends Group {
    @Override
    void find() {
        System.out.println("找到美工组了..");
    }

    @Override
    void add() {
        System.out.println("客户要求增加一个页面了");

    }

    @Override
    void delete() {
        System.out.println("客户要求删除一个页面了..");

    }

    @Override
    void plan() {
        System.out.println("客户要求页面变更计划..");

    }
}
