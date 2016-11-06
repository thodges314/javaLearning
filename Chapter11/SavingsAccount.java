/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

import Chapter09.Account;

/**
 *
 * @author Java
 */
public class SavingsAccount extends Account{
    double overdraftLimit = 0;
    
    //constructors
    public SavingsAccount() {
        super();
    }
    public SavingsAccount( int newId, double newBalance) {
        super(newId, newBalance);
    }
    
    //overwritten method
    @Override
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount - getBalance() > overdraftLimit) {
            System.out.println("OVER LIMIT!!!\nTRANSACTION CANCELLED!!" +
                    "\nYOU SHALL NOW DIE");
        } else {
            setBalance(getBalance() - withdrawAmount);
        }
    }
    @Override
    public String toString() {
        return ("Savings account number " + getId() + " has a balance of $" +
                getBalance() + " and pays an interest rate of " +
                getAnnualInterest() + ".");
    }    
}
