package com.nazarite.produce1.designPattern.duty_chain;

/**
 * @Author:elbert
 * @Date:2019-09-02
 */

public class SonHandle extends Handle {

    public SonHandle() {
        super(Handle.SON_LEVEL);
    }

    @Override
    protected void response(IWomen iWomen) {
        System.out.println("--女人向儿子请示");
        System.out.println(iWomen.getRequest());
        System.out.println("--儿子同意---");
    }
}
