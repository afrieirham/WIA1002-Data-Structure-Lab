/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

/**
 *
 * @author course009
 */
public class Account1 extends Account{
    String name;
    
    
    public Account1(String name, int id, double balance){
        this.name = name;
        super.setID(id);
        super.setBalance(balance);
        
    }
    
    /**
     *
     * @param withdrawAmount
     */
    @Override
    public void withdraw(double withdrawAmount){
        super.setBalance(super.getBalance() - withdrawAmount);
        Transaction trans = new Transaction('W', withdrawAmount, super.getBalance(), "Withdrawal");
    }
    
    /**
     *
     * @param depositAmount
     */
    @Override
    public void deposit(double depositAmount){
        super.setBalance(super.getBalance() + depositAmount);
        Transaction trans = new Transaction('D', depositAmount, super.getBalance(), "Deposital");
    }
}