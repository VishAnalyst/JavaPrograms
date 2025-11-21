package LoopPrograms;

public class printSumOfNoFromOneToFifty {
    public static void main(String[] args) {
        int sum = 0;
        for(int num=1; num<=50; num++){
            sum = sum + num;
            
        }
        System.out.println("Sum is: " + sum);
    }
}

