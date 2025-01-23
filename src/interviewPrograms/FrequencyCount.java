package interviewPrograms;

public class FrequencyCount {
    public static void main(String[] args) {
        //String length count find and print the same
        String strSent = "She sells sea shells on the sea shore";
        int strLen = strSent.length();
        System.out.println("Length of the entered string is: "+strLen);

        //To find the number of s and print the same
        int count =0;
        char ch ='s';
        for (int i=0; i<strLen; i++){
            if(strSent.charAt(i)==ch)
                count++;
        }
        System.out.println("Number of times S occurring in the string is: "+count);
    }
}
