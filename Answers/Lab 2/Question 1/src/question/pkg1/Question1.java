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
        
        System.out.print("Write a word: ");
        
        Scanner input = new Scanner(System.in);
        String strng = input.next();
       
        System.out.println(subtituteAI(strng));
        
    }
    
    public static String subtituteAI(String str){
        if(str.length() == 0)
            return str;
        else if(str.charAt(0) == 'a')
            return "i" + subtituteAI(str.substring(1));
        else
            return str.charAt(0) + subtituteAI(str.substring(1));
            
    }
    
}
