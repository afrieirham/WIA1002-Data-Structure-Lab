/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg1;

/**
 *
 * @author Afrie Irham
 */
public class Node<E> {
    public E element;
    public Node<E> next = null;
    
//    public Node(){
//        
//    }
    
    public Node(E element, Node next){
        this.element = element;
        this.next = next;
    }
    
    public <E> E getData(){
        return (E) element;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setData(E element){
        this.element = element;
    }
    
    public void setNext(Node n){
        next = n;
    }
}
