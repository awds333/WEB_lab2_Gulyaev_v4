package com.company.service;

import com.company.model.Vegetable;

import java.util.Comparator;

public class NameComparator implements Comparator<Vegetable> {
    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
