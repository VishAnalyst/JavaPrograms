package JumpStatements;

//Break statement will break the loop/action which was intended to do.

public class BreakExample {
    public static void main(String[] args) {
        int num = 10;
        for(int i=0; i<=num; i++){
            if(i==6)
                break;
                System.out.println("System print "+i);

        }

    }
}
