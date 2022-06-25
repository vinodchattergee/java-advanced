package com.java.advanced.collectionsvector;

import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        Vector<String> todoVector=new Vector<>(2,3);
        System.out.println("Initial capacity is "+  todoVector.capacity());
        todoVector.add("Clean Garden");
        todoVector.add("Paint walls");
        todoVector.add("Take the dog out");
        System.out.println("The first element is "+  todoVector.firstElement());
        System.out.println("The last element is "+  todoVector.lastElement());
        System.out.println("Initial capacity is "+  todoVector.capacity());


    }
}
