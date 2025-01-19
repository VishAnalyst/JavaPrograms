package AssignmentPrograms;

public class sumOfDigits {
    public static void main(String[] args) {

        int num = 56789;
        int rem = 0;
        int sum = 0;

        //While condition fot checking repeated conditions
        while (num>0){

            rem = num%10;
            sum = sum + rem;
            num = num/10;

        }
        System.out.println("Sum of digits is: "+ sum);

    }
}
