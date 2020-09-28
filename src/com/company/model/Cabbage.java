package com.company.model;

/**
 * The type Cabbage.
 */
public class Cabbage extends Vegetable {
    @Override
    public int getCalories() {
        return 60;
    }

    @Override
    public String getName() {
        return "Cabbage";
    }
}