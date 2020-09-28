package com.company.model;

/**
 * The type Potato.
 */
public class Potato extends Vegetable {
    @Override
    public int getCalories() {
        return 150;
    }

    @Override
    public String getName() {
        return "Potato";
    }
}
