/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

import java.io.*;
import java.util.*;

/**
 *
 * @author Java
 */
public class CountInstances {

    public static void main(String[] args) {
        int totalChars = 0;
        int totalWords = 0;
        int totalLines = 0;
        String fileName;
        String thisLine;

        if (args.length != 1) {
            System.out.println("Usage: CountInstances fileName");
            System.exit(1);
        }
        fileName = args[0];
        File inFile = new File(fileName);
        try (Scanner loadLines = new Scanner(inFile);) {
            while (loadLines.hasNext()) {
                thisLine = loadLines.nextLine();
                totalChars += thisLine.length();
                totalWords += thisLine.split("[ ]+").length;
                totalLines += 1;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(totalChars + " characters");
        System.out.println(totalWords + " words");
        System.out.println(totalLines + " lines");

    }
}
