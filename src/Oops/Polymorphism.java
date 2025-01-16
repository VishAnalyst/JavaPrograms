package Oops;
//Inheritance lets us inherit attributes and methods from another class.
// Polymorphism uses those methods to perform different tasks.
//This allows us to perform a single action in different ways.
public class Polymorphism {

    class Animal{
        void Animal_Sound(){
            System.out.println("Animal makes sound");
        }
    }
    class Human{
        void Human_Sound(){
            System.out.println("Human cries");
        }
    }

    public static void main(String[] args) {
        Polymorphism outer = new Polymorphism();
        Animal objAnimal = outer.new Animal();
        Human objHuman = outer.new Human();

        objAnimal.Animal_Sound();
        objHuman.Human_Sound();
    }
}
