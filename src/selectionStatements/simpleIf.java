package selectionStatements;

public class simpleIf {
    public static void main (String[] args){

       System.out.println("Write a program to check if a number is positive.\n" +
               "\t•\tInitialize an integer variable int num = 25;\n" +
               "\t•\tUse an if statement to check if the number is greater than 0.\n" +
               "\t•\tIf the condition is true, print:\n");

       int num = 25;
        System.out.println("The number initialized is: "+ num);
       if(num>0){
           System.out.println("The number is greater than 0 so its a POSITIVE NUMBER");
       }
        System.out.println("##############################################");

        System.out.println("Write a program to check if a person is eligible to vote.\n" +
                "\t•\tInitialize an integer variable int age = 18;\n" +
                "\t•\tUse an if statement to check if the age is greater than or equal to 18.\n" +
                "\t•\tIf the condition is true, print:");

        int votingAge = 16;
        if(votingAge<18){
            System.out.println("Thd person cannot vote");
            System.out.println("##########################################");
        }

        System.out.println("Write a program to check for a condition");
        int num1 = 120;
        int num2 = 30;
        System.out.println("The number1 initialized is: "+ num1);
        System.out.println("The number2 initialized is: "+ num2);
        //Checking the condition
        if((num1+num2) < 100){
            System.out.println("The SUM is LESS than 100");
            System.out.println("##########################################");
        }
        System.out.println("The SUM is GREATER than 100");
    }
}
