package org.example;

public class ValidInputApp {
    public static void main(String[] args) {
        ValidInput validator = new ValidInput();

        int result = validator.getValidatedInt(
                0, 100,
                "Please enter a value between 0 and 100:",
                "Invalid user input, please try again!"
        );

        System.out.println("The value chosen by the user is " + result);
    }
}
