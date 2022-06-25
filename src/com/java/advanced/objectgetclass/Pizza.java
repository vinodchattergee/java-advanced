package com.java.advanced.objectgetclass;

public class Pizza implements Cloneable {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
