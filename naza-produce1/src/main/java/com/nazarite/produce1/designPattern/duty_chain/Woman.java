package com.nazarite.produce1.designPattern.duty_chain;

/**
 * @Author:elbert
 * @Date:2019-09-02
 */

public class Woman implements IWomen {
    private int type;
    private String request;

    public Woman(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
