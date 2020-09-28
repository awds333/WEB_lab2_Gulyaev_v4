package com.company.model;

import java.util.ArrayList;
import java.util.Comparator;

public interface Salad {
    public int calories();
    public ArrayList<Vegetable> components();
    public ArrayList<Vegetable> finedSpecialVegetables(Demands demands);
    public void sort(Comparator<Vegetable> comparator);
}
