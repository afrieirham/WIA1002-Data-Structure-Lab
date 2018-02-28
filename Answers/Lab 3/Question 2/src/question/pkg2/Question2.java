/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg2;

import java.util.Scanner;

/**
 *
 * @author Afrie Irham
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      System.out.print("(x + y)^" + n + " = ");
      int i=0;
      int pn = n;
      do{
        System.out.print(binomial(n,i) + "(x^" + pn + " y^" + i + ")");
        i++;
        pn--;
        if(pn >= 0){
            System.out.print(" + ");
        }
      }while(i<=n);

    }

    public static int binomial(int n, int k){
      if(k==0 || k==n){
        return 1;
      }
      else{
        return binomial(n-1,k-1) + binomial(n-1, k);
      }
    }

}
