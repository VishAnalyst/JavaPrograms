package this_Super;

class num1{
    int num = 25;
}
class num2 extends num1{
    int num1 = 50;

    void show(int num3){
        System.out.println(num3);
        System.out.println(this.num1);
        System.out.println(super.num);
    }
}

public class exampleProgram {
    public static void main(String[] args) {
        num2 num2 = new num2();
        num2.show(100);

    }
}
