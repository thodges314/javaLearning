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
public class TestNewAccounts {
    public static void main(String[] args){
        NewAccounts account = new NewAccounts("George", 1122, 1000.0);
        account.deposit(30.0);
        account.deposit(40.0);
        account.deposit(50.0);
        account.withdraw(5.0);
        account.withdraw(4.0);
        account.withdraw(2.0);
        account.printAccount();
    }
    
    
}
