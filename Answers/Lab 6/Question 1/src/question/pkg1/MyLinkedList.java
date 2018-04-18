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
public class MyLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size = 0;
    
    MyLinkedList(){
        head = null;
        tail = null;
    }
    
    public <E> void addFirst(E e){
        
        Node<E> newHead = new Node(e);
        newHead.next = head;
        head = (Node<E>) newHead;
        size++; 
    }
    
    public <E> void addLast(E e){
        
        tail = head;
        if(size == 0){
            head = new Node(e);
            size++;
            return;
        }
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = new Node(e);
        tail = tail.next;
        
        size++;
        
    }
    
    public <E> void add(int index, E e){
        
    }
    
}

