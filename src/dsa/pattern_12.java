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
public class pattern_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("please enter number. ");
        int n = sc.nextInt();
        for (int i = 0; i <=n; i++) {
            for (int z = 1; z < i+1; z++) {
                System.out.print(z);
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
             for (int j = i; j >0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
