/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

import java.util.*;
import java.io.*;

/**
 *
 * @author Java
 */
public class RemoveTest {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: RemoveTest String FileName");
            System.exit(1);
        }
        String rString = args[0];
        String fileName = args[1];
        File inFile = new File(fileName);
        File tempFile = new File("temp.txt");
        tempFile.delete();

        try (PrintWriter outWriter = new PrintWriter(tempFile);
                Scanner inWriter = new Scanner(inFile)) {
            while (inWriter.hasNext()) {
                outWriter.println(inWriter.nextLine().replace(rString, ""));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        inFile.delete();
        tempFile.renameTo(inFile);
        tempFile.delete();
    }

}
