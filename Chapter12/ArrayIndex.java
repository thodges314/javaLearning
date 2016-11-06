/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Java
 */
public class ArrayIndex {
    static int randArray[];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How big of an array? ");
        int size = 100;
        try {
            size = input.nextInt();
        }
        catch (InputMismatchException ex) {
            size = 100;
            System.out.println("\nOnly numbers are permitted as array sizes.");
            System.out.println("Array size 100 will be created.");
            input.next();
        }
        
        try {
            makeArray(size);
            System.out.println("\nArray of size " + size + " created.");
        }
        catch (NegativeArraySizeException ex) {
            makeArray(100);
            System.out.println(size + " is an invalid size.");
            System.out.println("Array of size 100 created.");
            size = 100;
        }
        while (true) {
            System.out.print("Array index: ");
            try {
                int index = input.nextInt();
                System.out.println(randArray[index]);
            }
            catch (InputMismatchException ex) {
                System.out.println(input.next() + " is not a valid index.");
                System.out.println("Possible indecies are 0 to " + (size-1) +
                        ".");
                //input.next();
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Index out of bounds.");
                System.out.println("Possible indecies are 0 to " + (size-1) +
                        ".");
            }

        }
    }
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    public static void makeArray(int size) {
        randArray = new int[size];
        for(int i = 0; i < size; i++)
            randArray[i] = randInt(1, 10_000);
    }
    
}
