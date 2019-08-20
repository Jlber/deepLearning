package com.nazarite.produce1.designPattern.builder;

import java.util.ArrayList;

/**
 * @Author:elbert
 * @Date:2019-08-20
 *
 * 导演类
 * 为每种车的不同执行顺序的种类建造车
 */

public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BWMCarBuilder bwmCarBuilder = new BWMCarBuilder();
    private GeelyCarBuilder geelyCarBuilder = new GeelyCarBuilder();


    public GeelyModel getGeelyCar1() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.geelyCarBuilder.setSequence(sequence);
        return (GeelyModel) geelyCarBuilder.getCarModel();
    }
    public GeelyModel getGeelyCar2() {
        this.sequence.clear();
        this.sequence.add("engineBoom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.geelyCarBuilder.setSequence(sequence);
        return (GeelyModel) this.geelyCarBuilder.getCarModel();
    }

    public BWMCarModel getBWMCar1(){
        this.sequence.clear();
        this.sequence.add("engineBoom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bwmCarBuilder.setSequence(sequence);
        return (BWMCarModel)this.bwmCarBuilder.getCarModel();
    }
}
