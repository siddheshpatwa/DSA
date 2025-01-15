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
public class Selection_sorting {
  public static void Select(int arr[],int n){
  
      for (int i = 0; i <=n-2; i++) {
          int mini=i;
                  for (int j = i; j <=n-1; j++) {
              if(arr[j]<arr[mini] ){
             mini = j;
              }
          }
                  int temp=arr[mini];
                  arr[mini]=arr[i];
                  arr[i]= temp;
      } 
      
}
    
    public static void main(String[] args) {
       int arr[]= {5,4,3,2,1};
       int n =arr.length;
        Select(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
 
}
//in all cases the time complexity is o(n2)