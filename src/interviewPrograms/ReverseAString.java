package interviewPrograms;

public class ReverseAString {
    public static void main(String[] args) {
        //Enter the string
        //Find the string length and print the same
        //To determine thr string everse we need to specify string reverse
        String strName = "Mahendra sing dhoni";
        System.out.println("String lenght is: "+strName.length());
        String strRev = "";

        //Determine the for loop to check whether to iterate through the given string
        for(int i = strName.length()-1; i>=0; i--   ){
        strRev=strRev+strName.charAt(i);
            System.out.println("The steps of reverse is: "+strRev);
        }
        System.out.println("Reversal of the given string is: "+strRev);
    }
}
