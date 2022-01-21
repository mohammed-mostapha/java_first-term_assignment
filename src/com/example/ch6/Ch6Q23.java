package com.example.ch6;
import java.util.Scanner;

public class Ch6Q23 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print(
                "Enter a string followed by a comma then a space then specific character e.g. Welcome, e : ");
        String input = keyboard.nextLine();

        int commaIndex = input.indexOf(", ");
        String str = input.substring(0, commaIndex);
        char ch = input.charAt(commaIndex + 2);

        System.out.println(
                "The number of occurrences of \"" + ch + "\" in \"" + str + "\" is: " +
                        count(str, ch));

    }


    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (a == str.charAt(i))
                count++;
        }
        return count;
    }
}
