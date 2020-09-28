package com.company.model;

/**
 * The type Vegetable.
 */
public abstract class Vegetable {
    /**
     * Gets calories.
     *
     * @return the calories
     */
    public abstract int getCalories();

    /**
     * Gets name.
     *
     * @return the name
     */
    public abstract String getName();

    @Override
    public String toString() {
        return getName();
    }
}
