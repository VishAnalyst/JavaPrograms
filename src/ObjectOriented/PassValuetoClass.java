package ObjectOriented;

class StudentInfo {
    int roll;
    String name;

    void InsertRecord(int r, String n){
        roll = r;
        name = n;
    }
    void displayInfo(){
        System.out.println(roll+"  "+name);
    }

}

public class PassValuetoClass {
    public static void main(String[] args) {
        StudentInfo objStudent = new StudentInfo();
        objStudent.InsertRecord(1,"Rocky");
        objStudent.displayInfo();
    }
}
