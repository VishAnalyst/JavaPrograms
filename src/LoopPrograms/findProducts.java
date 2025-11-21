package BasicPrograms;

public class findProducts {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++) {
            String productFinder = "product"+i;
            System.out.println("Checking "+productFinder);

            if (productFinder.equals("product3")) {
                System.out.println("Product3 product found");
                break;
            }

        }
        
    }
    
}
