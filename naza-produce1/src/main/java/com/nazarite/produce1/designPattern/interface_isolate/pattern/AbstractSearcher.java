package com.nazarite.produce1.designPattern.interface_isolate.pattern;

/**
 * @Author:elbert
 * @Date:2019-08-19
 */

public abstract class AbstractSearcher {
    protected IGoodVocalGirl iGoodVocalGirl;
    protected IGoodLookingGirl iGoodLookingGirl;

    public AbstractSearcher(IGoodVocalGirl iGoodVocalGirl) {
        this.iGoodVocalGirl = iGoodVocalGirl;
    }

    public AbstractSearcher(IGoodLookingGirl iGoodLookingGirl) {
        this.iGoodLookingGirl = iGoodLookingGirl;
    }

    public AbstractSearcher(IGoodVocalGirl iGoodVocalGirl, IGoodLookingGirl iGoodLookingGirl) {
        this.iGoodVocalGirl = iGoodVocalGirl;
        this.iGoodLookingGirl = iGoodLookingGirl;
    }

    abstract void show();
}
