package AssignmentPrograms;

import java.util.Scanner;

public class AgeGroupClassification {
//    Problem: Write a Java program that takes the age of a person and classifies them into different age groups.
//            0 to 12: "Child"
//            13 to 19: "Teenager"
//            20 to 59: "Adult"
//            60 and above: "Senior Citizen"
//    Input: Age (integer)
//    Output: The age group to which the person belongs.
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (true) {
          System.out.println("Please entre the age to determine the Age Category: ");
          if (sc.hasNextInt()) { // Check if the input is an integer
              int age = sc.nextInt();

              if (age > 120 || age < 0) { // Check for invalid age
                  System.out.println("INVALID AGE ENTERED! Please enter an age between 0 and 120.");
                  continue; // Ask for input again
              }
              if (age <= 12) {
                  System.out.println("AGE CATEGORY: CHILD");
              } else if (age <= 19) {
                  System.out.println("AGE CATEGORY: TEENAGER");
              } else if (age <= 59) {
                  System.out.println("AGE CATEGORY: ADULT");
              } else { // age >= 60 (Senior Citizen)
                  System.out.println("AGE CATEGORY: SENIOR CITIZEN");
              }
              break; // Exit the loop after determining the category
          } else {
              System.out.println("INVALID INPUT! Please enter a valid numeric age.");
              sc.next(); // Consume the invalid input to avoid an infinite loop
          }
      }
      sc.close();
  }
}
