package com.company.model;

/**
 * The type Pepper.
 */
public class Pepper extends Vegetable {
    @Override
    public int getCalories() {
        return 30;
    }

    @Override
    public String getName() {
        return "Pepper";
    }
}
