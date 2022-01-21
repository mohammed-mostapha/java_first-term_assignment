package com.example.ch2;
import java.util.Scanner;

public class Ch2Q10 {
    public static void main(String[] args) {
        double M;
        double initialTemperature;
        double finalTemperature;

        System.out.println("Enter the amout of water in kilograms: ");
        Scanner keyboard = new Scanner(System.in);
        M = keyboard.nextFloat();

        System.out.println("Enter the initial temperature: ");
        keyboard = new Scanner(System.in);
        initialTemperature = keyboard.nextFloat();

        System.out.println("Enter the final temperature: ");
        keyboard = new Scanner(System.in);
        finalTemperature = keyboard.nextFloat();

        double Q = M * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is: " + Q);
    }
}
