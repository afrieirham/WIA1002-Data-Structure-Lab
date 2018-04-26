/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg1;

import java.util.Arrays;

/**
 *
 * @author itsaf
 */
public class MyQueue<E> {
    
    private java.util.LinkedList list = new java.util.LinkedList<>();
    
    public MyQueue(E[] e){
        for(int i=0; i<e.length; i++){
            list.add(e);
        }
    }
    
    public MyQueue(){
        
    }
    
    public void enqueue(E e){
        list.addLast(e);
    }
    
    public E dequeue(){
        return (E) list.removeFirst();
    }
    
    public E getElement(int i){
        return (E) list.get(i);
    }
    
    public E peek(){
        return (E) list.peek();
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean contains(E e){
        return list.contains(e);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
    
}
