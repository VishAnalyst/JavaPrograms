package FinalKeyword;
//final keyword is assigned to method
class Speed{
    final int speedLimit =70;
    void Run(){
        System.out.println(speedLimit);
    }
}

public class FinalKeywordDataType {
    public static void main(String[] args) {
        Speed speed = new Speed();
        speed.Run();
    }
}
