/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09;

import java.util.Date;

/**
 *
 * @author Java
 */
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0.015;
    private Date dateCreated;
    
    public Account() {
        dateCreated = new Date();
    }
    
    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }
    
    public int getId() {
        return id;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public double getAnnualInterest() {
        return annualInterestRate;
    }
    
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12);
    }
    
    public double getMonthlyInterest() {
        return (getMonthlyInterestRate() * getBalance() / 12);
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    
    public void setId(int newId){
        id = newId;
    }
    
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
    
    public void setAnnualInterest(double newInterest) {
        annualInterestRate = newInterest;
    }
    
    public void withdraw(double withdrawAmount) {
        balance -= withdrawAmount;
    }
    
    public void deposit(double depositAmount) {
        balance += depositAmount;
    }
    
    @Override
    public String toString() {
        return ("Account number " + id + " has a balance of $" + balance + 
                " and pays an interest rate of " + annualInterestRate + ".");
    }
}
