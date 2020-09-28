package com.company.model;

/**
 * The type Tomato.
 */
public class Tomato extends Vegetable {
    @Override
    public int getCalories() {
        return 190;
    }

    @Override
    public String getName() {
        return "Tomato";
    }
}
