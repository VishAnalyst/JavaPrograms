package TypesOfVariables;
//local variable can be accessed within the method only
//Local variables scope visibility is within the method only

public class LocalVariable {

   void show(){
        int localVariable = 100;
        System.out.println(localVariable);
    }

    public static void main(String[] args) {
        LocalVariable localVariable = new LocalVariable();
        localVariable.show();
    }
}
