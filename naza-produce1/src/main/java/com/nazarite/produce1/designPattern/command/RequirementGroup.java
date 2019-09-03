package com.nazarite.produce1.designPattern.command;

/**
 * @Author:elbert
 * @Date:2019-09-03
 */

public class RequirementGroup extends Group {


    @Override
    void find() {
        System.out.println("找到需求组...");
    }

    @Override
    void add() {
        System.out.println("客户要增加一个需求了。..");
    }

    @Override
    void delete() {
        System.out.println("客户要删除一个需求了..");
    }

    @Override
    void plan() {
        System.out.println("客户要要求给出变更计划..");
    }
}
