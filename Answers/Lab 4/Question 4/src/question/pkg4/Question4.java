/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg4;

/**
 *
 * @author Afrie Irham
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
            
        minmax(intArray);
        minmax(strArray);

    }

    public static <T extends Comparable<T>> void minmax(T[] list){
        T max = list[0];
        T min = list[0];
        for(int i=0; i<list.length; i++){
          if(list[i].compareTo(max) > 0){
              max = list[i];
          }
          if(list[i].compareTo(min) < 0){
              min = list[i];
          }
        }
        System.out.print("Min = " + min + " | Max = " + max);
        System.out.println("");
    }

    public static <T> void printArray(T[] list){
        for(T i: list){
            System.out.println(i);
        }
    }

}
