package ExamPractice;

public class SmallestAndLargest {
    public static void main(String[] args) {

        int a[] = {10,50,60,80,20,10,30};
        int small_num = a[0];
        int largest_num = a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]<small_num){
                small_num=a[i];
            }else if(a[i]>largest_num){
                largest_num=a[i];

            }
        }

        System.out.println("Lasgest number is: "+small_num);
        System.out.println("Smallest number is: "+largest_num);
    }
}
