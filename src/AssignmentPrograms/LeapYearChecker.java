package AssignmentPrograms;

import java.util.Scanner;

public class LeapYearChecker {
//    Problem: Write a Java program to check if a given year is a leap year or not.
//   if a year is divisible by 4, it is a leap year
//If a year is divisible by 100, it is not a leap year unless it is also divisible by 400
//If a year is not divisible by 4, it is not a leap year
//    Input: A year (integer)
//    Output: "Leap Year" or "Not a Leap Year".
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            //Entre the Year 1st
            System.out.println("Please entre the year");

            if (sc.hasNextInt()) { // Check if the input is an integer
                int year = sc.nextInt();

                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println(year + " is a leap year.");
                        } else {
                            System.out.println(year + " is not a leap year.");
                        }
                    } else {
                        System.out.println(year + " is a leap year.");
                    }
                } else {
                    System.out.println(year + " is not a leap year.");
                }
                break; // Exit the loop after a valid year is processed
            } else {
                // Invalid input case
                System.out.println("Please enter a valid year (numeric value).");
                sc.next(); // Consume the invalid input to avoid an infinite loop
            }
        }


    }
}
