/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg1.pkg2;

import java.util.ArrayList;

/**
 *
 * @author itsaf
 * @param <E>
 */
public class MyStack<E> {
    
    ArrayList<E> list = new ArrayList<>();
    
    public void push(E o){
        list.add(o);
    }
    
    public E pop(){
        E value = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        
        return value;
    }
    
    public E peek(){
        return list.get(list.size() - 1);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
    
    public boolean search(E o){
        return list.contains(o);
    }
    
}
