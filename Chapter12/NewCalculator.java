/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;
import Chapter07.Calculator;

/**
 *
 * @author Java
 */
public class NewCalculator {
    public static void main(String[] args) {
        try{
            Calculator.main(args);
        }
        catch (NumberFormatException ex) {
            System.out.println("please only add numbers");
            
            anIntegerTest(args[0]);
            anIntegerTest(args[2]);
        }       
    }
    
    private static void anIntegerTest(String testIntString) {
        try {
            int i = Integer.parseInt(testIntString);
        }
        catch (NumberFormatException ex1) {
             System.out.println(testIntString + " is not an integer.");
        }
    }
}
