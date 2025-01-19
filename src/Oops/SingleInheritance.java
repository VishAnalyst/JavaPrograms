package Oops;

//Inheritance lets us inherit attributes and methods from another class. P
//This allows us to perform a single action in different ways.

public class SingleInheritance {

    // Parent class
    class Student_Fees {
        void fees() {
            System.out.println("Fees is 20 k");
        }
    }

    // Child class inheriting from Parent class
    class Student_name extends Student_Fees {
        void student_Name() {
            System.out.println("Student name is: Ragav");
        }
    }

    // Main method class
    public static void main(String[] args) {
        SingleInheritance outer = new SingleInheritance(); // Instance of the outer class

        // Creating an object of the inner class Student_name
        Student_name objStuName = outer.new Student_name();
        objStuName.student_Name(); // Call method from child class
        objStuName.fees(); // Call method from parent class (inherited)
    }
}