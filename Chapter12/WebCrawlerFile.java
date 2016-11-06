/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

import java.util.*;
import java.net.*;
import java.io.*;

/**
 *
 * @author Java
 */
public class WebCrawlerFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.nextLine();
        System.out.print("Enter a file name: ");
        String fileName = input.nextLine();
        crawler(url, fileName);
    }

    public static void crawler(String startingURL, String fileName) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTransversedURLs = new ArrayList<>();
        File outFile = new File(fileName);
        outFile.delete();
        try (PrintWriter fileWriter = new PrintWriter(outFile);) {

            listOfPendingURLs.add(startingURL);
            while (!listOfPendingURLs.isEmpty()
                    && listOfTransversedURLs.size() <= 100) {
                String urlString = listOfPendingURLs.remove(0);
                if (!listOfTransversedURLs.contains(urlString)) {
                    listOfTransversedURLs.add(urlString);
                    fileWriter.println("Craw " + urlString);

                    for (String s : getSubURLs(urlString)) {
                        if (!listOfTransversedURLs.contains(s)) {
                            listOfPendingURLs.add(s);
                        }
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return list;
    }

}
