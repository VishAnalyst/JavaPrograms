public class nestedLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {        // outer loop: rows

            for(int j = 1; j <= i; j++) {    // inner loop: stars
                System.out.print("*");
            }

            System.out.println();            // move to next line
        }

    }
    
}
