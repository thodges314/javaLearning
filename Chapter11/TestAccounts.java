/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;
import Chapter09.Account;
import java.util.Scanner;

/**
 *
 * @author Java
 */
public class TestAccounts {
    
    public static void main(String[] args) {
        Account account = new Account(13, 100);
        CheckingAccount accountC = new CheckingAccount(42, 100);
        SavingsAccount accountS = new SavingsAccount(69, 100);
        account.setAnnualInterest(1);
        accountC.setAnnualInterest(3);
        accountS.setAnnualInterest(5);
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("1) " + account.toString());
            System.out.println("2) " + accountC.toString());
            System.out.println("3) " + accountS.toString());
            System.out.print("\nPlease select one: ");
            int select = input.nextInt();
            System.out.print("Withdraw amount: ");
            double withdrawAmount = input.nextDouble();
            switch(select) {
                case 1: account.withdraw(withdrawAmount);
                        break;
                case 2: accountC.withdraw(withdrawAmount);
                        break;
                case 3: accountS.withdraw(withdrawAmount);
                        break;
                default: System.out.println("INVALID SELECTION!!");
            }
            
        } while(true);
        
    }
}
