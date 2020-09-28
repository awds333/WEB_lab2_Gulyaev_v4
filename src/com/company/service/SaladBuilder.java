package com.company.service;

import com.company.model.Demands;
import com.company.model.Salad;
import com.company.model.Vegetable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class SaladBuilder {
    private ArrayList<Vegetable> components = new ArrayList<>();
    private Log log;

    public SaladBuilder withComponent(Vegetable vegetable) {
        components.add(vegetable);
        return this;
    }

    public SaladBuilder withLog(Log log) {
        this.log = log;
        return this;
    }

    public Salad build() {
        if (components.isEmpty())
            throw new RuntimeException("No components!");

        return new Salad() {
            @Override
            public ArrayList<Vegetable> components() {
                StringBuilder builder = new StringBuilder("components: {");
                components.forEach(veg -> {
                    builder.append(veg.getName());
                    builder.append(" ");
                });
                builder.append("}");
                log.logMessage(builder.toString());
                return components;
            }

            @Override
            public int calories() {
                int calories = 0;
                for (Vegetable vegetable : components) {
                    calories += vegetable.getCalories();
                }
                log("Salad calories:" + calories);
                return calories;
            }

            @Override
            public ArrayList<Vegetable> finedSpecialVegetables(Demands demands) {
                ArrayList<Vegetable> result = new ArrayList<>(components.stream().filter(demands::isAppropriate).collect(Collectors.toList()));
                if(result.isEmpty()){
                    log("Nothing found");
                }
                else {
                    AtomicInteger calories = new AtomicInteger();
                    StringBuilder builder = new StringBuilder("found: {");
                    result.forEach(veg -> {
                        builder.append(veg.getName());
                        builder.append(" ");
                        calories.addAndGet(veg.getCalories());
                    });
                    builder.append("} (" + calories.get() + " calories)");
                    log.logMessage(builder.toString());
                }
                return result;
            }

            @Override
            public void sort(Comparator<Vegetable> comparator) {
                components.sort(comparator);
                StringBuilder builder = new StringBuilder("components: {");
                components.forEach(veg -> {
                    builder.append(veg.getName());
                    builder.append(" ");
                });
                builder.append("}");
                log.logMessage(builder.toString());
            }

            private void log(String message) {
                if (log != null)
                    log.logMessage(message);
            }
        };
    }
}
