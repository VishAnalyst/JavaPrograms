package Encoding;

import java.util.Scanner;

public class ForEachArrayEncoding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       //Ask the user to print the size of the array
        System.out.println("Please entre the size of the array: ");
        int size = sc.nextInt();

        //declare array in to the size specified
        int arr[] = new int[size];

       //Enter the values in to the array
        System.out.println("Please entre the Values to the array: ");

        for (int i=0; i<size; i++){ //Loop through it.
        arr[i] = sc.nextInt();
        }

        //Print the array output
        System.out.println("The Final output is: ");
        for (int out: arr) {
            System.out.println(out);
        }

    }
}