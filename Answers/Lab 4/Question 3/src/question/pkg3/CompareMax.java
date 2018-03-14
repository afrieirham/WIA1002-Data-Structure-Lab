/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Afrie Irham
 */
public class CompareMax<T> {
    private T a, b, c;
    
    public <T> CompareMax(){
        
    }
    
    public static <T extends Comparable<T>> T maximum(T a, T b, T c){
        T max = a;
        
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        
        return max;
    }
    
}
