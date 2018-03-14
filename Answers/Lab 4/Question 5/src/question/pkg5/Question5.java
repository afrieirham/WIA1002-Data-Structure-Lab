/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg5;

/**
 *
 * @author Afrie Irham
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        String[] strArray = {"red", "green", "blue"};
        
        FindMax a= new FindMax();
        
        System.out.println(FindMax.max(intArray));
        System.out.println(FindMax.max(strArray));
        
        Circle circle1 = new Circle(3.0);
        Circle circle2 = new Circle(2.9);
        Circle circle3 = new Circle(5.9);
        
        Object[] douArray = {circle1, circle2, circle3};
        
        
    }

}
