package com.nazarite.produce1.designPattern.interface_isolate.pattern;

/**
 * @Author:elbert
 * @Date:2019-08-19
 */

public class Searcher extends AbstractSearcher {

    public Searcher(IGoodVocalGirl iGoodVocalGirl) {
        super(iGoodVocalGirl);
    }

    public Searcher(IGoodLookingGirl iGoodLookingGirl) {
        super(iGoodLookingGirl);
    }

    public Searcher(IGoodVocalGirl iGoodVocalGirl, IGoodLookingGirl iGoodLookingGirl) {
        super(iGoodVocalGirl, iGoodLookingGirl);
    }

    @Override
    void show() {
        if (super.iGoodLookingGirl!=null){
            super.iGoodLookingGirl.goodLooking();
            super.iGoodLookingGirl.niceFigure();
        }
        if (super.iGoodVocalGirl!=null){
            super.iGoodVocalGirl.greatVocal();
        }


    }
}
