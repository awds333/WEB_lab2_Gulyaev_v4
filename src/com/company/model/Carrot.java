package com.company.model;

/**
 * The type Carrot.
 */
public class Carrot extends Vegetable{
    @Override
    public int getCalories() {
        return 100;
    }

    @Override
    public String getName() {
        return "Carrot";
    }
}
