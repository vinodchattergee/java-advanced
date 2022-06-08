package com.java.advanced.mathfuntions;

public class MathFunctionsApp {
    public static void main(String[] args) {
        double temperatureYesterday = -5.6;
        double temperatureToday = -Math.random() * 10;
        System.out.println("Absolute temperature today "+ Math.abs(temperatureToday));
        System.out.println("Min temperature today "+ Math.min(temperatureToday,temperatureYesterday));
        System.out.println("Max temperature today "+ Math.max(temperatureToday,temperatureYesterday));
        System.out.println("round temperature today "+ Math.round(temperatureToday));
        System.out.println("ceil temperature today "+ Math.ceil(temperatureToday));
        System.out.println("floor temperature today "+ Math.floor(temperatureToday));
        System.out.println("power temperature today "+ Math.pow(temperatureToday,2));
        System.out.println("Sq Root temperature today "+ Math.sqrt(temperatureToday));// sqrt dont work with negative number
        System.out.println("Sq Root temperature today "+ Math.sqrt(Math.abs(temperatureToday)));
    }
}
