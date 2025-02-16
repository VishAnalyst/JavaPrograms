package ExamPractice;

public class MissingElementInArray {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,7,9,10};
        String result ="";

        for(int i=0;i<num.length-1;i++) {
            if(!(num[i]+1==num[i+1])) {
                result += num[i]+1 + " ";

            }
        }

        System.out.println(result);
    }
}
