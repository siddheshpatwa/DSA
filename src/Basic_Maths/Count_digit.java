/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic_Maths;

import java.util.Scanner;

/**
 *
 * @author windows
 */
public class Count_digit {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("please enter the number");
        int n =sc.nextInt();
        int count=0;
        
        while(n>0){
    
    int number;
    n/=10;
    count++;
       
        }
         System.out.println( "The number of digits are "+count);
            
    }
}
