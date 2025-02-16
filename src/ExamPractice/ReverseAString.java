package ExamPractice;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "Vishnu Nath Ramesh";
        String StrRev = "";
        System.out.println("Given String is: "+name);

        for(int i=name.length()-1;i>=0;i--){
            StrRev = StrRev+name.charAt(i);
            System.out.println("Steps of reversal is: "+StrRev);
        }
        System.out.println("Reversal of the string is: "+StrRev);
    }
}
