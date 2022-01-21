package com.example.ch6;
import java.util.Scanner;

public class Ch6Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        System.out.println(
                "The number of letters in the string: \"" +
                        string + "\": " + countLetters(string));
    }

    public static int countLetters(String s) {
        int lettersCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                lettersCount++;
        }
        return lettersCount;
        }
    }

