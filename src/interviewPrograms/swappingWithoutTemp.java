package interviewPrograms;

public class swappingWithoutTemp {
    public static void main(String[] args) {
        //Initialising the value
        int a = 5;
        int b = 25;

        //printing the values
        System.out.println("Value of the a is: "+ a);
        System.out.println("Value of the b is: "+ b);

        //Swapping method
//        a=a+b;
//        b=a-b;
//        a=a-b;

            a=a*b;
            b=a/b;
            a=a/b;

        //Values after swapping
        System.out.println("Value of the a after swapping is: "+ a);
        System.out.println("Value of the b after swapping is: "+ b);
    }
}
