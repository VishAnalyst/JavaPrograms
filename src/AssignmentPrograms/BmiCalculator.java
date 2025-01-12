package AssignmentPrograms;


import java.util.Scanner;

public class BmiCalculator {
//    Problem: Write a Java program to calculate the Body Mass Index (BMI) and classify the person based on the result.
//    Formula: BMI = weight / (height * height)
//    Below 18.5: "Underweight"
//            18.5 to 24.9: "Normal weight"
//            25 to 29.9: "Overweight"
//            30 and above: "Obesity"
//    Input: Weight (kg) and Height (m)
//    Output: BMI value and category.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       while (true) {

           //Entering the Weight
           System.out.println("Please entre the WEIGHT in Kg: ");
           if(!sc.hasNextDouble()){ //Validate weight is not a double value
               System.out.println("INVALID WEIGHT VALUE");
               sc.next(); // Clear invalid input
               continue;
           }
           double weight = sc.nextDouble();

           //Entering the Height
           System.out.println("Please entre the HEIGHT: ");
           if(!sc.hasNextDouble()){
               System.out.println("INVALID HEIGHT VALUE");
               sc.next();// Clear invalid input
               continue;
           }
           double height = sc.nextDouble();

           //Validate the entred height and weight
           if (weight<0 || height <0) {
               System.out.println("Weight and Height should be positive values! Please try again");
               continue;
           }
           //Calculate the bmi
           double bmi = (weight / (height*height));
           System.out.println("The BMI value is: "+ bmi);

           //Establishing the condition

           if(bmi < 18.5){
               System.out.println("Underweight");
           }else if (bmi < 25.0) {
               System.out.println("Normal weight");
           }else if(bmi < 30.0){
               System.out.println("Overweight");
           }else {
               System.out.println("Obesity");
           }
           break;
       }
        sc.close();
    }
}
