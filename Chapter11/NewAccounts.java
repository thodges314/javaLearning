/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;
import Chapter09.Account;
import java.util.ArrayList;

/**
 *
 * @author Java
 */
public class NewAccounts extends Account{
    private String name;
    private ArrayList transactions;
    
    //constructor
    NewAccounts(String name, int newId, double newBalance) {
        setId(newId);
        setBalance(newBalance);
        this.name = name;
        transactions = new ArrayList<>();
    }
    
    //getters
    public String getName() {
        return name;
    }
    
    //transactions
    @Override
    public void withdraw(double withdrawAmount){
        super.withdraw(withdrawAmount);
        transactions.add(new Transaction('W', withdrawAmount, getBalance(),
                "shopping"));
    }
    
    @Override
    public void deposit(double depositAmount){
        super.deposit(depositAmount);
        transactions.add(new Transaction('D', depositAmount, getBalance(),
                "saving"));
    }
    
    public void printAccount() {
        System.out.println(toString());
        System.out.println();
        for(int i = 0; i < transactions.size(); i++)
            System.out.println((transactions.get(i)).toString());
        
    }
}
