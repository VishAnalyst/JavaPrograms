package JumpStatements;

//Continue will skip a step if we user it. Here 5 will be missingin the loop
public class ContinueExample {
    public static void main(String[] args) {
        int num = 10;
        for(int i=0; i<=num; i++){
            if(i==5)
                continue;
            System.out.println("System print"+i);
        }
    }
}
