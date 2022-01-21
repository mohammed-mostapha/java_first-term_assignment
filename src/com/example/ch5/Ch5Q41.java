package com.example.ch5;
import java.util.Scanner;

public class Ch5Q41 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter some numbers: ");
        int max = keyboard.nextInt();
        int count = 1;
        int number = 1;

        while (number > 0) {
            number = keyboard.nextInt();
            if (number > max) {
                max = number;
                count = 1;
            }
            if (number == max)
                count++;
        }

        // Display to results
        System.out.println("The largest number is: " + max);
        System.out.println(
                "The occurrence count of the largest number is: "
                        + count);
    }
}
