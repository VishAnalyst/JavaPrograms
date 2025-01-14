package Oops;

    class Animal{
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    class Dog{
        void bark(){
            System.out.println("The Dog Barks");
        }
    }

    class Fish{
        void swim(){
            System.out.println("Fish Swims");
        }
    }

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Fish objFish = new Fish();
        Dog objDog = new Dog();
        Animal objAnimal = new Animal();

        //Displaying the output
        objFish.swim();
        objDog.bark();
        objAnimal.eat();
    }
}
