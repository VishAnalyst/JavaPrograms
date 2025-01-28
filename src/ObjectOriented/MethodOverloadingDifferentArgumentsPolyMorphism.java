package ObjectOriented;
//Achieving the Method overloading in different types of arguments
class DisplayOverloading{
    void display(char s){
        System.out.println("Printingn Charector: "+s);
    }
    void display(int num, char c){
        System.out.println("Printing char and numbers: "+num+c);
    }
    void display(int roll, String name, double marks){
        System.out.println("Printing Student details: "+roll+name+marks);
    }
}

public class MethodOverloadingDifferentArgumentsPolyMorphism {
    public static void main(String[] args) {
        DisplayOverloading objDisplay = new DisplayOverloading();
        objDisplay.display('v');
        objDisplay.display(123,'B');
        objDisplay.display(12,"Vishnu", 92.45);
    }
}
