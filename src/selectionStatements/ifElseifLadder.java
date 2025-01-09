package selectionStatements;

import javax.xml.transform.stream.StreamSource;

public class ifElseifLadder {
    public static void main(String[] args) {
        System.out.println("Write a program to determine the grade based on marks.\n" +
                "\t•\tInitialize an integer variable int marks = 85;.\n" +
                "\t•\tUse an if-else if ladder to assign a grade based on the following conditions:\n" +
                "\t•\tmarks >= 90: Print “Grade A”\n" +
                "\t•\tmarks >= 75 && marks < 90: Print “Grade B”\n" +
                "\t•\tmarks >= 50 && marks < 75: Print “Grade C”\n" +
                "\t•\tmarks < 50: Print “Grade F”");
        int marks = 89;
        System.out.println("Mark of the student is : "+ marks);

        //Checking the condition
        // Corrected if-else if ladder
        if (marks >= 90) {
            System.out.println("Student GRADE IS A");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("Student GRADE IS B");
        } else if (marks >= 50 && marks < 75) {
            System.out.println("Student GRADE IS C");
        } else {
            System.out.println("Student GRADE IS F");
        }
        System.out.println("##########################################");

        System.out.println("Write a program to categorize a number as positive, negative, or zero.\n" +
                "\t•\tInitialize an integer variable int num = -5;.\n" +
                "\t•\tUse an if-else if ladder to check:\n" +
                "\t•\tIf num > 0, print: “The number is positive.”\n" +
                "\t•\tIf num < 0, print: “The number is negative.”\n" +
                "\t•\tIf num == 0, print: “The number is zero.”\n" +
                "\n" +
                "Try these to get comfortable with the if-else if ladder structure!");

        int num = -5;
        System.out.println("The number GIVEN IS: "+num);
        //Checking the condition
        if(num > 0){
            System.out.println("“The number is POSITIVE.");
        }else if(num < 0){
            System.out.println("“The number is NEGATIVE.");
        }else if(num == 0){
            System.out.println("“The number is NULL or 0.");
        }else{
            System.out.println("“The number is NOT VALID.");
        }
    }
}
