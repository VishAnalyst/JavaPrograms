package Oops;

//method riding, multiple methods can have the same name with same parameters:
//IMPORTANT: AFTER INHERITANCE ONLY WE CAN OVERRIDE

public class MethodOverriding {
    class Animal {
        void move() {
            System.out.println("Animal is moving");
        }
        void eat(){
            System.out.println("Animal Eats");
        }
    }
    class Dog extends Animal {
        @Override
        void move() {
            System.out.println("Animal Jumps");
        }
        void angry (){
            System.out.println("Animal Attacks");
        }
    }

    public static void main(String[] args) {
        MethodOverriding outer = new MethodOverriding();
        Dog objDog = outer.new Dog();

        objDog.eat();
        objDog.move();
        objDog.angry();
    }

}
