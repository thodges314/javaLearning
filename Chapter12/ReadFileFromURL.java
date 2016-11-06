/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

import java.util.Scanner;
import java.net.*;
import java.io.*;

/**
 *
 * @author Java
 */
public class ReadFileFromURL {

    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            URL url = new URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
                System.out.println(line);
            }
            System.out.println("The file size is " + count + " characters.");
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL.");
        } catch (IOException ex) {
            System.out.println("I/O Errors: no such file.");
        }
    }
}
