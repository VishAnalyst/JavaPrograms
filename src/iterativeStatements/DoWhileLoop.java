package iterativeStatements;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);

        // Do-while loop to ensure the code runs at least once
        do {
            System.out.println("Please enter a number to check the condition (<= 100):");
            int num = sc.nextInt();

            if (num > 100) { // Invalid input case
                System.out.println("Invalid number! Please enter a number less than or equal to 100.");
            } else { // Valid number case
                while (num <= 100) {
                    System.out.println("The number printed is: " + num);
                    num += 10;
                }
                System.out.println("You have entered a valid number.");
                break; // Exit the loop after valid input and execution
            }
        } while (true); // Infinite loop to keep asking until valid input is entered

        sc.close(); // Close the scanner
    }
}