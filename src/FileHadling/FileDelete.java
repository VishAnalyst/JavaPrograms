package FileHadling;

import java.io.File;
import java.io.IOException;

public class FileDelete {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/preethianil/Downloads/untitled folder/abc.pdf");
        file.createNewFile();
        if(file.delete()){
            System.out.println("File is deleted successfully TEST PASSED:"+file.getName());
        }else{
            System.out.println("Some error occured TEST FAILED");
        }
    }
}
