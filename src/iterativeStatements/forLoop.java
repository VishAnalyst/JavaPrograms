package iterativeStatements;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please entre the value of Number num: ");
        int num = sc.nextInt(); // Take user input for starting value


        //I need to get the output 100,150 to 500.
        for (; num<=500; num+=50){ // no initializing of number here Use user-provided num, no redeclaration // idea is for(int i =1; i<=5; i++);
            System.out.println("The OUTPUT IS: "+ num);
            Thread.sleep(2000);
        }sc.close(); // Close scanner
    }
}
