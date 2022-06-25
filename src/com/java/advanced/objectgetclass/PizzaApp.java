package com.java.advanced.objectgetclass;

import java.util.Arrays;

public class PizzaApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pizza pizza = new Pizza("Veg Extravagenza", Size.LARGE);
        System.out.println("Available sizes : ");
        for (Size size : Size.values()) {
            System.out.println(" - " + size.getDisplayText());
        }

        System.out.println("I ordered the Pizza" + pizza.getName() + " (" + pizza.getPizzaSize() + ") and the price is " + pizza.getPrice());

        Pizza samePizza = (Pizza) pizza.clone();
        System.out.println("I ordered the Pizza" + samePizza.getName() + " (" + samePizza.getPizzaSize() + ") and the price is " + samePizza.getPrice());

        System.out.println(pizza.equals(samePizza));
        System.out.println(pizza.hashCode());
        System.out.println(samePizza.hashCode());

        System.out.println("=====================");
        System.out.println(pizza.getClass().getSimpleName());
        System.out.println(pizza.getClass().getName());
        System.out.println(Arrays.toString(pizza.getClass().getFields()));
        System.out.println(Arrays.toString(pizza.getClass().getDeclaredFields()));
        System.out.println(Arrays.toString(pizza.getClass().getMethods()));
        System.out.println(Arrays.toString(pizza.getClass().getDeclaredMethods()));
        System.out.println(pizza.getClass().getSuperclass());
    }
}
