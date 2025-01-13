package AssignmentPrograms;

import java.util.Scanner;

public class MonthNameFromNumber {

//        Problem: Write a Java program that takes a number from 1 to 12 and prints the corresponding month name.
//        1: "January"
//        2: "February"
//        3: "March"
//        4: "April"
//        5: "May"
//        6: "June"
//        7: "July"
//        8: "August"
//        9: "September"
//        10: "October"
//        11: "November"
//        12: "December"
//        Input: An integer (1 to 12)
//        Output: The corresponding month name.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please entre any number from 1-12: ");
        while(true){
            if(!sc.hasNextInt()){
                System.out.println("INVALID INTEGER ENTERED - PLEASE ENTRE UMBER FROM 1- 12");
                sc.next();
                continue;
            }
            int monthNo = sc.nextInt();
            System.out.println("Entered month no is: "+monthNo);

            if (monthNo == 1){
                System.out.println("Month is: January");
            } else if (monthNo == 2) {
                System.out.println("Month is: February");
            } else if (monthNo == 3) {
                System.out.println("Month is: March");
            }else if (monthNo == 4) {
                System.out.println("Month is: April");
            }else if (monthNo == 5) {
                System.out.println("Month is: May");
            }else if (monthNo == 6) {
                System.out.println("Month is: June");
            }else if (monthNo == 7) {
                System.out.println("Month is: July");
            }else if (monthNo == 8) {
                System.out.println("Month is: August");
            }else if (monthNo == 9) {
                System.out.println("Month is: September");
            }else if (monthNo == 10) {
                System.out.println("Month is: October");
            }else if (monthNo == 11) {
                System.out.println("Month is: November");
            }else if (monthNo == 12) {
                System.out.println("Month is: December");
            }else {
                System.out.println("INVALID NUMBER ENTERED");
            }
            break;
        }
    sc.close();
    }
}
