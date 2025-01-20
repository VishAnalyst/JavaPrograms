package EncodingInterviewPrograms;

import java.util.Scanner;

public class PalindroneCheck {
    public static void main(String[] args) {
        Scanner scPali = new Scanner(System.in);
        System.out.println("Please enter a number to check if it's a palindrome: ");

        while (true) {
            if (scPali.hasNextInt()) {
                int num = scPali.nextInt();
                System.out.println("Valid number entered");
                System.out.println("Checking if the number is a palindrome...");

                if (num >= 0) {
                    int originalNum = num; // Store the original number
                    int reversedNum = 0;

                    // Reverse the number
                    while (num > 0) {
                        int lastDigit = num % 10;
                        reversedNum = (reversedNum * 10) + lastDigit;
                        num = num / 10;
                    }

                    // Check if the original number and reversed number are equal
                    if (originalNum == reversedNum) {
                        System.out.println(originalNum + " is a palindrome.");
                    } else {
                        System.out.println(originalNum + " is not a palindrome.");
                    }

                    break; // Exit after successful check
                } else {
                    System.out.println("Negative numbers cannot be palindromes. Please enter a positive number.");
                }
            } else {
                System.out.println("Entered input is NOT VALID. Please enter an integer.");
                scPali.next(); // Consume the invalid input
            }
        }

        scPali.close(); // Close the scanner
    }
}