/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;
import java.io.*;

/**
 *
 * @author Java
 */
public class WriteData {
    public static void main(String[] args)
            throws IOException {
        File file = new File("scores.txt");
        if(file.exists()) {
            System.out.println("File already exists.");
            System.exit(1);
        }
        PrintWriter output = new PrintWriter(file);
        
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);
        
        output.close();
    }
    
}