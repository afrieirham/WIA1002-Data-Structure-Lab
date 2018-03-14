/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg1;

/**
 *
 * @author Afrie Irham
 * @param <E>
 */
public class StorePairGeneric<E> implements Comparable{

    private E first, second;
        
    public StorePairGeneric(E first, E second){
        this.first = first;
        this.second = second;
    }

    public E getFirst(){
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void setPair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }

    public boolean equals(StorePairGeneric object){
        return (this.first == object.first );
    }

    public int compareTo(StorePairGeneric object) {
        if(this.first == object.first){
            System.out.println(first);
            return 1;
        }
        else{
            return 0;
        }
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
}
