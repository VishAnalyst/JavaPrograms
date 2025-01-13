package AssignmentPrograms;

import java.util.Scanner;

public class PositiveNegativeOrZero {

//    Problem: Write a Java program that checks if a number is positive, negative, or zero.
//            Input: A number (integer)
//    Output: "Positive", "Negative", or "Zero"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please entre a number: ");

        while(true){
            if(!sc.hasNextDouble()){
                System.out.println("INVALID ENTRY: PLEASE ENTER A VALID NUMBER");
                sc.next();
                continue;
            }

            double num = sc.nextDouble();
            System.out.println("NUMBER ENTERED: "+ num);

            if(num>0){
                System.out.println("Entered number is POSITIVE");
            } else if (num<0) {
                System.out.println("Entered number is NEGATIVE");
            }   else { // This case is for `num == 0`
            System.out.println("Entered number is NULL or ZERO");
        }
            break;
        }
        sc.close();
    }

}
