
package templatemethod;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromUser extends BookReader{
    ArrayList<String> inputs = new ArrayList<String>();
    Scanner keyboard = new Scanner(System.in);
    
    @Override
    void initialize() {
        boolean keepAddingLines = true;
        String choice = null;
        do {
            System.out.print("Add a line: ");
            inputs.add(keyboard.nextLine());
            System.out.print("Add more lines (Y/N): ");
            choice = keyboard.nextLine();
            if(choice.equals("N") || choice.equals("n")) {
                keepAddingLines = false;
            }
        } while (keepAddingLines == true);
    }
    
    void startReading() {
        for (int x = 0; x < inputs.size(); x++) {
            System.out.println(inputs.get(x));
        }
    }
    
    void stopReading() {
        
    }
    
}
