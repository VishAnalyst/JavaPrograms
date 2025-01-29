package FileHadling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args)  {
        try{File file = new File("/Users/preethianil/Downloads/untitled folder/abc.txt");
            if(file.exists()){
                System.out.println("File exists can write to the file");
                FileWriter fileWriter = new FileWriter("/Users/preethianil/Downloads/untitled folder/abc.txt");
                fileWriter.write("Java is simple but powerful");
                fileWriter.close();
                System.out.println("TEST PASSED");
            }else{
                System.out.println("TEST FAILED no file found");
            }

        }catch (IOException e){
            System.out.println("Error occured: "+e.getMessage());
        }
    }
}
