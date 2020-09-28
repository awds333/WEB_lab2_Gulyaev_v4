package com.company.service;

import com.company.model.Vegetable;

import java.util.Comparator;

public class CaloriesComparator implements Comparator<Vegetable> {
    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return o1.getCalories() - o2.getCalories();
    }
}
