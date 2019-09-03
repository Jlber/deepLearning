package com.nazarite.produce1.designPattern.command;

/**
 * @Author:elbert
 * @Date:2019-09-03
 */

public class CodeGroup extends Group {
    @Override
    void find() {
        System.out.println("找到研发组..");
    }

    @Override
    void add() {
        System.out.println("客户要求增加一个功能...");
    }

    @Override
    void delete() {
        System.out.println("客户要求删除一个功能》。");
    }

    @Override
    void plan() {
        System.out.println("客户要求给出功能计划..");
    }
}
