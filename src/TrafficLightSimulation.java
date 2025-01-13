import java.util.Scanner;

public class TrafficLightSimulation {

//        Problem: Write a Java program to simulate a traffic light system using an integer (1 to 3).
//        1: "Red"
//        2: "Yellow"
//        3: "Green"
//        Input: An integer (1 to 3)
//        Output: The corresponding traffic light color.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please entre a value in from 1-3");

        while(true){
            if(!sc.hasNextInt()){
                System.out.println("INVALID ENTRY PLEASE TRY AGAIN");
                sc.next();
                continue;

            }

            int num = sc.nextInt();
            System.out.println("Entered value is: " + num);

            if(num==1){
                System.out.println("LIGHT IS RED");
            } else if (num ==2) {
                System.out.println("LIGHT IS YELLOW");
            } else if (num ==3) {
                System.out.println("LIGHT IS GREEN");
            }else{
                System.out.println("INVALID NUMBER ENTRY");
            }
            break;
        }
        sc.close();

    }
}
