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
public class pattern_3 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" please enter a number. ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
/*
1
12
123
1234
12345
*/