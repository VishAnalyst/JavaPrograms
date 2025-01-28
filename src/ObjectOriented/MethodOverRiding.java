package ObjectOriented;
//Method overriding will erase one value of a method with another method.

class Bank{
        int getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    int geRateOfInterest(){
        return 10;
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
    SBI sbi = new SBI();
        System.out.println("SBI Rate of Interest is: "+sbi.geRateOfInterest());

    }
}
