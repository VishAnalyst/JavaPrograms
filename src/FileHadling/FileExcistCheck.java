package FileHadling;

import java.io.File;
import java.io.IOException;

public class FileExcistCheck {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/preethianil/Downloads/untitled folder/abc.pdf");
        if(file.exists()){
            System.out.println("File Already exist TEST FAILED");
        }else{
            System.out.println("File need to be created");
            File fileNew = new File("/Users/preethianil/Downloads/untitled folder/abc.pdf");
            fileNew.createNewFile();
            System.out.println("New File is created and file name is: "+fileNew.getName());
        }



    }
}
