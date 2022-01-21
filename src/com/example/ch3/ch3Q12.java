package com.example.ch3;
import java.util.Scanner;

public class ch3Q12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        if(keyboard.hasNextInt()) {
            Integer input = keyboard.nextInt();
            int digit1 = (int)(input / 100);
            int remaining = input % 100;
            int digit3 = (int)(remaining % 10);
            System.out.println(
                    input + ((digit1 == digit3) ? " is a " : " is not a ") + "palindrome number");

        }else if(keyboard.hasNextFloat()) {
            System.out.println("Please enter and Integer number");
        }else {
            System.out.println("Please enter a number");
        }
    }
}
