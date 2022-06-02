package com.java.advanced.innerclasses;

import com.java.advanced.enumcoding.Size;

class Pizza {
    private String name;
    private Size size;
    private double price;

    public Pizza(String name, Size size) {
        this.name = name;
        this.size = size;
        this.price = calculatePrize();
    }

    private double calculatePrize() {
        switch (size) {
            case SMALL:
                return 1.0;
            case MEDIUM:
                return 2.0;
            case LARGE:
                return 3.0;
            default:
                return 0.0;
        }
    }

    public String getName() {
        return name;
    }

    public Size getPizzaSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}

public class InnerClassesApp {
    private static boolean isPizzaReady(int bakingTime) {
        class Oven {
            public boolean isPizzaBaked() {
                if (bakingTime > 30) {
                    return true;
                }
                return false;
            }
        }
        Oven oven = new Oven();
        return oven.isPizzaBaked();
    }

    public static void main(String[] args) {
        Pizza firstPizza = new Pizza("Margherita", Size.MEDIUM);
        System.out.println("Name " + firstPizza.getName());
        Pizza secondPizza = new Pizza("Margherita", Size.MEDIUM) {
            @Override
            public String getName() {
                return "Anonumous";
            }
        };

        System.out.println("Name " + secondPizza.getName());
        if (isPizzaReady(40)) {
            System.out.println("The pizza is ready");
        } else {
            System.out.println("The pizza is not ready");
        }
        System.out.println("----------- Demonstrating Inner Class ----------");
        Cake cake=new Cake("Cup Cake", Size.LARGE);
        Cake.CakeSlice cakeSlice= cake.cutCakeSlice();
        System.out.println(" Cake Name "+ cake.getName());
        System.out.println(" Cake size is "+ cake.getSize());
        System.out.println(" Slice size is "+ cakeSlice.cakeSlice());

    }
}
