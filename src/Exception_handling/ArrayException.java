package Exception_handling;

public class ArrayException {
    public static void main(String[] args) {
        try {
            String arr[] = {"Sanju","Sachin","Dhoni","Dravid","Virat"};
            for (int i =0; i<=5; i++){
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please ensure the  value of i is <=4");
        }

    }
}
