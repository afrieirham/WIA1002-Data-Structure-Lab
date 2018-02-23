/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author course009
 */
public class Transaction{
    java.util.Date date;
    char type;
    double amount;
    double balance;
    String description;
    ArrayList transaction = new ArrayList();
    
    
    public Transaction(char type, double amount, double balance, String description){      
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;    
    }
}