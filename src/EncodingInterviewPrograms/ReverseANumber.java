package EncodingInterviewPrograms;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scRev = new Scanner(System.in);
        int rev =0;
        System.out.println("Please entre any Integer Value: ");

        while(true){
            if(scRev.hasNextInt()){
               int num = scRev.nextInt();
                System.out.println("VALID VALUE ENTERED");
                System.out.println("Makeing the number reverse PLEASE WAIT");
                while (num!=0){
                    rev = rev*10+num%10;
                    num = num/10;
                }
                System.out.println("THE REVERSAL OUTPUT IS; "+rev);
                break;
            }else{
                System.out.println("INVALID VALUE: PLEASE TRY AGAIN");
                scRev.next();
            }
        }
        scRev.close();
    }
}
