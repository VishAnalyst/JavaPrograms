package StringMethods;
//Replace Will replace particular element with another word
//It will replace all the elements from a-z into a string.
public class ReplaceAll {
    public static void main(String[] args) {
        String strRepla = "Tiger comes to eat";
        System.out.println("Replace Tiger with Lion:" +strRepla.replace("Tiger","Lion"));

        String strRep = "Hellow";
        System.out.println("The replaced word is L and output is: "+strRep.replace('l','P'));

        String strReAll = "Pigeon";
        System.out.println("Replacing Pigeon with Eagle: Output is "+strReAll.replaceAll("Pigeon","Eagle"));
    }
}
