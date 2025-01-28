package Exception_handling;

public class StringExeception {
    public static void main(String[] args) {
        String name = "Mahendra Sign dhoni";
        String lowerCase = name.toLowerCase();

        System.out.println("Initial entered string is: "+ name);
        System.out.println("Lower case of the string is: "+lowerCase);

        int lowLenght = lowerCase.length();
        int nameLenght = name.length();

        System.out.println("Lower case string lenght is: "+lowLenght);
        System.out.println("Actual String lenght is: "+nameLenght);
        if (lowLenght == nameLenght){
            System.out.println("String matches");
        }else {
            System.out.println("String does not match");
        }
        try{
            char ch = lowerCase.charAt(50);
            System.out.println("TEST PASSED: Corrector found is: "+ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Character not found please enter correct index value: TEST FAILED");
        }


    }
}
