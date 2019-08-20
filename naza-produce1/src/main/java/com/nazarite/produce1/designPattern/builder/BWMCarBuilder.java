package com.nazarite.produce1.designPattern.builder;

import java.util.ArrayList;

/**
 * @Author:elbert
 * @Date:2019-08-20
 */

public class BWMCarBuilder extends CarBuilder {
    private BWMCarModel bwmCarModel=new BWMCarModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
           this.bwmCarModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bwmCarModel;
    }
}
