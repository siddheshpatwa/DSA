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
public class pattern_15 {
      public static void main(String[] args) {
        int alphabet=65;  // ascii = 65 A
     Scanner sc= new Scanner(System.in);
             System.out.println("please enter number");
        int n=sc.nextInt();
          for (int i = 0; i < n; i++) {
              for (int j = 0; j < n-i; j++) {
                  System.out.print((char)(alphabet+j));// this is the process of conversion 
              }
              System.out.println();
        }
      
    }
}
