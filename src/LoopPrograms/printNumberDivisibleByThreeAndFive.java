package LoopPrograms;

public class printNumberDivisibleByThreeAndFive {
    public static void main(String[] args) {
        for(int num=1; num<=200; num++){
            if(num%3==0){
                System.out.println("Number divisible by 3 is: " + num);
                
            }else if (num%5==0) {
                System.out.println("Number divisible by 5 is: "+num);
            }    
        }
    }
    
}
