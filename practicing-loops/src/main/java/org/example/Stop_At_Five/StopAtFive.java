package org.example.Stop_At_Five;

import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            int userInput = scanner.nextInt();
            if (userInput == 5) {
                break;
            }
        }
    }
}

