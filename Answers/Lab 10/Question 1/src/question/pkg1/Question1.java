/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg1;

/**
 *
 * @author itsaf
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] array = {"Durian", "Blueberry"};
        MyQueue fruitQ = new MyQueue(array);
        
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        
        System.out.println("Queue: " + fruitQ.toString());
        System.out.println("Top item: " + fruitQ.peek());
        System.out.println("Queue size: " + fruitQ.getSize());
        
        fruitQ.dequeue();
        System.out.println("Item at position 2: " + fruitQ.getElement(2));
        System.out.println("Any Cherry? " + fruitQ.contains("Cherry"));
        System.out.println("Any Durian? " + fruitQ.contains("Durian"));
        
    }
    
}
