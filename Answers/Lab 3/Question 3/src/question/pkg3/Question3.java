/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

import static java.lang.Math.pow;
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
        
        System.out.println("Question 3:(a) = 2^n - 1");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of disc: ");
        int discNumber = input.nextInt();

        
        System.out.println("Minimum step is: "  + stepCount(discNumber));
    }

    public static int stepCount(int discNumber){
      if(discNumber == 1 ){
        return 1;
      }
      else {
          return (int) pow(2,discNumber - 1)  + stepCount(discNumber - 1);
      }
    }


}
