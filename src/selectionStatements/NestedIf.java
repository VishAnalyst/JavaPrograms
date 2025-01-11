package selectionStatements;

public class NestedIf {
//    Write a program to determine if a student is eligible for a scholarship.
//            •	Conditions for scholarship eligibility:
//            •	If the student’s marks are 85 or above:
//            •	Check if the attendance is 90% or higher:
//            •	If both conditions are true, print:
//            "The student is eligible for the scholarship."
//            •	Otherwise, print:
//            "The student has high marks but low attendance, so they are not eligible for the scholarship."
//            •	If the marks are below 85, print:
//            "The student is not eligible for the scholarship due to low marks."

    public static void main(String[] args) {
        int marks = 55;
        int attendance = 98;
        System.out.println("Student's Marks: " + marks);
        System.out.println("Student's Attendance: " + attendance + "%");

        if (marks >= 85) {
            if (attendance >= 90) {
                System.out.println("Student is eligible for the scholarship");
            } else {
                System.out.println("Student have high marks but attendance did not meet so not eligible for the scholarship");
            }
        } else {
            System.out.println("The student is not eligible for the scholarship due to low marks.");
        }


        //Question two
        System.out.println("##########################################################");
        //Question is to find the largest of three number using nested if.
        int n1 = 175, n2 = 50, n3 = 555, largest;
        System.out.println("Number n1 is: " + n1);
        System.out.println("Number n2 is: " + n2);
        System.out.println("Number n3 is: " + n3);

        if (n1 >= n2) {
            if (n1 >= n3) {
                largest = n1;
                System.out.println("n1 is the largest.");
            } else {
                largest = n3;
                System.out.println("n3 is the largest.");
            }
        } else {
            if (n2 >= n3) {
                largest = n2;
                System.out.println("n2 is the largest.");
            } else {
                largest = n3;
                System.out.println("n3 is the largest.");
            }
        }

        // Optional: Print the largest number explicitly
        System.out.println("The largest number is: " + largest);
    }
}


    
