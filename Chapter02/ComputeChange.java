/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ComputeChange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Get amount of money
        System.out.print("How much money? ");
        float decimalAmount = input.nextFloat();
        
        //convert to integer number of pennies
        int intAmount = (int) (decimalAmount * 100);
        
        //twenties
        int twenties = intAmount / 20_00;
        int moneyRemaining = intAmount % 20_00;
        
        //tens
        int tens = moneyRemaining / 10_00;
        moneyRemaining %= 10_00;
        
        //fives
        int fives = moneyRemaining / 5_00;
        moneyRemaining %= 5_00;
        
        //ones
        int ones = moneyRemaining / 1_00;
        moneyRemaining %= 1_00;
        
        //quarters
        int quarters = moneyRemaining / 25;
        moneyRemaining %= 25;
        
        //dimes
        int dimes = moneyRemaining / 10;
        moneyRemaining %= 10;
        
        //nickles and pennies
        int nickles = moneyRemaining / 5;
        int pennies = moneyRemaining % 5;
        
        //display
        System.out.println(twenties + " twenties");
        System.out.println(tens + " tens");
        System.out.println(fives + " fives");
        System.out.println(ones + " ones");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickles + " nickles");
        System.out.println(pennies + " pennies");
        
        
    }
    
}
