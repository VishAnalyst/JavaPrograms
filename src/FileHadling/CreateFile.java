package FileHadling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/preethianil/Downloads/untitled folder/abc.txt");
        if(file.createNewFile()){
            System.out.println("file is created, File name is: "+file.getName());
        }else {
            System.out.println("File already exsists");
        }
    }
}
