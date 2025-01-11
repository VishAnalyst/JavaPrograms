package Encoding;

import java.util.Scanner;

public class AddWithScanner {
    public static void main(String[] args) {
        Scanner scAdd = new Scanner(System.in);
        System.out.println("Please entre the value on a: ");
        int num1 = scAdd.nextInt();

        System.out.println("Please entre the value on b: ");
        int num2 = scAdd.nextInt();

        int sum = num1+num2;
        System.out.println("Sum of two numbers is: "+ sum);

    }
}
