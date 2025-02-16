package ExamPractice;

import org.w3c.dom.ls.LSOutput;

public class VowelsConsonents {
    public static void main(String[] args) {
        String alphabets = "Vishnu";
        String vowels = "";
        String consonents = "";

        for(int i=0;i<alphabets.length();i++){
        char charactor = Character.toLowerCase(alphabets.charAt(i));
        if(charactor=='a'||charactor=='e'||charactor=='i'||charactor=='o'||charactor=='u'){
        vowels = vowels + charactor + "";
        }else {
            consonents = consonents + charactor + "";
        }
        }

        System.out.println(vowels);
        System.out.println(consonents);
    }



}
