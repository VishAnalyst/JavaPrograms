package Encoding;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i; // Declare the variable

        do {
            System.out.println("Please enter a value (<= 100): ");
            i = sc.nextInt(); // Read user input

            if (i > 100) { // If the input is invalid
                System.out.println("The number entered is more than 100. Please enter a value <= 100.");
            }

        } while (i >= 100); // Keep looping as long as the value is greater than 100
        i+=10;
        System.out.println("Entered Value is: " + i);

    }
}