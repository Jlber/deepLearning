package com.nazarite.produce1.designPattern.decorator;

/**
 * @Author:elbert
 * @Date:2019-08-26
 */

public class HignScoreDecorator extends Decorator {
    public HignScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportHighScore(){
        System.out.println("这次的语文最高分60，数学最高分90");
    }
    @Override
    public void report() {
        reportHighScore();
        super.report();
    }
}
