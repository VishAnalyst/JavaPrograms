package TypesOfVariables;

public class StaticVariable {

    static int staticVariable = 300;

    int instanceVariable = 200;
    void show (){
        int localVariable = 100;
        System.out.println("Local variable is: "+localVariable);
    }



    public static void main(String[] args) {
        //To print the local variable declared
        StaticVariable staticVariable1 = new StaticVariable();
        staticVariable1.show();
        //To print the instance variable declared
        System.out.println("Instance variable is: "+staticVariable1.instanceVariable);

        //3 Ways to to access or print the static variable
        //By creating instance of the class
        System.out.println("The Static variable accessed by creating object: "+staticVariable1.staticVariable);
        //By direct access through class name
        System.out.println("Static variable access through class name is: "+StaticVariable.staticVariable);
        //Access directly
        System.out.println("Static variable is: "+staticVariable);
    }
}

