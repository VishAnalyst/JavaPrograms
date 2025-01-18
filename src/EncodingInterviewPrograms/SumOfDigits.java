package Encoding;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scSum = new Scanner(System.in);
        int sum =0;
        int rev =0;
        System.out.println("Please entre the any number: ");

        while(true){
            if(scSum.hasNextInt()){
               int num = scSum.nextInt();
                System.out.println("VALID INPUT ENTERED");
                System.out.println("Calculating thr sum of digits............");

                while(num>0){
                    rev = num%10;
                    sum = sum+rev;
                    num = num/10;
                }
                System.out.println("The Sum of digits is: "+sum);
                break;

            }else{
                System.out.println("INVALID INPUT: Please TRY AGAIN with Valid input");
                scSum.next();
            }
        }
        scSum.close();
    }
}
