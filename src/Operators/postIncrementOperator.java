package Operators;

public class postIncrementOperator {
    public static void main (String[] args){

        System.out.println("Program to swap the numbers assigned with addition of one to it");
        System.out.println("#########################");
        int myNum1 = 50;
        int myNum2 = 60;
        System.out.println("The initial value of myNum1 is: "+myNum1);
        System.out.println("The initial value of myNum2 is: "+ myNum2);
        System.out.println("#########################");

        myNum1 = myNum2++;
        System.out.println("The Assigned value of myNum1 is: "+myNum1);
        System.out.println("The value of myNum2 is: "+ myNum2);
        System.out.println("#########################");

        myNum1 = myNum2;
        System.out.println("The edited value of myNum1 is: "+myNum1);
        System.out.println("The edited value of myNum2 is: "+myNum2);
        System.out.println("#########################");

        myNum2 = myNum1 - 10;
        System.out.println("Final value of myNum1: "+myNum1);
        System.out.println("Final value of myNum2: "+myNum2);

        System.out.println("#########################");
        System.out.println("#########################");

        System.out.println("Write a program where:\n" +
                "\t•\tInitialize int p = 7;\n" +
                "\t•\tAssign int q = p++ + 3;\n" +
                "\t•\tPrint the values of both p and q.\n" +
                "\n" +
                "Expected Output Example: Value of p: 8  \n" +
                "Value of q: 10  ");

        int p = 7;
        int q = p++ + 3;
        System.out.println("value of p is: " + p);
        System.out.println("value of q is: " + q);
        System.out.println("ADDITIONAL QUESTION SOLVED");






    }

}
