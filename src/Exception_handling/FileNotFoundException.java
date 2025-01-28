package Exception_handling;

//'/Users/preethianil/Downloads/untitled folder'

import java.io.File;
import java.io.FileReader;

public class FileNotFoundException {
    public static void main(String[] args) {
        try{
            File file = new File("/Users/preethianil/Downloads/untitled folder/ab.text");
            FileReader fileReader = new FileReader(file);
            System.out.println("File Found");
        }catch (java.io.FileNotFoundException e){
            System.out.println("File not Found");
        }


    }

}
