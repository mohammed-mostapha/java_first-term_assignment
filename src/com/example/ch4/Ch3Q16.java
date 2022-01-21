package com.example.ch4;

public class Ch3Q16 {
    public static void main(String[] args) {
        // starting the random generation from 65 to start from capital letter A
        // to 25 as capital letter Z

        int number = 65 + (int)(Math.random() * 25);

        System.out.println(Character.toLowerCase((char)(number)));
    }
}
