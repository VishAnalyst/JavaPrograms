package StringMethods;
//SubstringSubsequence will only print from where we want to till where the ending is.
public class SubstringSubsequence {
    public static void main(String[] args) {
        String strSub = "Augustine";
        System.out.println(strSub.substring(0,4));
        System.out.println(strSub.subSequence(5,9));
    }
}
