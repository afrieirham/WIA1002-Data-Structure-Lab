/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Afrie
 */
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account(){

    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getID(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestrate(){
        return annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestrate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate/100;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double withdrawAmount){
        balance -= withdrawAmount;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
    }



}
