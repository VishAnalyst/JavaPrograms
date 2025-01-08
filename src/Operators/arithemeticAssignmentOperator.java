package Operators;

public class arithemeticAssignmentOperator {
    public static void main (String[] args){
        //    += Addition assignment operator
        int num1 =20;
        int num2 =50;
        System.out.println("Value of num1 is: "+num1);
        System.out.println("Value of num2 is: "+num2);
        System.out.println("#########################");
        num1 += num2;
        System.out.println("Edited Value of num1 is: "+num1);

    //-= Subtraction assignment operator
        int val1 = 80;
        int val2 = 20;
        System.out.println("Value of val1 is: "+val1);
        System.out.println("Value of val2 is: "+val2);
        System.out.println("#########################");
        val1 -= val2;
        System.out.println("Edited Value of val1 is: "+val1);
    //*= Multiplication assignment operator
        int mul1 = 25;
        int mul2 = 30;
        System.out.println("Value of mul1 is: "+mul1);
        System.out.println("Value of mul2 is: "+mul2);
        System.out.println("#########################");
        mul1 *= mul2;
        System.out.println("Edited Value of val1 is: "+mul1);
    //= Division assignment operator
        int div1 = 100;
        int div2 = 10;
        System.out.println("Value of div1 is: "+div1);
        System.out.println("Value of div2 is: "+div2);
        System.out.println("#########################");
        div1 /= div2;
        System.out.println("Edited Value of div1 is: "+div1);

    //Assignment arthematic operator Action Performing with double
        double x = 20.5;
        double y = 4.5;
        System.out.println("Value of x is: "+x);
        System.out.println("Value of num2 is: "+y);
        System.out.println("#########################");
        x += y;
        System.out.println("Edited Value of double opration x is: "+x);

    //Assignment arthematic operator Action Performing with float
        float a = 25.5f;
        float b = 45.5f;
        System.out.println("Value of a is: "+a);
        System.out.println("Value of num2 is: "+b);
        System.out.println("#########################");
        a *= b;
        System.out.println("Edited Value of float operation a is: "+a);

    }

}
