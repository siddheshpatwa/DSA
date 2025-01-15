/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

/**
 *
 * @author windows
 */
public class Binary_search {
    public static int binary(int arr[],int target){
    int start=0;
    int end = arr.length-1;
    
    while(start<=end){
        int mid= start+(end-start)/2;
        if(target<arr[mid]){
        end=mid-1;
        }
        else if(target>arr[mid]){
        start=mid+1;
    }
        else{     
            return  mid;}
    }
       return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,89};
        int target=7;
        int result=binary(arr, target);
        if(result>0){
        System.out.println(result+" is on this index");}
        else {
            System.out.println("target is not there");
        }
    }
}
//best case o(1)
// worst case o(log n)
//Average case: O(log n) 
//Space Complexity: O(1)