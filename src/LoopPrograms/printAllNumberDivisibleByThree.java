package LoopPrograms;

public class printAllNumberDivisibleByThree {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by three are: ");
        for(int num=1; num<=50; num++){
            if(num%3==0){
                
                System.out.println(num);
            }

        }
    }
    
}
