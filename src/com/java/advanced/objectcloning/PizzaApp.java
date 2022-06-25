package com.java.advanced.objectcloning;

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
    }
}
