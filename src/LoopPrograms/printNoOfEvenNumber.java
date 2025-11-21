package LoopPrograms;

public class printNoOfEvenNumber {
    public static void main(String[] args) {
        int count = 0;
        for(int num=1; num<=100; num++){
            if (num%2==0) {
                System.out.println("Even Numbers are: " + num);
                count++;
                System.out.println("Count of even Numbers is: "+count);
            }
        }
    }
    
}
