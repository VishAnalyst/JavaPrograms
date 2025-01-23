package StringMethods;
//split(" ") will split the words in to different lines
public class SplitWords {
    public static void main(String[] args) {
        String strSent = "I went to cinemas, But Did not liked the movie";
        String[] words = strSent.split(" ");
        for (String word : words){
            System.out.println(word);
        }
    }
}
