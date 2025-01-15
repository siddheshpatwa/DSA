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
public class pattern_10 {
      
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number. ");
       int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < n; i++) {
         
            for (int j = 0; j <n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
