package com.java.advanced.io;

import java.util.Scanner;

public class CharacterApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the world of warlords");
        System.out.println("Here you can create your character :");
        System.out.print("Name : ");
        String name = userInput.nextLine();

        System.out.println("Race (human or orch) : ");
        while (!userInput.hasNext("human") && !userInput.hasNext("orch")) {
            System.err.println("Invalid input, you need to type in human or orch");
            userInput.nextLine();
        }
        String race = userInput.nextLine();

        System.out.println("Difficulty (0 - easy, 1 - medium, 2 -  hard) : ");
        while (!userInput.hasNextByte(3) ) {
            System.err.println("Invalid input, you need to type in 0 or 1 or 2");
            userInput.nextLine();
        }
        byte difficulty = userInput.nextByte();

        System.out.println("Nightmare mode (true or false) : ");
        while (!userInput.hasNextBoolean() ) {
            System.err.println("Invalid input, you need to type in true or false");
            userInput.nextLine();
        }
        boolean nightmareMode = userInput.nextBoolean();

        System.out.println("---------------------------");
        System.out.println(" Your character is created : ");
        System.out.printf("Name \t%s\n",name);
        System.out.printf("Race \t%s\n",race);
        System.out.printf("Difficulty \t\t%d\n",difficulty);
        System.out.printf("Is Nightmode is on? \t\t%b\n",nightmareMode);



    }
}
