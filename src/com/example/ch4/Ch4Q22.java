package com.example.ch4;
import java.util.Scanner;

public class Ch4Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String string1 = input.nextLine();
        System.out.print("Enter second string: ");
        String string2 = input.nextLine();

        System.out.println(
                string2 + ((string1.contains(string2)) ? " is " : " is not ") +
                        "a substring of " + string1);
    }
}
