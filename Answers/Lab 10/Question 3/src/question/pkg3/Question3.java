/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

import java.util.Scanner;

/**
 *
 * @author itsaf
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyQueue list = new MyQueue();
        
        String transaction;
        int shares;
        int price;
        boolean status = true;
        
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            
            System.out.print("Buy or Sell: ");
            transaction = input.next();
            
            System.out.print("Shares: ");
            shares = input.nextInt();
            
            System.out.print("Price: ");
            price = input.nextInt();
            
            if(transaction.equals("Buy")){
                System.out.println("");
                System.out.println("Buying...");
                list.buy(shares, price);
                list.display();
                System.out.println("");
                
            }
            else if(transaction.equals("Sell")){
                System.out.println("");
                System.out.println("Selling...");
                status = list.sell(shares, price);
                list.display();
                System.out.println("");
            }
            
        }while(status == true);
        
    }
    
}
