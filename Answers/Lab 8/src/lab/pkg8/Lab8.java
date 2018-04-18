/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8;

import java.util.Arrays;

/**
 *
 * @author Afrie Irham
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {45, 7, 2, 8, 19, 3};
        int[] array = {10, 34, 2, 56, 7, 67, 88, 42};
//        System.out.println("Question 1, Question 2, Question 3");
//        System.out.println("Unsorted Array: " + Arrays.toString(arr));
//        selectionSortSmallest(arr);
//        selectionSortLargest(arr);
//        System.out.println("");
//        System.out.println("Question 4 - Insertion Sort");
//        insertionSortLargest(array);
        
//        System.out.println("");
//        System.out.println("Test Bubble Sort");
//        bubbleSort(arr);
//        binarySearch(20, arr);

        System.out.println("Test Selection Sort");
        selectionSort(arr);
        selectionSort(array);
        
    }
    
    public static void insertionSortLargest(int[] array){
        int n = array.length;
        for(int i=1; i<n; i++){
            int key = array[i];
            int j = i-1;
            
            while(j>=0 && array[j] > key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
        
        System.out.println(Arrays.toString(array));
    }
    
    public static void selectionSort(int[] arr){
        
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
        
    }
    
    public static void bubbleSort(int[] arr){
        
        for(int i= arr.length - 1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
    
    public static void binarySearch(int value, int[] arr){
        int lowIndex = 0;
        int highIndex = arr.length - 1;
        
        int midIndex = (lowIndex + highIndex) / 2;
        
        while(lowIndex < highIndex){
            if(value>arr[midIndex]){
                lowIndex = midIndex + 1;
                midIndex = (lowIndex + highIndex) / 2;
            }
            else if(value<arr[midIndex]){
                highIndex = midIndex - 1;
                midIndex = (lowIndex + highIndex) / 2;
            }
            else{
                System.out.println(value + " found at index " + midIndex);
                break;
            }
        }
        System.out.println(value + " are not in the array.");
    }
    
//    public static void selectionSortSmallest(int[] arr){
//        
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<=i-j; j++){
//                if(arr[i] < arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                    
//                }
//            }
//        }
//        System.out.print("Ascending order: ");
//        System.out.println(Arrays.toString(arr));
//        
//    }
//    
//    public static void selectionSortLargest(int[] arr){
//        
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<=i; j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                    
//                }
//            }
//        }
//        System.out.print("Descending order: ");
//        System.out.println(Arrays.toString(arr));
//        
//    }
    
    
    
}
