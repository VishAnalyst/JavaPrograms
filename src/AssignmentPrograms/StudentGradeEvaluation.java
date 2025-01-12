package AssignmentPrograms;

import java.security.PublicKey;
import java.util.Scanner;

public class StudentGradeEvaluation {

//    Problem: Write a Java program that takes the marks of a student and evaluates their grade based on the following scale:
//            90 to 100: "A"
//            80 to 89: "B"
//            70 to 79: "C"
//            60 to 69: "D"
//            Below 60: "F"
//    Input: Marks (between 0 and 100)
//    Output: Grade of the student.

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            //Entre the mark of the student
            System.out.println("Entre the mark of the student: ");
            int mark = sc.nextInt();

            //Validation for Invalid statements
            if (mark < 0 || mark > 100){
                System.out.println("Please entre a valid marks between 0 - 100");
                continue;
            }
            // Determine grade based on marks
            if (mark >=90){
                System.out.println("The Grade is A");
            } else if (mark >=80 ) {
                System.out.println("The Grade is B");
            }else if (mark >=70) {
                System.out.println("The Grade is C");
            }else if (mark >=60) {
                System.out.println("The Grade is D");
            }else {
                System.out.println("The Grade is F");
            }break;
        }
        sc.close();

        }
    }


