package BasicPrograms;

public class FindLargestofThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a>b && a>c) {
            System.out.println("Largest number is A");
        }else if (b>a && b>c) {
            System.out.println("Largest number is B");
        }else if (c>a && c>b) {
            System.out.println("Largest number is C");
        }
    }
    
}
