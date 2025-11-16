package BasicPrograms;

public class MarksAndGrade {
    public static void main(String[] args) {
        int marks = 90;
        String fail = "Failed";
        
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println(fail);
        }
  

    }
    
}
