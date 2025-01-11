package selectionStatements;

import java.util.Scanner;

public class SwitchCase {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){ //while loop. The loop will keep running until the user enters a valid number.
            System.out.println("Please entre any day number: ");
            int day = sc.nextInt();
            //Switch case day initialize
            switch (day){
                case 1 :
                    System.out.println("The day is MONDAY");
                    break;
                case 2 :
                    System.out.println("The day is TUESDAY");
                    break;
                case 3:
                    System.out.println("The day is WEDNESDAY");
                    break;
                case 4:
                    System.out.println("The day is THURSDAY");
                    break;
                case 5:
                    System.out.println("The day is FRIDAY");
                    break;
                case 6:
                    System.out.println("The day is SATURDAY");
                    break;
                case 7:
                    System.out.println("The day is SUNDAY");
                    break;
                default:
                    System.out.println("Please entre the valid number from 1-7");
                    continue; // Go back to the start of the loop for invalid input
            }
            break; // Exit the loop if valid input is entered
        }
        sc.close(); // Close the scanner
    }
}
