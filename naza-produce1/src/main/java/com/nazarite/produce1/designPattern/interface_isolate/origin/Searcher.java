package com.nazarite.produce1.designPattern.interface_isolate.origin;

import com.nazarite.produce1.designPattern.interface_isolate.origin.AbstractSearcher;
import com.nazarite.produce1.designPattern.interface_isolate.origin.IPrettyGirl;

/**
 * @Author:elbert
 * @Date:2019-08-19
 */

public class Searcher extends AbstractSearcher {
    public Searcher(IPrettyGirl iprettyGirl) {
        super(iprettyGirl);
    }

    @Override
    public void show() {
        super.iprettyGirl.goodLooking();
        super.iprettyGirl.greatVocal();
        super.iprettyGirl.niceFigure();
    }
}
