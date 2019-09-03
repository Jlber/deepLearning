package com.nazarite.produce1.designPattern.duty_chain;

/**
 * @Author:elbert
 * @Date:2019-09-02
 */

public class FatherHandle extends Handle {
    public FatherHandle() {
        super(Handle.FATHER_LEVEL);
    }

    @Override
    protected void response(IWomen iWomen) {
        System.out.println("--女人向父亲请示");
        System.out.println(iWomen.getRequest());
        System.out.println("--父亲同意---");

    }
}
