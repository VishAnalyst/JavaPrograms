package ObjectOriented;

class Animal {
    void eat(){
        System.out.println("Animal Eats");
    }
}

class Dog extends Animal{
 void bark(){
     System.out.println("Dog barks");
 }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog objAni = new Dog();
        objAni.eat();
        objAni.bark();

    }
}
