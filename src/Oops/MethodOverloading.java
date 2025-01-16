package Oops;

//method overloading, multiple methods can have the same name with different parameters:

//public class FileManager {
//    public void readFile(String fileName) {
//        // Code to read a file with given name
//    }
//    public void readFile(String fileName, int bufferSize) {
//        // Code to read a file with a given name and buffer size
//    }
//}

public class MethodOverloading {

    public class Sum {
        // Overloaded methods
        public int sum(int a, int b) {
            return (a + b);
        }

        public int sum(int a, int b, int c) {
            return (a + b + c);
        }

        public double sum(double a, double b) {
            return (a + b);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        MethodOverloading outer = new MethodOverloading();

        // Create an instance of the inner class
        Sum objSum = outer.new Sum();

        // Call the overloaded methods
        System.out.println(objSum.sum(10, 30));         // Calls sum(int, int)
        System.out.println(objSum.sum(10, 30, 50));     // Calls sum(int, int, int)
        System.out.println(objSum.sum(10.0, 30.6));     // Calls sum(double, double)
    }
}