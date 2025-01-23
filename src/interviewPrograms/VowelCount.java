package interviewPrograms;

public class VowelCount {
    public static void main(String[] args) {

        String strSen = "Some sang in close harmony, some sang long vowels, like a bed of strings.";
        int strLen = strSen.length();
        System.out.println("Length of the string is: " + strLen);

        // Initialize counts
        int ccount = 0;
        int vcount = 0;

        for (int i = 0; i < strLen; i++) {
            char ch = Character.toLowerCase(strSen.charAt(i)); // Convert to lowercase for uniformity

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++;
            }
            // Check if the character is a consonant (alphabetical and not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                ccount++;
            }
        }

        System.out.println("The Character count in the string (excluding spaces/special characters) is: " + ccount);
        System.out.println("The Vowels count in the string is: " + vcount);
    }
}