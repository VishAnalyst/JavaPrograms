package AssignmentPrograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {

//    Problem: Write a Java program that takes three numbers as input and finds the largest among them.
//    Input: Three numbers (integers)
//    Output: The largest of the three numbers.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;

        while (true) {
            // Enter 1st integer value
            System.out.println("Enter the 1st number: ");
            if (!sc.hasNextInt()) {
                System.out.println("INVALID VALUE: PLEASE TRY AGAIN");
                sc.next(); // Consume invalid input
                continue; // Restart loop
            }
            num1 = sc.nextInt(); // Valid input
            System.out.println("NUMBER 1 is: " + num1);
            break; // Exit loop for the first input
        }

        while (true) {
            // Enter 2nd integer value
            System.out.println("Enter the 2nd number: ");
            if (!sc.hasNextInt()) {
                System.out.println("INVALID VALUE: PLEASE TRY AGAIN");
                sc.next();
                continue;
            }
            num2 = sc.nextInt();
            System.out.println("NUMBER 2 is: " + num2);
            break;
        }

        while (true) {
            // Enter 3rd integer value
            System.out.println("Enter the 3rd number: ");
            if (!sc.hasNextInt()) {
                System.out.println("INVALID VALUE: PLEASE TRY AGAIN");
                sc.next();
                continue;
            }
            num3 = sc.nextInt();
            System.out.println("NUMBER 3 is: " + num3);
            break;
        }

        // Closing the scanner
        sc.close();

        // Print all numbers
        System.out.println("The numbers entered are: " + num1 + ", " + num2 + ", " + num3);

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number 1 is the LARGEST and is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is the LARGEST and is: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Number 3 is the LARGEST and is: " + num3);
        } else if (num1 == num2 && num1 > num3) {
            System.out.println("NO LARGEST NUMBER: NUMBER 1 and 2 are EQUAL and are: " + num1);
        } else if (num1 == num3 && num1 > num2) {
            System.out.println("NO LARGEST NUMBER: NUMBER 1 and 3 are EQUAL and are: " + num1);
        } else if (num2 == num3 && num2 > num1) {
            System.out.println("NO LARGEST NUMBER: NUMBER 2 and 3 are EQUAL and are: " + num2);
        } else {
            System.out.println("ALL THE NUMBERS ARE EQUAL: " + num1 + ", " + num2 + ", " + num3);
        }

        sc.close();

    }

}
