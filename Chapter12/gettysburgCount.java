/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

import java.util.*;
import java.net.*;

/**
 *
 * @author Java
 */
public class gettysburgCount {

    public static void main(String[] args) {
        int totalWords = 0;

        try (Scanner readAddress
                = new Scanner(new URL("https://www.mathworks.com/moler/ncm/gettysburg.txt")
                        .openStream())) {
                    while (readAddress.hasNext()) {
                        totalWords += readAddress.nextLine().split("[ ]+").length;
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    System.exit(0);
                }
                System.out.println("The Gettysburg address has " + totalWords
                        + " words.");
    }
}
