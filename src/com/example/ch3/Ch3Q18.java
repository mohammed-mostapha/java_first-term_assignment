package com.example.ch3;
import java.util.Scanner;

public class Ch3Q18 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the weight of the package: ");

        if(keyboard.hasNextDouble()) {
            double w = keyboard.nextDouble();

            if(w  > 20) {
                System.out.println("The package cannot be shipped");
            }else {
                if(w < 0) {
                    System.out.println("Please enter the weight of the package as a positive number");
                }else if(w == 0) {
                    System.out.println("Please enter the weight of the package as a positive number more than zero");
                }
                else if(w >= 0 & w<=2) {
                    double costOfShipping = 2.5;
                    System.out.println(costOfShipping);
                }else if(w > 0 & w <= 4) {
                    double costOfShipping = 4.5;
                    System.out.println(costOfShipping);
                }else if(w > 0 & w <=10) {
                    double costOfShipping = 7.5;
                    System.out.println(costOfShipping);
                }else if(w > 0 & w <= 20) {
                    double costOfShipping = 10.5;
                    System.out.println(costOfShipping);
                }
            }
        }
    }
}
