package Encoding;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicatesInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entre the values to a String
        System.out.println("Please entre the value to the String: ");
        String input = sc.nextLine();

        //No splitting each word in a string in to separate words.
        String[] words  = input.split("//s+");

        //Now we need to call the hashet so as to track the unique words
        HashSet<String> wordSet = new HashSet<>();
        //this methode will automatically return false if the any duplicates are found
        boolean hasDuplicates = false;

        //determine for loop to loop through the string and pass the content to the hashset
        for (String word:words){
            if (!wordSet.add(word.toLowerCase())) {
                System.out.println("Duplicate word found: "+ word);
                hasDuplicates = true;
            }
        }
        if (!hasDuplicates){
            System.out.println("NO duplicates found");
        }
    }

}
