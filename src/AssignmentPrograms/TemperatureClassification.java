package AssignmentPrograms;

import java.util.Scanner;

public class TemperatureClassification {
//    Problem: Write a Java program to classify the weather based on the given temperature.
//            Below 0°C: "Freezing"
//            0°C to 15°C: "Cold"
//            16°C to 30°C: "Moderate"
//    Above 30°C: "Hot"
//    Input: Temperature in Celsius (integer)
//    Output: The weather classification based on the temperature.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please entre the Temperature: ");

        while(true){
            //Checking for invalid output
            if(!sc.hasNextDouble()){
                System.out.println("INVALID TEMPERATURE ENTERED");
                sc.next();
                continue;
            }

            double temp = sc.nextDouble();
            System.out.println("The Temperature entered is: "+" "+temp);

            if(temp <= 0){
                System.out.println("Temperature in °C - Freezing"+" "+ temp);
            } else if (temp<=15) {
                System.out.println("Temperature in °C - COLD"+" "+ temp);
            }else if (temp<=30) {
                System.out.println("Temperature in °C - MODERATE"+" "+ temp);
            } else{
                System.out.println("Temperature in °C - HOT"+ " " +temp);
            }
            break;
        }
       // sc.close();
    }
}
