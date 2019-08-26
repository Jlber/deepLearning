package com.nazarite.produce1.designPattern.decorator;

/**
 * @Author:elbert
 * @Date:2019-08-26
 */

public  abstract class Decorator extends SchoolReport {
    private SchoolReport schoolReport;
    public Decorator(SchoolReport schoolReport) {
        this.schoolReport=schoolReport;
    }

    public void  report(){
     this.schoolReport.report();
    }
    public void sign(String sign){
        this.schoolReport.sign(sign);
    }
    
}
