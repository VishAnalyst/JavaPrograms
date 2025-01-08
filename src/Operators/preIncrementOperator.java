package Operators;

public class preIncrementOperator {
    public static void main(String[] args){
        int val1 = 25;
        int val2 = 30;
        System.out.println("The value of val1 is: "+val1);
        System.out.println("The value of val2 is: "+val2);
        System.out.println("#########################");

        val1 = ++val2;
        System.out.println("The edited value of val2 is: "+val1);

        //Swapping the values.
        val1 = 25;
        val2 = ++val1;
        System.out.println("The edited value of val1 is: "+val2);
        System.out.println("#######################");
        System.out.println("Additional Question. Write a program where:\n" +
                "\t•\tYou initialize int x = 10 and int y = ++x + 5;.\n" +
                "\t•\tPrint the values of both x and y.\n Value of x: 11  \n" +
                "Value of y: 16  ");
//        Write a program where:
//	•	You initialize int x = 10 and int y = ++x + 5;.
//	•	Print the values of both x and y.
//        Value of x: 11
//        Value of y: 16

        int x =10;
        int y = ++x + 5;
        System.out.println("The value of x is: "+x);
        System.out.println("The value of y is: "+y);
        System.out.println("#######################");

    }
}
