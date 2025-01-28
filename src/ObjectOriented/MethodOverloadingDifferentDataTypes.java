package ObjectOriented;
//Acgieving method overloading with different datatypes and different sequence
class DisplayContent{
    void display(int roll, String name){
        System.out.println("Roll no is: " + roll);
        System.out.println("Student name is:"+name);
    }
    void display(int className, double division){
        System.out.println("Class name is: "+className);
        System.out.println("Class division is: "+division);
    }
    void display(double maxMarks, double attainedMarks){
        System.out.println("Maximum marks is: "+maxMarks);
        System.out.println("Marks Attained by the student is: "+attainedMarks);
    }
    void display(char grade){
        System.out.println("Student Grade is: "+grade);
    }
}

public class MethodOverloadingDifferentDataTypes {
    public static void main(String[] args) {
        DisplayContent displayContent = new DisplayContent();
        displayContent.display(1,"Albert");
        displayContent.display(11,'B');
        displayContent.display(100.0,97.6);
        displayContent.display('A');
    }
}
