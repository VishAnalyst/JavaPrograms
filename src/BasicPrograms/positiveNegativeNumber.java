package BasicPrograms;

import AssignmentPrograms.sumOfDigits;

public class positiveNegativeNumber {
    public static void main(String[] args) {
        int num = -1;
        String positive = "POSITIVE NUMBER";
        String negative = "NEGATIVE NUMBER";
        String zero = "Number is ZERO";

        if (num>0) {
            System.out.println(positive);
        }else if(num<0){
            System.out.println(negative);
        }else  {
            System.out.println(zero);
        }
    }
    
}
