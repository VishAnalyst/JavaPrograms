package Oops;

//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

public class Abstraction {

//    An abstract class can have both abstract and regular methods:
    abstract class Animal{
    public abstract void animal_Sound();
    public void sleep(){
        System.out.println("zzzzZZZZZZZ");
    }
    }
//    it is not possible to create an object of the Animal class:
//    Animal myObj = new Animal(); // will generate an error

    //So we need create inheritance class for the same.

    class dog extends Animal{
        public void animal_sound(){
            System.out.println("Dog barks");
        }

        @Override
        public void animal_Sound() {

        }
    }

    public static void main(String[] args) {
        Abstraction outer = new Abstraction();
        dog objdog = outer.new dog(); // Create a Pig object
        objdog.animal_sound();
        objdog.sleep();
    }



}
