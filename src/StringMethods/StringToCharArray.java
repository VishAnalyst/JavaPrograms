package StringMethods;
//Here toCharArray() is to convert a string a in to Character array
public class StringToCharArray {
    public static void main(String[] args) {
        String strChar = "Dominic and the lady purse";
        System.out.println("String is converted in to Char[]: ");
        char ch[] = strChar.toCharArray();
        for (char w : ch){

            System.out.println(w);
        }
    }
}
