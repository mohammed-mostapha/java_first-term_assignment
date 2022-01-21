package com.example.ch2;

import java.util.Scanner;

public class Ch2Q6 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");

        if (keyboard.hasNextInt()) {
            Integer number = keyboard.nextInt();
            boolean isPositive = false;

            if (number > 0.0) {
                isPositive = true;

                if(number > 0.0 & number <=1000 & isPositive) {
                    int length = String.valueOf(number).length();

                    if(length == 1) {
                        int firstDigit = number % 10;
                        int remainingNumber = number / 10;
                        int product = firstDigit;
                        System.out.println("The product of all digits in " + number + " is " + product);
                    }else if(length == 2) {
                        int firstDigit = number % 10;
                        int remainingNumber = number / 10;
                        int secondDigit = remainingNumber % 10;
                        int product = firstDigit * secondDigit;
                        System.out.println("The product of all digits in " + number + " is " + product);

                    }else if(length == 3) {
                        int firstDigit = number % 10;
                        int remainingNumber = number / 10;
                        int secondDigit = remainingNumber % 10;
                        remainingNumber = remainingNumber / 10;
                        int thirdDigit = remainingNumber % 10;
                        int product = firstDigit * secondDigit * thirdDigit;
                        System.out.println("The product of all digits in " + number + " is " + product);
                    }else if(length == 4) {
                        int firstDigit = number % 10;
                        int remainingNumber = number / 10;
                        int secondDigit = remainingNumber % 10;
                        remainingNumber = remainingNumber / 10;
                        int thirdDigit = remainingNumber % 10;
                        remainingNumber = remainingNumber / 10;
                        int fourthDigit = remainingNumber % 10;
                        int product = firstDigit * secondDigit * thirdDigit * fourthDigit;
                        System.out.println("The product of all digits in " + number + " is " + product);
                    }
                } else {
                    System.out.println("Pease enter a positive integer number between 0 and 1000");
                }
            }else {
                System.out.println("Please enter an Integer number more than 0");
            }

        } else if(keyboard.hasNextFloat()) {
            System.out.println("Please enter an integer number");
        } else {
            System.out.println("Please enter a number");
        }
    }
}
