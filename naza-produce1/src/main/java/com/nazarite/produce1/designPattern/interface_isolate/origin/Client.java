package com.nazarite.produce1.designPattern.interface_isolate.origin;

/**
 * @Author:elbert
 * @Date:2019-08-19
 *
 * 接口隔离原则
 */

public class Client {
    public static void main(String[] args) {
        AbstractSearcher abstractSearcher=new Searcher(new PrettyGirl("丽君"));
        abstractSearcher.show();
    }
}
