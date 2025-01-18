package Encoding;

import java.util.Scanner;

public class CountNummberOfDigits {
    public static void main(String[] args) {
        Scanner scAdd = new Scanner(System.in);
        int count = 0;

        System.out.println("Please enter any integer number: ");

        while (true) {
            if (scAdd.hasNextInt()) {
                int num = scAdd.nextInt();
                System.out.println("VALID INPUT");
                System.out.println("Calculating the Count of digits..........");

                // Calculate the number of digits
                while (num > 0) {
                    num = num / 10;
                    count++;
                }
                System.out.println("Count of Digits is: " + count);
                break; // Exit after successful input and count
            } else {
                System.out.println("INVALID INPUT PLEASE TRY AGAIN");
                scAdd.next(); // Consume invalid input
            }
        }

        // Close the scanner after completing all input operations
        scAdd.close();
    }
}