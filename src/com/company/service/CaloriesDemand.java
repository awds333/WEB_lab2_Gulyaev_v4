package com.company.service;

import com.company.model.Demands;
import com.company.model.Vegetable;

/**
 * The type Calories demand.
 */
public class CaloriesDemand implements Demands {
    private Type type;
    private int calories;

    /**
     * Instantiates a new Calories demand.
     *
     * @param type     the type
     * @param calories the calories
     */
    public CaloriesDemand(Type type, int calories) {
        this.type = type;
        this.calories = calories;
    }

    @Override
    public boolean isAppropriate(Vegetable vegetable) {
        if (type == Type.LessOrSame) {
            return vegetable.getCalories() <= calories;
        } else {
            return vegetable.getCalories() > calories;
        }
    }

    /**
     * The enum Type.
     */
    public enum Type {
        /**
         * Less or same type.
         */
        LessOrSame,
        /**
         * More then that type.
         */
        MoreThenThat
    }
}
