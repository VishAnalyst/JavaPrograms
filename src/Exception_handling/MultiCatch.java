package Exception_handling;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[7] = 10/0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please ensure index is less than 5");
        }

        catch (ArithmeticException e){
            System.out.println("Please ensure the denominator is not zero");
        }

        finally {
            System.out.println("Finally will run even if the exception is present or not.");
        }




    }
}
