package LoopPrograms;

public class printOddFromOneToFifty {
    public static void main(String[] args) {
        for(int num=1; num<=50; num++){
            if (num%2!=0) {
                System.out.println("Odd Numbers are:" + num);
            }
        }
    }
    
}
