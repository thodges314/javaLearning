/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter07;

/**
 *
 * @author Java
 */
public class Calculator {
    public static void main(String[] args) {
        //check number of strings passed
        if(args.length != 3) {
            System.out.println("Usage: Calculator operand1 operator operand2");
            System.exit(0);
        }
        
        int result = 0;
        
        switch(args[1].charAt(0)) {
            case '+' :  result = Integer.parseInt(args[0]) +
                    Integer.parseInt(args[2]);
                break;
            case '-' :  result = Integer.parseInt(args[0]) -
                    Integer.parseInt(args[2]);
                break;
            case '*' :  result = Integer.parseInt(args[0]) *
                    Integer.parseInt(args[2]);
                break;
            case '/' :  result = Integer.parseInt(args[0]) /
                    Integer.parseInt(args[2]);
                
        }
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " +
                result);
    }
    
}
