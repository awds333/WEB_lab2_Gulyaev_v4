package com.company.model;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * The interface Salad.
 */
public interface Salad {
    /**
     * Calories int.
     *
     * @return the int
     */
    public int calories();

    /**
     * Components array list.
     *
     * @return the array list
     */
    public ArrayList<Vegetable> components();

    /**
     * Fined special vegetables array list.
     *
     * @param demands the demands
     * @return the array list
     */
    public ArrayList<Vegetable> finedSpecialVegetables(Demands demands);

    /**
     * Sort.
     *
     * @param comparator the comparator
     */
    public void sort(Comparator<Vegetable> comparator);
}
