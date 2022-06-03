package com.java.advanced.innerclasses.staticnested;

import com.java.advanced.enumcoding.Size;

public class PizzaBuilderApp {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Pizza Cake", Size.LARGE)
                .withExtraCheeseNeeded(true)
                .withSaladNeeded(true)
                .Build();
        System.out.println("Name " + pizza.getName());
        System.out.println("Size " + pizza.getSize());
        System.out.println("Cheese? " + pizza.isExtraCheeseNeeded());
        System.out.println("Salad? " + pizza.isSaladNeeded());

    }
}
