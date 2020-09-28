package com.company.service;

import com.company.model.Demands;
import com.company.model.Vegetable;

public class CaloriesDemand implements Demands {
    private Type type;
    private int calories;

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

    public enum Type {
        LessOrSame, MoreThenThat
    }
}
