/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

/**
 *
 * @author Afrie Irham
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CompareMax a = new CompareMax();
        CompareMax b = new CompareMax();
        
        CompareMax.maximum(3, 4, 5);
        
        System.out.println(a.maximum(2.3, 5.2, 4.5));
        System.out.println(a.maximum("Information System", "Software Engineering", "Artificial Intelligence"));
        System.out.println(CompareMax.maximum(55, 54, 99));
        
        
        
    }
    
}
