package FileHadling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintDataInFile {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        File file = new File("/Users/preethianil/Downloads/untitled folder/testfile.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String printLine = scanner.nextLine();
            System.out.println(printLine);
            Thread.sleep(1000);
        }
        scanner.close();
    }
}
