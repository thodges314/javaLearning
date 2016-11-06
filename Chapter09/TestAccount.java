/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09;



/**
 *
 * @author Java
 */
public class TestAccount {
    public static void main(String[] args) {
        Account testAccount = new Account(1122, 20_000.0);
        testAccount.setAnnualInterest(4.5);
        
        testAccount.withdraw(2500);
        testAccount.deposit(3000);
        
        System.out.printf("Balance: %,.2f%n", testAccount.getBalance());
        System.out.printf("Monthly Interest: %.2f%n",
                testAccount.getMonthlyInterest());
        System.out.printf("Date Created: %s%n%n",
                testAccount.getDateCreated().toString());
    }
}
