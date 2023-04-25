
package charectorstream3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab4 {
    public static void main(String[] args) {
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader input =new BufferedReader(in);
        System.out.print("Enter text: ");
        try {
            String s=input.readLine();
            System.out.println(s);
        } catch (IOException ex) {
            Logger.getLogger(Lab4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
