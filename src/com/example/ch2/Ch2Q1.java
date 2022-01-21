package com.example.ch2;

import java.util.Scanner;

public class Ch2Q1 {


    public static void main(String[] args) {
        double miles;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter miles:");
        miles = in.nextDouble();

        double kilometers = miles * 1.6;

        System.out.println(miles + " miles " + Math.round(kilometers * 10d) / 10d + " Kilometers");
    }
}