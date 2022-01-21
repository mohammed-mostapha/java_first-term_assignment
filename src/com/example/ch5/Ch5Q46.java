package com.example.ch5;
import java.util.Scanner;

public class Ch5Q46 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String string = keyboard.nextLine();

        String reverse = "";
        for (int i = string.length() - 1; i >=0; i--) {
            reverse += string.charAt(i);
        }

        System.out.println("The reversed string is: " + reverse);
    }
}
