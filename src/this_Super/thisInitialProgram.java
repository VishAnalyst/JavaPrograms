package this_Super;

// in this program we are just Assigning the value of x and i and printing the value

class Initialprogram{
    int i;
    void setValue(int x){
        System.out.println("Assigning the value of x with the instant variable i");
        i = x;
    }
    // now we need to print the value for that we are using show method
    void show(){
        System.out.println("Printing the value of instant variable i: "+i);
    }
}

public class thisInitialProgram {
    public static void main(String[] args) {
        Initialprogram initialprogram = new Initialprogram();
        initialprogram.setValue(50);
        initialprogram.show();
    }
}
