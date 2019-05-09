package templatemethod;

import java.io.File;
import java.util.Scanner;

public class ReadfromFile extends BookReader {

    File book = null;
    Scanner reader = null;
    
    @Override
    void initialize() {
        // Modify this method to open the file prideprejudice.txt (included with project)
        book = new File("prideprejudice.txt");
        try {
            reader = new Scanner(book);            
        }
        catch (Exception e) {
            System.out.println("File not found");
        }

    }

    @Override
    void startReading() {
        // Modify this method to read lines from the file and print each line to standard output
        while(reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        System.out.println("");
    }

    @Override
    void stopReading() {
        // Modify this method to close the file
        System.out.println("Fin");
        reader.close();
    }
}
