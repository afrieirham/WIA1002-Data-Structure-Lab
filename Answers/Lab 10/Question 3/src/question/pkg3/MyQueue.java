/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

/**
 *
 * @author itsaf
 */
public class MyQueue {
    
    private final java.util.LinkedList shareList = new java.util.LinkedList<>();
    private final java.util.LinkedList priceList = new java.util.LinkedList<>();
    private int totalGain;

    public MyQueue() {
        this.totalGain = 0;
    }
    
    public void buy(int share, int price){
        shareList.add(share);
        priceList.add(price);
    }
    
    public boolean sell(int share, int price){
        
        if(share > (int) shareList.getFirst()){
            int remainShare = share - (int) shareList.getFirst();
            System.out.println("Gain / Loss: " + calculate((int) shareList.getFirst(), (int) priceList.getFirst(), price));
            System.out.println("Total Gain / Loss: " + getTotal());
            shareList.removeFirst();
            priceList.removeFirst();
            
            if(shareList.isEmpty()){
                System.out.println("");
                System.out.println("No shares to Sell");
                System.out.println("Final Capital: " + getTotal());
                return false;
            }
            else
                sell(remainShare, price);
        }
        else{
            int firstShare;
            int newShare;

            firstShare = (int) shareList.getFirst();
            shareList.removeFirst();
            newShare = firstShare - share;

            shareList.addFirst(newShare);

            System.out.println("Gain / Loss: " + calculate(share, (int) priceList.getFirst(), price));
            System.out.println("Total Gain / Loss: " + getTotal());
        }
        
        return true;
    }
    
    private String getShare(){
        return shareList.toString();
    }
    
    private String getPrice(){
        return priceList.toString();
    }
    
    public void display(){
        System.out.println("Queue for Share: " + shareList.toString());
        System.out.println("Queue for Price: "  + priceList.toString());
    }
    
    private int calculate(int newShare, int oldPrice, int newPrice){
        int result = newShare * (newPrice - oldPrice);
        totalGain += result;
        return result;
    }
    
    private int getTotal(){
        return totalGain;
    }
    
    
}
