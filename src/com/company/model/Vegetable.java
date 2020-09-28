package com.company.model;

public abstract class Vegetable {
    public abstract int getCalories();
    public abstract String getName();

    @Override
    public String toString() {
        return getName();
    }
}
