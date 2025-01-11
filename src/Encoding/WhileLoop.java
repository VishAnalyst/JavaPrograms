package Encoding;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);


        while (true) { // Infinite loop to keep asking for valid input
            System.out.println("Please enter a number to check the condition (<= 100):");
            int num = sc.nextInt();

            if (num > 100) { // Invalid input case
                System.out.println("Invalid number! Please enter a number less than or equal to 5.");
                continue; // Skip the rest of the code and restart the loop
            }

            // Valid number case
            while (num <= 100) {
                System.out.println("The number printed is: "+num);
                num+=10;
            }

            System.out.println("You have entered a valid number.");
            break; // Exit the infinite loop after valid input and execution
        }

        sc.close(); // Close the scanner
    }
}
