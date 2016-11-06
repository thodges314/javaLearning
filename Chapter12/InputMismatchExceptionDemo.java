/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;
import java.util.*;

/**
 *
 * @author Java
 */
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        
        do {
            try {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();   //InputMistmatchException can be
                                                //here
                
                System.out.println("The number entered is " + number);
                
                continueInput = false;
            }
            catch(InputMismatchException ex) {
                System.out.println("Try again.  An integer is required.");
                input.nextLine();   // discrard input
            }
        } while(continueInput);
    }
    
}
