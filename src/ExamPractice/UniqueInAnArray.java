package ExamPractice;

public class UniqueInAnArray {
    public static void main(String[] args) {
            int[] num = {1,2,2,3,3,4};
            String result = "";

            for(int i=0;i<num.length;i++) {
                int count = 0;
                for(int j=0;j<num.length;j++) {
                    if(num[i]==num[j]) {
                        count += 1;
                    }
                }
                if(count==1) {
                    result += num[i]+" ";
                }
            }
            System.out.println(result);

        }

    }
