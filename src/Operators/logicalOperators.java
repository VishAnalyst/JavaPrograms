package Operators;

public class logicalOperators {
    public static void main(String[] args){

        //Initialising the value for a and b
        boolean a = true;
        boolean b = false;

        //Printing initial values
        System.out.println("Value for a is: " + a);
        System.out.println("Value for b is: " + b);

        //Logical operations
        //OR Operation
        boolean or = a|b;
        System.out.println("The value for OR operation is: "+ or);

        //AND Operation
        boolean anD = a&b;
        System.out.println("The value for OR operation is: "+ anD);

        //Reversing the value
        boolean oppValue = !b;
        System.out.println("The opposite value of the value b is: "+ oppValue);

        boolean conCheck = (!a & b) | ( a & !b);
        System.out.println(conCheck);

        boolean conCheck1 = (!a & b) & ( a & !b);
        System.out.println(conCheck1);
    }
}
