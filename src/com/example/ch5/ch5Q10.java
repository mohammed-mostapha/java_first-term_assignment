package com.example.ch5;

public class ch5Q10 {
    public static void main(String[] args) {
        final int number_per_oneLine = 10;
        int count = 0;

        for (int i = 100; i <= 1000; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                count++;
                if (count % number_per_oneLine == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
    }
}
