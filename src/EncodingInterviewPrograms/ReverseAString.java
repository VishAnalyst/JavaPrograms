package Encoding;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {

        //Entering the values to a  string dynamically
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Entre the Value to the string: ");
        String input = sc.nextLine();

        //Declaring string reverse
        String reverse = "";
        //Loop through the input we have given and determing the length as well
        for(int i = input.length()-1;i>=0;i--){
            reverse += input.charAt(i);
        }
        System.out.println("Reversed String: "+reverse );
        sc.close();
    }
}
