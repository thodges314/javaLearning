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
public class TestMaxIntException {
    public static void main(String[] args) {
        try {
            int value = 30;
            if (value < 40)
            throw new Exception("value is too small");
        }
            catch (Exception ex) {
            System.out.println(ex.getMessage());    //displays the message in
        }                                           //exception object
        System.out.println("Continue after the catch block");
        
        //new thing
        System.out.println("----NEW THING----");
        for(int i=0; i<2; i++) {
            System.out.print(i + " ");
            try {
                System.out.println(1/0);
            }
            catch(Exception ex) {
                
            }
        }
        
        System.out.println("\n----NEW THING----");
            try{
                for(int i=0; i<2; i++) {
                    System.out.print(i + " ");
                    System.out.println(1/0);
                }
            }
        catch(Exception ex) {}
    }
    
}
