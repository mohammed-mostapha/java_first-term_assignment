package com.example.ch4;
import java.util.Scanner;

public class Ch4Q13 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a letter: ");

        if(keyboard.hasNext()) {
            String input = keyboard.nextLine();
            Integer inputLength = input.length();
            if(inputLength > 1) {
                System.out.println("Please enter only one character");
            }else {
                char ch = input.charAt(0);
                if(Character.isLetter(ch)) {
                    switch (Character.toUpperCase(ch)) {
                        case 'A':
                        case 'E':
                        case 'I':
                        case 'O':
                        case 'U': System.out.println(ch + " is a vowel");
                        break;
                        default: System.out.println(ch + " is a consonant");
                    }
                }else {
                    System.out.println(ch + " is an invalid input");
                }
            }

        }

    }
}
