package TypesOfVariables;
//Variable declared outside the method inside the class is Instance variable.
//make sure Static keyword is not used
//To access the Instance variable we need to create the object of the respective class then only we can access the same.

public class instanceVariable {

    int instanceVariable = 200;
    void show (){
        int localVariable = 100;
        System.out.println("Local variable is: "+localVariable);
    }

    public static void main(String[] args) {
        //To print the local variable declared
        instanceVariable instanceVariable = new instanceVariable();
        instanceVariable.show();
        //To print the instance variable declared
        System.out.println("Instance variable is: "+instanceVariable.instanceVariable);
    }
}
