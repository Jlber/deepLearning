package com.nazarite.produce1.designPattern.interface_isolate.origin;

/**
 * @Author:elbert
 * @Date:2019-08-19
 */
public abstract class AbstractSearcher {
    protected IPrettyGirl iprettyGirl;

    public AbstractSearcher(IPrettyGirl iprettyGirl) {
        this.iprettyGirl = iprettyGirl;
    }

    abstract void show();
}
