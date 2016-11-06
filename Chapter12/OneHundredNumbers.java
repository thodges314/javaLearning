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
public class OneHundredNumbers {


    public static void main(String[] args) {
        makeNumberFile();
        int[] numbers = readNumberFile();
        Arrays.sort(numbers);
        printNumbers(numbers);
    }

    public static void makeNumberFile() {
        File numbers = new File("Exercise12_15.txt");
        if(numbers.exists())
            numbers.delete();
        Random rand = new Random();
        try (PrintWriter outFile = new PrintWriter(numbers)) {
            for (int i = 1; i <= 100; i++) {
                outFile.println(rand.nextInt());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }

    }

    public static int[] readNumberFile() {
        File inFile = new File("Exercise12_15.txt");
        int[] numbers = new int[100];
        try (Scanner readFile = new Scanner(inFile)) {
            int i = 0;
            while (readFile.hasNext()) {
                numbers[i++] = readFile.nextInt();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        return numbers;
    }

    public static void printNumbers(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
