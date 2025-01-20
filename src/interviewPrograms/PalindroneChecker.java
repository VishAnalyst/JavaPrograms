package interviewPrograms;

public class PalindroneChecker {
    public static void main(String[] args) {
        int num = 1221;
        int num1 = num;

        System.out.println("Entered number is: "+ num);
        int rev =0;

        //While operation to check the number is !=o
        while(num!=0){
            rev = rev*10+num%10;
            num = num/10;
        }
        //Print the initial outputs
        System.out.println("The initial number given is: "+num);
        System.out.println("The reversal of the number is: "+rev);

        //Checking the the number is palindrome
        if(rev==num1){
            System.out.println("The number is PALINDRONE");
        }else {
            System.out.println("The Entered number is NOT A PALINDRONE");
        }
    }
}
