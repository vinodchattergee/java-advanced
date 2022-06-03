package com.java.advanced.arrayfuntions;


import java.util.Arrays;

public class ArrayFunctionsApp {
    public static void main(String[] args) {
        int[] gamerPoints=new int[12];
        System.out.println(Arrays.toString(gamerPoints));
        System.out.println("All players starts with 200 pts");
        Arrays.fill(gamerPoints, 200);
        System.out.println(Arrays.toString(gamerPoints));
        System.out.println("The first 10 players lost 10 points");
        Arrays.fill(gamerPoints,0,10,190);
        System.out.println(Arrays.toString(gamerPoints));
        System.out.println("The 10th player gained 50 points");
        gamerPoints[9]+=50;
        System.out.println(Arrays.toString(gamerPoints));
        System.out.println("The gamer points in order");
        Arrays.sort(gamerPoints);
        System.out.println(Arrays.toString(gamerPoints));
        System.out.println("The last five points");
        int[] lastFivePoints=Arrays.copyOf(gamerPoints,5);
        System.out.println(Arrays.toString(lastFivePoints));
        System.out.println("The top five points");
        int[] topFivePoints=Arrays.copyOfRange(gamerPoints,gamerPoints.length-5,gamerPoints.length);
        System.out.println(Arrays.toString(topFivePoints));
        System.out.println("Compare two arrays");
        if(Arrays.equals(lastFivePoints,topFivePoints)){
            System.out.println("Last five and top five players have the same points");
        }else{
            System.out.println("Last five and top five players does not have the same points");
        }
        if(Arrays.binarySearch(gamerPoints,300)>=0){
            System.out.println("Someone reached 300 points. Game over!");
        }else{
            System.out.println("No one reached 300 points yet!");
        }

        gamerPoints[4]=300;
        if(Arrays.binarySearch(gamerPoints,300)>=0){
            System.out.println("Someone reached 300 points. Game over!");
        }else{
            System.out.println("No one reached 300 points yet!");
        }

        gamerPoints[4]=300;// Binary search will only work if the array is sorted.Thus the above doesnt work.
        Arrays.sort(gamerPoints);
        if(Arrays.binarySearch(gamerPoints,300)>=0){
            System.out.println("Someone reached 300 points. Game over!");
        }else{
            System.out.println("No one reached 300 points yet!");
        }
    }
}
