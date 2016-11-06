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
public class ReplaceText {

    public static void main(String[] args) throws Exception {
        Scanner inputT = new Scanner(System.in);
        System.out.print("Source file: ");
        String sourceName = inputT.next();
        System.out.print("Target File: ");
        String targetName = inputT.next();
        System.out.print("Old String: ");
        String oldName = inputT.next();
        System.out.print("New string: ");
        String newName = inputT.next();

        File sourceFile = new File(sourceName);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + sourceName
                    + " does not exist.");
            System.exit(1);
        }

        File targetFile = new File(targetName);
        if (targetFile.exists()) {
            System.out.println("Target file " + targetName
                    + " already exists.");
            System.exit(2);
        }

        try (
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(oldName, newName);
                output.println(s2);
            }
            System.out.println("done!");
        }
    }
}
