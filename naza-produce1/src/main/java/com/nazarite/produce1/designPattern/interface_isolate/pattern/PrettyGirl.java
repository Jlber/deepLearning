package com.nazarite.produce1.designPattern.interface_isolate.pattern;

/**
 * @Author:elbert
 * @Date:2019-08-19
 */

public class PrettyGirl implements IGoodLookingGirl,IGoodVocalGirl {
    private String name;

    public PrettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(name+"很好看...");
    }

    @Override
    public void niceFigure() {
        System.out.println(name+"气质很好");
    }

    @Override
    public void greatVocal() {
        System.out.println(name+"口才很好");
    }
}
