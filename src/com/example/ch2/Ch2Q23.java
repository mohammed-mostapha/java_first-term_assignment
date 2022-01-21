package com.example.ch2;

import java.util.Scanner;

public class Ch2Q23 {
    public static void main(String[] args) {
        double distanceToDrive;
        double milesPerGallon;
        double pricePerGallon;
        double cost;

        System.out.println("Enter the distance to drive: ");
        Scanner keyboard = new Scanner(System.in);
        distanceToDrive = keyboard.nextFloat();

        System.out.println("Enter miles per gallon: ");
        keyboard = new Scanner(System.in);
        milesPerGallon = keyboard.nextFloat();

        System.out.println("Enter price per gallon: ");
        keyboard = new Scanner(System.in);
        pricePerGallon = keyboard.nextFloat();

        cost = (distanceToDrive / milesPerGallon) * pricePerGallon;

        System.out.println("The cost of driving is: " + "$" + Math.round(cost * 100d) / 100d);
    }
}
