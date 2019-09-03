package com.nazarite.produce1.designPattern.duty_chain;

/**
 * @Author:elbert
 * @Date:2019-09-02
 */

public class HusbandHandle extends Handle {
    public HusbandHandle() {

        super(Handle.HUSBAND_LEVEL);
    }

    @Override
    protected void response(IWomen iWomen) {
        System.out.println("--女人向丈夫请示");
        System.out.println(iWomen.getRequest());
        System.out.println("--丈夫同意---");

    }
}
