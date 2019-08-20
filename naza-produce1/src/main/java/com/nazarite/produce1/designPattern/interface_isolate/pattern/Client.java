package com.nazarite.produce1.designPattern.interface_isolate.pattern;


/**
 * @Author:elbert
 * @Date:2019-08-19
 *
 * 接口隔离原则
 */

public class Client {
    public static void main(String[] args) {
        IGoodVocalGirl iGoodVocalGirl=new PrettyGirl("丽君");
        IGoodLookingGirl iGoodLookingGirl=new PrettyGirl("丽君");
       // PrettyGirl prettyGirl=new PrettyGirl("丽君");
        AbstractSearcher abstractSearcher=new Searcher(iGoodVocalGirl,iGoodLookingGirl);
        abstractSearcher.show();
    }
}
