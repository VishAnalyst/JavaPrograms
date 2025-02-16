package ExamPractice;

public class SearchingElement {
    public static void main(String[] args) {
        int[] num = {10,4,400,500,10,1};
        int search_element = 400;
        boolean result = true;
        for(int i=0;i<num.length;i++) {
            if(num[i]==search_element) {
                System.out.println(num[i]);
                System.out.println(i);
                result = false;
                break;
            }
        }
        if(result) {
            System.out.println("Not Found");
        }
    }

}
