package Exception_handling;

public class ArrayIndex {
    public static void main(String[] args) {
        try{
            int arr[] = new int[5];
            arr[7]= 9;
            System.out.println(arr[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please ensure the array index is less than = 5");
        }



    }
}
