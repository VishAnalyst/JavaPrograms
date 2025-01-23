package StringMethods;

public class ContainsStartsEnd {
    public static void main(String[] args) {
        //contains check the sequence of character.
        //Starts with = Check the start of the sequence and print true/false
        //Ends with = Check the codition string ending and print the condition

        String str1 = "Embedded";
        String str2 = "Superstitious";

        System.out.println(str1.contains("eb"));
        System.out.println(str1.endsWith("ed"));
        System.out.println(str2.startsWith("Su"));
    }
}
