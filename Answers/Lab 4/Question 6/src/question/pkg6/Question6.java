/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg6;

/**
 *
 * @author Afrie Irham
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[][] numbers = {{4,5,6},{1,2,3}};
        
        System.out.print("Max = " + MinMaxTwoDArray.max(numbers));
        System.out.println("");
        System.out.print("Min = " + MinMaxTwoDArray.min(numbers));
        System.out.println("");
    }

}
