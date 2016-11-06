/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author Java
 */
public class BinaryFormatException extends Exception {
    String number;
    public BinaryFormatException (String number) {
        super("Invalid binary number: " + number);
        this.number = number;
    }
    
    public String getInput() {
        return number;
    }
    
}
