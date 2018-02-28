/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg1;

import java.util.Scanner;

/**
 *
 * @author Afrie Irham
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of basket(s): ");
        int basket = input.nextInt();
        System.out.print("Enter the number of item(s): ");
        int item = input.nextInt();
        System.out.println(f(basket,item));
    }

    public static int f(int b, int i){
      if(b==1 || i==1){
        return b;
      }
      else{
        return f(b-1, i) + f(b, i-1);
      }
    }

}
