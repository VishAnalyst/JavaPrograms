package BasicPrograms;

public class FindingIphone {
    public static void main(String[] args) {
        for(int i=5;i<=17;i++){
            String matchFound = "IPHONE"+i;
            System.out.println("Checkig for iPhone"+i);
            if (matchFound.equals("IPHONE15")) {
                System.out.println("Iphone Found: ");
            }else{
                System.out.println("Not Found");
            }
            
        }
        
    }
    
}
