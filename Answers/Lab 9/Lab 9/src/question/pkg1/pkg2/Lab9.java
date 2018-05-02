/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg1.pkg2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author itsaf
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Question1b();
//        System.out.println("");
//        Question1c();
//        System.out.println("");
//        Question2();
//        System.out.println("");
//        Question3();
        System.out.println("");
        
        
    }
    
    public static void Question1b(){
        MyStack<Character> stack1 = new MyStack<>();
        System.out.println("Question 1(b)");
        stack1.push('a');
        stack1.push('b');
        stack1.push('c');
        
        System.out.println(stack1.toString());
        System.out.println("Contain b? " + stack1.search('b'));
        System.out.println("Contain k? " + stack1.search('k'));
    }
    
    public static void Question1c(){
        MyStack<Integer> stack2 = new MyStack<>();
        System.out.println("Question 1(c)");
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        
        System.out.println(stack2.toString());
        System.out.println("Contain 6? " + stack2.search(6));
    }
    
    public static void Question2(){
        
        MyStack<Integer> stack = new MyStack<>();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int number = input.nextInt();
        
        stack.push(number);
        System.out.println(stack.toString());
        
        while(stack.isEmpty() == false){
            System.out.println(stack.pop());
        }
        
    }
    
    public static void Question3(){
        
        MyStack<Integer> stack = new MyStack<>();
        Random input = new Random();
        int total = 0;
        
        for(int i=0; i<5; i++){
            stack.push(input.nextInt(10) + 1);
        }
        
        System.out.println(stack.toString());
        
        for(int i=0; i<5; i++){
            total += stack.pop();
        }
        
        System.out.println("Total: " + total);
    }
    
    public static void Question5(){
        
        MyStack<Integer> tower1 = new MyStack<>();
        MyStack<Integer> tower2 = new MyStack<>();
        MyStack<Integer> tower3 = new MyStack<>();
        
        for(int i=3; i>=0; i--){
            tower1.push(i);
        }
        
        
        
    }
    
}
