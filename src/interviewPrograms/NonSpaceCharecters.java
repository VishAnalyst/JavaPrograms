package interviewPrograms;

public class NonSpaceCharecters {
    public static void main(String[] args) {
        //Printing the lenght of the string
        String str = "Always Dream high";
        int strLen = str.length();
        System.out.println("Length of the string is: "+strLen);
        //Find the number of charectors in the string
        int count =0;
        for(int i=0; i<strLen; i++){
            if (str.charAt(i) != ' ')
                count++;
        }
        System.out.println("Total number of characters in the string is: "+count);
    }
}
