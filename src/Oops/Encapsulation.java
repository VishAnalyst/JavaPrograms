package Oops;

//Encapsulation in Java is a fundamental principle of object-oriented programming (OOP) that hides data and methods within a class.

public class Encapsulation {
    class Programmer {
        private String name;

        // Getter and Setter for name
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    public class Geeks {
        public static void main(String[] args) {
            Encapsulation outer = new Encapsulation();
            Programmer p = outer.new Programmer();
            p.setName("Geek");
            System.out.println("Name=> " + p.getName());
        }
    }

}
