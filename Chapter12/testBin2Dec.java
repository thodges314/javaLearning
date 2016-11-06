/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

import java.util.Scanner;
import Chapter12.bin2Dec;

/**
 *
 * @author Java
 */
public class testBin2Dec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number in binary: ");
            String binString = input.next();
            try {
                System.out.println("In dec that is "
                        + new bin2Dec(binString).inDec());
            } catch (BinaryFormatException ex) {
                System.out.println(ex.getInput() +
                        " is not a valid binary number.");
            }
        }

    }

}
