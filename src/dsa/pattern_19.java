package dsa;

import java.util.Scanner;

public class pattern_19 {
    Scanner sc = new Scanner(System.in);
        System.out.println("please enter number.");
        int n = sc.nextInt();
        
        // Top part of the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
        // Bottom part of the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (n - i) - 3; j++) {
                System.out.print("$");
            }
            if (i != n - 1) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }}
}