package com.company;

import com.company.model.*;
import com.company.service.*;

public class Main {

    public static void main(String[] args) {
        Salad salad = new SaladBuilder()
                .withComponent(new Carrot())
                .withComponent(new Cabbage())
                .withComponent(new Potato())
                .withComponent(new Pepper())
                .withComponent(new Carrot())
                .withComponent(new Tomato())
                .withLog(new ConsoleLog())
                .build();

        salad.calories();
        salad.finedSpecialVegetables(new CaloriesDemand(CaloriesDemand.Type.LessOrSame, 110));
        salad.components();
        salad.sort(new NameComparator());
        salad.sort(new CaloriesComparator());
    }
}
