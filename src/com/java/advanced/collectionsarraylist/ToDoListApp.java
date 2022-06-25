package com.java.advanced.collectionsarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ToDoListApp {
    public static void main(String[] args) {
        ArrayList<String> urgentTasks=new ArrayList<>();
        ArrayList<String> allTasks=new ArrayList<>();

        urgentTasks.add("Repairing the car");
        urgentTasks.add("paying cheques");
        allTasks.add("Cleaning bathroom");
        allTasks.add("Cleaning lawn");
        allTasks.add("going to grocery shop");

        Collections.swap(urgentTasks,0,1);
        System.out.println("Urgent tasks");
        for(String task:urgentTasks)
            System.out.println(task);

        urgentTasks.clear();
        allTasks.addAll(urgentTasks);
        Collections.sort(allTasks,Collections.reverseOrder());

        System.out.println("all tasks");
        for(String task:allTasks)
            System.out.println(task);


        System.out.println("------");
        if(allTasks.contains("Cleaning bathroom")){
            System.out.println("I havent cleaned the bathroom");
        }
        System.out.println("------------");
        if(allTasks.contains("Cleaning bathroom")){
            System.out.println("I havent cleaned the bathroom");
        }

    }
}
