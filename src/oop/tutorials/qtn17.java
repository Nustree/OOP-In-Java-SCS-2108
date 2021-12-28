/**
 * Write a Java program that accepts three integers from the user and return true
if the second number is greater than first number and third number is greater
than second number. If ”abc” is true second number does not need to be
greater than first number.
 */
package oop.tutorials;

import java.util.Scanner;

/**
 *
 * @author Muleya
 */
public class qtn17 {

    public static void main(String args[]) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int n[]=new int[3];
       for(int i=0;i<3;i++){
              n[i]= s.nextInt();
       }
       
       
       System.out.println(check(n));
        
    }
    
    static boolean check(int n[]){
        return n[0]<n[1] && n[2]>n[1];
    }
}
