package AssignmentPrograms;

import Encoding.WhileLoop;

import java.util.Scanner;

public class DayOfTheWeek {

//    Problem: Write a Java program that takes a number from 1 to 7 and prints the corresponding day of the week.
//            1: "Monday"
//            2: "Tuesday"
//            3: "Wednesday"
//            4: "Thursday"
//            5: "Friday"
//            6: "Saturday"
//            7: "Sunday"
//
//    Input: An integer (1 to 7)
//    Output: The name of the day corresponding to the number.

    public static void main(String[] args){
        //Scanner initialize and declaring day variable
        Scanner sc = new Scanner(System.in);


        //Check the condition for in proper value
        while(true){
            System.out.println("Entre the Number to represent the day: ");
            int day = sc.nextInt();

            if(day > 7 ){
                System.out.println("INVALID NUMBER TRY AGAIN with number 1-7");
                continue;
            }
            //Printing day of the week
            if(day == 1 ) {
                System.out.println("Day is MONDAY");
            }else if(day == 2 ){
                System.out.println("Day is TUESDAY");
            }else if(day == 3 ){
                System.out.println("Day is WEDNESDAY");
            }else if(day == 4 ){
                System.out.println("Day is THRUSDAY");
            }else if(day == 5 ){
                System.out.println("Day is FRIDAY");
            }else if(day == 6 ){
                System.out.println("Day is SATURDAY");
            }else if(day == 7 ){
                System.out.println("Day is SUNDAY");
            }else{
                System.out.println("PLEASE TRY AGAIN with VALID NUMBER");
            }
            break;
        }
        sc.close(); //Close scanner if dont want the loop
    }
}
