package com.nazarite.produce1.designPattern.decorator;

/**
 * @Author:elbert
 * @Date:2019-08-26
 */

public class HighSchoolReport extends SchoolReport {
    @Override
    void report() {
        System.out.println("尊敬的家长...");
        System.out.println("  您的还在成绩如下");

        System.out.println("数学88，语文45，化学77");
        System.out.println("家长签名:   ");

    }

    @Override
    void sign(String name) {
        System.out.println("家长签名： "+name);
    }
}
