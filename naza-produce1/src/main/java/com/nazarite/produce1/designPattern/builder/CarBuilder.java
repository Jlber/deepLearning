package com.nazarite.produce1.designPattern.builder;

import java.util.ArrayList;

/**
 * @Author:elbert
 * @Date:2019-08-20
 */

public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
