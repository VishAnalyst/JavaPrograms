package StringMethods;

public class ComparetoIgnoreCase {
    public static void main(String[] args) {
        //go to ascii table https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
        //it will give the values for each.
        //compare will compare and will print reue or falso
        //compare to ignore case will change capital to small and viseversa and check the condition.

        String str1 = "Assignment";
        String str2 = "assignment";
        String str3 = "Astonishment";

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.compareToIgnoreCase(str3));
    }
}
