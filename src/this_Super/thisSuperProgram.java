package this_Super;

class Animal{
    String color = "Ash white";
}
class Dog extends Animal{
    String color = "Brown";

    void printColor(){
        System.out.println(this.color);
        System.out.println(super.color);
    }
}

public class thisSuperProgram {
    public static void main(String[] args) {
        Dog objDog = new Dog();
        objDog.printColor();
    }
}
