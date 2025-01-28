package Exception_handling;

public class WithTryCatch {
    public static void main(String[] args) {
        try {
            int num = 100;
            int divi = 0;
            int reminder = num / divi;

            System.out.println("The remainder value is: " + reminder);
        } catch (ArithmeticException e) {
            System.out.println("Please ensure the denominator is not zero");
        }
    }
}
