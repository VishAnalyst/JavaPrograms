package interviewPrograms;

public class FibonocciSeries {
    public static void main(String[] args) throws InterruptedException {
        //Initialize n1,n2, and sum as a start of the fibonocci series.
        int n1 =0;
        int n2=1;
        int sum =0;
        System.out.println("n1 is: "+n1);
        System.out.println("n2 is: "+n2);

        //Adding for loop to execute the loop until 10
        // then assign sum and print the sum and assign n2=n1 and sum =n2
        for (int i=2;i<10;i++){
        sum= n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
            Thread.sleep(1000);
        }
    }
}
