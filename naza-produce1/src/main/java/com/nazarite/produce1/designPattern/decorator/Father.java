package com.nazarite.produce1.designPattern.decorator;

/**
 * @Author:elbert
 * @Date:2019-08-26
 *
 * 装饰模式： 封装成绩单
 *   动态的给对象增加功能，动态地撤销
 *   不用改原来的代码 就能对类的方法进行增强
 *
 * 是一种特殊的代理模式
 * L
 */

public class Father {
    public static void main(String[] args) {
        SchoolReport schoolReport=new HighSchoolReport();
        schoolReport=new HignScoreDecorator(schoolReport);
        schoolReport=new SortDecorator(schoolReport); //这样 若不需要排名 就去掉这段代码即可 不用修改类信息
        schoolReport.report();
        schoolReport.sign("王芳");
    }
}
