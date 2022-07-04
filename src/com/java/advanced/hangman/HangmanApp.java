package com.java.advanced.hangman;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class HangmanApp {
    public static void main(String[] args) throws FileNotFoundException {
        GameService gameService = new GameService();
        gameService.start();
    }
}
