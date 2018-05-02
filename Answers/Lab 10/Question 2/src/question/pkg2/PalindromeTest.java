/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg2;

import java.util.LinkedList;

/**
 *
 * @author itsaf
 */
public class PalindromeTest<E> {
    
    LinkedList list = new LinkedList<>();
    LinkedList clone = new LinkedList<>();
    LinkedList temp = new LinkedList<>();
    
    PalindromeTest(E[] e){
        for (E e1 : e) {
            enqueue(e1);
        }
        
        temp = (LinkedList) list.clone();
        clone.clear();
        
        for(int i=0; i<list.size(); i++){
            clone.push(temp.pop());
        }
        
        if(clone.equals(list)){
            System.out.println(clone + " is Palindrome");
        }
        else{
            System.out.println(clone + " is not Palindrome");
        }
    }
    
    private void enqueue(E e){
        list.addLast(e);
    }
    
    private E dequeue(){
        return (E) list.removeFirst();
    }
    
    
}
