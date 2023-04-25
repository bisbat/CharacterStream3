
package charectorstream3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lab5 {
    public static void main(String[] args) {
        try {
            FileReader file=new FileReader("data.txt");
            BufferedReader input =new BufferedReader(file);
            String name=input.readLine();
            System.out.println(name);
            String age=input.readLine();
            System.out.println(age);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
