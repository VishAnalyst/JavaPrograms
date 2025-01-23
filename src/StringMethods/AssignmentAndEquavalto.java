package StringMethods;

public class AssignmentAndEquavalto {
    public static void main(String[] args) {

        //== Only the location matters
        //equals only content matters

        String str1 = "Dhoni";
        String str2 = "Dhoni";
        String str3 = new String("Dhoni");
        String str4 = "dhoni";

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
    }
}
