/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author windows
 */
public class Quick_sort {
    static int quick(int arr[],int high,int low){
        //choose pivot 
        int pivot =arr[high];
        v
        int i = low-1;//-1
        
        for (int j = low; j <=high-1; j++) {
            if(arr[j]<pivot){
            i++;
                swap(arr, i, j);
            }
                
        }
        // Move pivot after smaller elements and
        // return its position
        swap(arr, i + 1, high);  
        return i + 1;
        
    }
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            
            // pi is the partition return index of pivot
            int pi =quick(arr, low, high);

            // Recursion calls for smaller elements
            // and greater or equals elements
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void swap(int []arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    }
    
    public static void main(String[] args) {
    int arr[]={4,3,1,2,8,7,9,6,5};   
     int n = arr.length;
     int low =0;
     int high=n-1;
        quick(arr, high, low);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
   
    
}
