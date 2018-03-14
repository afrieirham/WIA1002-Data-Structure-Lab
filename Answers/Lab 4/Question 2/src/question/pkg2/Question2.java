/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg2;

/**
 *
 * @author Afrie Irham
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<String>();
        MyGeneric<Integer> intObj = new MyGeneric<Integer>();
        
        strObj.setE("Afrie");
        intObj.setE(20);
        
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
    
}
