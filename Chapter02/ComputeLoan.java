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
public class ComputeLoan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Get interest rate, number of years, loan amount
        System.out.print("Total annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate/1200;
        
        System.out.print("Enter number of years as a whole number: ");
        int numberOfYears = input.nextInt();
        
        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();
        
        // Compute monthly payment, totalpayment
        double monthlyPayment = (loanAmount * monthlyInterestRate)/
                (1-(1/(Math.pow(1+monthlyInterestRate, numberOfYears*12))));
        
        double totalPayment = monthlyPayment * 12 * numberOfYears;
        
        //display results
        System.out.println("The monthly payment is: " +
                (int)(monthlyPayment * 100)/100.0);
        
        System.out.println("The total payment is: " +
                (int)(totalPayment * 100)/100.0);
    }
}
