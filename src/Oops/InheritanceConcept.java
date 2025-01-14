package Oops;

public class InheritanceConcept {
    interface ClassA {
        default void display() {
            System.out.println("Inside Class A");
        }
    }

    interface ClassB {
        default void display() {
            System.out.println("Inside Class B");
        }
    }

    class ClassC implements ClassA, ClassB {
        @Override
        public void display() {
            // Resolve ambiguity by explicitly choosing one or combining both
            ClassA.super.display();
            ClassB.super.display();
            System.out.println("Inside Class C");
        }
    }

    public static void main(String[] args) {
        InheritanceConcept concept = new InheritanceConcept();
        ClassC obj = concept.new ClassC();
        obj.display();
    }
}
