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
public class BUbble_sort {
    public static void bubble (int arr[],int n){
        for (int i = 0; i<n-1; i++) {
            for (int j = 0; j<n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int n = arr.length;
        bubble(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+",");
        }
    }
    
}
//Worst Case: 𝑂(𝑛2)O(n 2) (nested loops iterate over the entire array)
//Best Case (Already Sorted): 𝑂(𝑛) O(n) (if no swaps are made, you can optimize with a flag).