package com.java.advanced.enumcoding;

public class PizzaApp {
    public static void main(String[] args) {
        Pizza pizza=new Pizza("Veg Extravagenza", Size.LARGE);
        System.out.println("Available sizes : " );
        for(Size size : Size.values()){
            System.out.println(" - "+ size.getDisplayText());
        }

        System.out.println("I ordered the Pizza" + pizza.getName() + " (" + pizza.getPizzaSize() +") and the price is "+ pizza.getPrice());
    }
}
