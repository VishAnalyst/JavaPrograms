package this_Super;

//Here we are keeping all values as i and

class SecondProgram{
    int i;
    void setValue(int i){
        System.out.println("Assigning the value of x with the instant variable i");
        this.i = i;
        //i = i;
    }
    // now we need to print the value for that we are using show method
    void show(){
        System.out.println("Printing the value of instant variable i: "+ i);
    }
}
public class thisSecondProgram {
    public static void main(String[] args) {
        SecondProgram secondProgram = new SecondProgram();
        secondProgram.setValue(70);
        secondProgram.show();
    }
}
