package com.java.advanced.collectionlinkedlist;

import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> morningRoutine = new LinkedList<>();

//        morningRoutine.add("Brushing my teath");
//
//        if (!morningRoutine.isEmpty()) {
//            System.out.println(morningRoutine.getFirst());
//        }
//        if (!morningRoutine.isEmpty()) {
//            System.out.println(morningRoutine.peekFirst().toLowerCase());
//        }
//        morningRoutine.add("Taking dog for a walk");
//        morningRoutine.add("Doing 32 pushups");
//
//        System.out.println(morningRoutine);
        morningRoutine.add("2.Brushing my teath");
        morningRoutine.addFirst("2.Taking dog for a walk");
        morningRoutine.push("2.Doing 32 pushups");
        morningRoutine.offer("2.Doing 32 pushups again");
        System.out.println(morningRoutine);

        morningRoutine.pop();
        System.out.println(morningRoutine);

    }
}
