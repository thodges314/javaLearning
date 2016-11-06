/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;
import Chapter09.Account;
import java.util.Scanner;

/**
 *
 * @author Java
 */
public class TenAccounts {
    public static void main(String[] args){
        Scanner inScanner = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for(int counter = 0; counter < 10; counter++) {
            accounts[counter] = new Account(counter, 100);
        }
        do {
            System.out.print("Enter an id: ");
            int currentAccount = inScanner.nextInt();
            menuLoop(accounts[currentAccount]);
        } while(true);
    }
    
    private static void menuLoop(Account currentAccount) {
        
        Scanner inScanner = new Scanner(System.in);
        do {
            System.out.println("\nMain Menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            System.out.print("Enter a choice: ");
        
            int selection = inScanner.nextInt();
            switch(selection) {
                case 1: System.out.printf("The balance is %,.2f%n",
                        currentAccount.getBalance());
                        break;
                case 2: System.out.print("Emter an amount to withdaw: ");
                        double remove = inScanner.nextDouble();
                        currentAccount.withdraw(remove);
                        break;
                case 3: System.out.print("Enter an amount to deposit: ");
                        double deposit = inScanner.nextDouble();
                        currentAccount.deposit(deposit);
                        break;
                case 4: return;
                default: System.out.println("INVALID SELECTION!!");
            }
        } while(true);
    }
    
}
