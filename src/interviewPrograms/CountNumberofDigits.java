package interviewPrograms;

public class CountNumberofDigits {
    public static void main(String[] args) {
        int num = 123456;
        int count = 0;

        //While loop to check the condition
        while(num > 0){
        num = num/10;
        count++;
        }

        System.out.println("The count is: "+ count);

    }

}
