package selectionStatements;

import java.awt.desktop.SystemSleepEvent;

public class IfElse {
    public static void main(String[] args) {

        //Question one
//        System.out.println("Write a program to check if a number is even or odd.\n" +
//                "\t•\tInitialize an integer variable int num = some number;.\n" +
//                "\t•\tUse an if-else statement to check the condition:");

        int num = 100;
        if (num % 2 == 0){
            System.out.println("The Number is EVEN");
        } else {
            System.out.println("The Number is ODD");
        }

        //Question two
        System.out.println("##########################################################");
//        System.out.println("Write a program to check if a person is eligible to drive.");

        int age = 20;
        boolean hasLicense =false;
        System.out.println("Age of the person is: "+age);

        if (age >= 17 && hasLicense) {
            System.out.println("The person can drive and has a valid license.");
        } else if (age < 17 && hasLicense) {
            System.out.println("The person is underage and should not have a license.");
        } else {
            System.out.println("The person cannot drive and does not have a license.");
        }

    }
}
