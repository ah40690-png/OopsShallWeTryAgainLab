package org.example;

import java.util.Scanner;

public class ValidInput {

    public int getValidatedInt(int low, int high, String prompt, String error) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println(prompt);

            if (in.hasNextInt()) {
                int value = in.nextInt();
                if (value >= low && value <= high) {
                    return value; // valid → return immediately
                } else {
                    System.out.println(error);
                }
            } else {
                System.out.println(error);
                in.next(); // throw away bad input
            }
        }
    }
}
