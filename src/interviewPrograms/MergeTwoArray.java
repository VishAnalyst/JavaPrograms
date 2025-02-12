package interviewPrograms;

public class MergeTwoArray {
    public static void main(String[] args) {
        //declaring two arrays to merge
        int[] array1 = {11,22,33,88,99};
        int[] array2 ={44,55,66,77,111,222};
        //printing the declared array
        System.out.println("Array one is: "+array1);
        System.out.println("Array 2 is: "+array2);
        //Printing the array lenght
        System.out.println("Array 1 length is: "+array1.length);
        System.out.println("Array 2 length is: "+array2.length);
        //Declaring the merge array
        int[] merge = new int [array1.length+array2.length];

        //Looping through the array1 and pass the condition
        for(int i=0;i<array1.length;i++){
            merge[i] = array1[i];
        }
        for(int i=0;i<array2.length;i++){
            merge[array1.length+i] = array2[i];
        }
        for(int i=0;i<merge.length;i++){
            System.out.println(merge[i]);
        }
    }
}
