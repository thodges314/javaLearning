/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Java
 */
public class ReadData {

    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");

        try (Scanner input = new Scanner(file);) {

            while (input.hasNext()) {
                String firstName = input.next();
                String mi = input.next();
                String lastName = input.next();
                int score = input.nextInt();
                System.out.println(
                        firstName + " " + mi + ". " + lastName + " " + score);
            }
        }
    }
}
