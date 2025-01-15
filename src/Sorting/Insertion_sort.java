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
public class Insertion_sort {
    public static void Insertion(int arr[],int n ){
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int arr[]={4,3,5,6,8,9,7,2,1};
        int n = arr.length;
        Insertion(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
