package interviewPrograms;

public class swappingValueWithTemp {
   public static void main(String[] args) {

       //Initialising the value
       int a = 15;
       int b = 5;

       //printing the values
       System.out.println("Value of the a is: "+ a);
       System.out.println("Value of the b is: "+ b);

       //Initialising temp value
       int temp = 0;
       System.out.println("Value of the temp is: "+ temp);

       //After swapping
       temp = a;
       a=b;
       b=temp;

       System.out.println("Value of the a after swapping is: "+ a);
       System.out.println("Value of the b after swapping is: "+ b);

   }

}
