package AssignmentPrograms;

import java.util.Scanner;

public class VotingEligibility {
//    Write a Java program to check if a person is eligible to vote.
//
//    A person is eligible to vote if their age is 18 or above.
//    Input: Age (integer)
//    Output: "Eligible to vote" or "Not eligible to vote"
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //Entering the age dynamically
            System.out.println("Please entre the age: ");

            while(true) {
                if (!sc.hasNextInt()) {
                    System.out.println("INVALID FORMAT/AGE ENTERED. PLEASE TRY AGAIN");
                    sc.next();
                    continue;
                }
                //Entering the age dynamically
                int age = sc.nextInt();
                //Validating the age entered is a proper value
                if (age < 0 || age > 120) {
                    System.out.println("INVALID AGE PLEASE TRY AGAIN");
                    continue;
                }
                System.out.println("Entered age is: " + age);
                if (age < 18) {
                    System.out.println("The person is NOT ELIGIBLE to vote");
                } else {
                    System.out.println("The person is ELIGIBLE to vote");
                }
                break;
            }
        sc.close();

    }
}
