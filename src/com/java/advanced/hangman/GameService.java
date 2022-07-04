package com.java.advanced.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameService {

    private static final String SRC_COM_ADVANCED_HANGMAN_WORD_TXT = "src/com/java/advanced/hangman/words.txt";

    private List<String> getTheWords() throws FileNotFoundException {
        List<String> words = new ArrayList<>();
        File wordsFile = new File(SRC_COM_ADVANCED_HANGMAN_WORD_TXT);
        Scanner wordScanner = new Scanner(wordsFile);
        while (wordScanner.hasNext()) {
            words.add(wordScanner.nextLine());
        }
        return words;
    }

    private String getRandomWord() throws FileNotFoundException {
        List<String> words = getTheWords();
        Random randomNumberGenerator = new Random();
        int randomIndex = randomNumberGenerator.nextInt(words.size());
        return words.get(randomIndex);
    }

    public void start() throws FileNotFoundException {
        Scanner inputScanner = new Scanner(System.in);
        String randomWord = getRandomWord();
        char[] randomWordArray = randomWord.toCharArray();
        char[] guessingWordArray = new char[randomWord.length()];
        Arrays.fill(guessingWordArray, '_');
        int numberOfChances = randomWord.length();

        System.out.println("The game is started..");
        System.out.println("The number of chances are : " + numberOfChances);
        System.out.println("The word " + new String(guessingWordArray));

        while (true) {
            System.out.println("-----------------------------------");
            System.out.print("please type in a letter : ");
            String inputText = inputScanner.nextLine();
            char letter = inputText.charAt(0);
            boolean isGuessingCorrect = false;
            for (int i = 0; i < randomWordArray.length; i++) {
                if (letter == randomWordArray[i]) {
                    guessingWordArray[i] = letter;
                    isGuessingCorrect = true;
                }
            }
            if (isGuessingCorrect) {
                System.out.println("It was a good guess!");
                if(isGameFinished(guessingWordArray)){
                    break;
                }
            } else {
                numberOfChances--;
                if (numberOfChances == 0){
                    System.out.println("Sorry! you ran out of chances");
                    System.out.println("The right word was : "+ randomWord);
                    break;
                }
                System.out.println("Your number of chances is decreased  to : " + numberOfChances);
                System.out.println("Try new letter");
            }
            System.out.println("The word " + new String(guessingWordArray));
        }

    }

    private boolean isGameFinished(char[] guessingWordArray) {
        for (int i = 0; i < guessingWordArray.length; i++) {
            if(guessingWordArray[i]=='_'){
                return false;
            }
        }
        System.out.println("Congratulations! You won");
        System.out.println("The word " + new String(guessingWordArray));
        return true;
    }
}
