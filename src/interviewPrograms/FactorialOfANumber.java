package interviewPrograms;

public class FactorialOfANumber {
    public static void main(String[] args) {
        //Initialize number
        //Initialize factorial
        int num =10;
        int factorial = 1;

        //Execute for loop inorder to loop through the initialized number
        for(int i=1;i<=num;i++){
        factorial = factorial*i;
            System.out.println("Factorial of "+ num +"is: "+factorial);
        }
    }
}
