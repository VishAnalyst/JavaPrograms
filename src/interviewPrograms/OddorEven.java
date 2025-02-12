package interviewPrograms;

public class OddorEven {
    public static void main(String[] args) {
        int[] arr = {22,33,44,55,66,77,77,88,1221,234};
        System.out.println("The array lenght is: "+arr.length);
        //Going inside the for loop and chek all the numbers
        System.out.println("The Odd numbers: ");
        for(int i=0;i< arr.length;i++){
            if (arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("The Even Numbers: ");
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }

    }
}
