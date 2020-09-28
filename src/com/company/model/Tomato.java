package com.company.model;

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
