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
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Account1 person1 = new Account1("Afrie",1122, 20000);
        
        person1.setAnnualInterestrate(4.5);
        
        person1.withdraw(2500);
        person1.deposit(3000);
        
        System.out.println(person1.name);
        System.out.println("Balance: RM" + person1.getBalance());
        System.out.println("Monthly Interest: RM" + person1.getMonthlyInterest());
        System.out.println("Date: " + person1.getDateCreated());
    }
    
}