
package charectorstream3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lab3 {
    public static void main(String[] args) {
        try {
            PrintWriter output =new PrintWriter("data.txt");
            output.println("Baitong Sae-kow");
            output.println("19");
            output.println("42.3");
            output.println("163.0");
            output.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader input =new BufferedReader(file);
            String s;
            while((s=input.readLine())!=null){
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CharectorStream3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CharectorStream3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
