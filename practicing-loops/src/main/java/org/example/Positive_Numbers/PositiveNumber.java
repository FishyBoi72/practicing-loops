package org.example.Positive_Numbers;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            int userInput = scanner.nextInt();
            if (userInput >= 0) {
                System.out.println("Your number is " + userInput);
            } else {
                System.out.println("Please enter a positive number.");
            }
            if (userInput == 0) {
                break;
            }
        }
    }
}

