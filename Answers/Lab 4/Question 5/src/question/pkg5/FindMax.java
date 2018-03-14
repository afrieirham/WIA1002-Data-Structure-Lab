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
public class FindMax {

      public static <E extends Comparable <E>> E max(E[] list){

           E max = list[0];

           for(int i=0; i<list.length; i++){
               if(list[i].compareTo(max) > 0){
                   max = list[i];
               }
           }

           return max;
      }

    
}
