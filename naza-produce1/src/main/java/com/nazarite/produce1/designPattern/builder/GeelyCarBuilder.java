package com.nazarite.produce1.designPattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:elbert
 * @Date:2019-08-20
 */

public class GeelyCarBuilder extends CarBuilder {
    private GeelyModel geelyModel=new GeelyModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.geelyModel.setSequence(sequence);

    }

    @Override
    public CarModel getCarModel() {
        return this.geelyModel;
    }
}
