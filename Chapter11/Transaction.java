/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

/**
 *
 * @author Java
 */
public class Transaction {
    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    //constructors
    public Transaction(char type, double amount, double balance,
            String description) {
        date = new java.util.Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    //getters
    public java.util.Date getDate() {
        return date;
    }
    public char type() {
        return type;
    }
    public double amount() {
        return amount;
    }
    public String description() {
        return description;
    }
    
    @Override
    public String toString() {
        return String.format("%4d/%02d/%02d  %02d:%02d:%02d    %c  %6.2f" + 
                "  %6.2f  %12s", (date.getYear()+1900), date.getMonth(), date.getDay(),
                date.getHours(), date.getMinutes(), date.getSeconds(), type,
                amount, balance, description);
    }

    
}
