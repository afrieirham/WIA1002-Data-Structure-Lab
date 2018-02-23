/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

import java.util.Scanner;

/**
 *
 * @author Afrie Irham
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter value for x^y: ");
        Scanner input = new Scanner(System.in);
        
        System.out.print("X = ");
        int x = input.nextInt();
        
        System.out.print("Y = ");
        int y = input.nextInt();
        
        System.out.println("Answer = " + exponent(x,y));
    }
    
    public static long exponent(int x, int y){
        
        if(y == 0){
            return 1;
        }
        else{
            return x * exponent(x, y-1);
        }
        
    }
    
}
