package interviewPrograms;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55,66,77,88,99,100};
        System.out.println("The array given is :"+arr[0]);

        int smallest = arr[0];
        int largest = arr[0];

        for(int i =1;i< arr.length;i++){
            if( arr[i] < smallest){
                smallest=arr[i];
            }if( arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Smallest is: "+smallest);
        System.out.println("Largest is: "+largest);
    }
}
