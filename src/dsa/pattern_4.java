/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.Scanner;

/**
 *
 * @author windows
 */
public class pattern_4 {
    Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
       System.out.println(" please enter a number. ");
      int n = sc.nextInt();
   
   for (int i=1;i<=n; i++ ){
     for(int j=1;j<=i; j++ ){
         System.out.print(i);
     }
     System.out.println();
   } 
  } 
}
/*
1
22
333
4444
55555
*/