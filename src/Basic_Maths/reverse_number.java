/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic_Maths;

/**
 *
 * @author windows
 */
public class reverse_number {
    
     public static int r_no(int n){
          boolean negative=false;
    if(n<0){
         negative=true;
    n=Math.abs(n);
    }
    int reversed=0;
  while(n!=0){
  int digit = n%10; // helps to find last digit
  reversed= reversed*10+digit; // helps to append last digit 
  n=n/10; //removes the last digit from the real number example 1234 after this code 123 will be the number
  }

         
   return negative?-reversed: reversed;
       
    } 
    public static void main(String[] args) {
       int n =1234;
    int result= r_no(n);
        System.out.println(result);
      
    }
    
}
