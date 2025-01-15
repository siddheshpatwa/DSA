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
public class pattern_6 {
     Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
       System.out.println(" please enter a number. ");
      int n = sc.nextInt();
   
   for (int i=0;i<=n; i++ ){
     for(int j=1;j<=n-i; j++ ){
         System.out.print(j);
     }
     System.out.println();
   } 
  }
}
/*
12345
1234
123
12
1
*/