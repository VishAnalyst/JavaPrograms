package LoopPrograms;

public class factorialOfANumber {
    public static void main(String[] args) {
        long factorial =1;
        for(int num=1; num<=5; num++){
             factorial = factorial*num;
             System.out.println("Factorial of: " + num +" is: " + factorial );
        }

    }
    
}
