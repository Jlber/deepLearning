package com.nazarite.produce1.designPattern.decorator;

/**
 * @Author:elbert
 * @Date:2019-08-26
 */

public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
      private void sortReport(){
          System.out.println("这次我的排名是 28");
      }
    @Override
    public void report() {
        sortReport();
        super.report();
    }
}
