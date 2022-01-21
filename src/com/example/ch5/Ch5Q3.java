package com.example.ch5;

public class Ch5Q3 {
    public static void main(String[] args) {

        System.out.println("Celsius      Farenheit");

        for (int i = 0; i <= 100; i+=2) {
            final double farenheit = (double) i * 9/5 + 32;
            System.out.printf("%-15d%7.1f\n", i, farenheit);
        }
    }
}
