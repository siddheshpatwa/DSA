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
public class pattern_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("please enter number");
        int n = sc.nextInt();
        int number=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
