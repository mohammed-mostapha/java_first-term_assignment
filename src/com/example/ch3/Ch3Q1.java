package com.example.ch3;
import java.util.Scanner;

public class Ch3Q1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");

        float a = keyboard.nextFloat();
        float b = keyboard.nextFloat();
        float c = keyboard.nextFloat();

        double discriminant = Math.pow(b, 2) - 4 *(a) * (c);

        if(discriminant > 0) {
            System.out.println("Two roots");
        }else if(discriminant == 0) {
            System.out.println("One root");
        }else {
            System.out.println("The equation has no real roots");
        }
    }
}
