package com.company.model;

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