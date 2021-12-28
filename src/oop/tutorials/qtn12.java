/**
 * Write a Java program to convert a decimal number to binary number.
 */
package oop.tutorials;

import java.util.Scanner;

/**
 *
 * @author Muleya
 */
public class qtn12 {

    public static void main(String args[]) {
       
        
        Scanner s=new Scanner(System.in);
        
       
        
        System.out.println("Enter a number to change to binary: ");
        int a=s.nextInt();
        
        
         /*Method A of converting a decimal to binary. */
         String binary=Integer.toBinaryString(a);
         System.out.println("Using  inbuilt feature: "+binary);
        
         
         /*Method B. To convert a number to binary.. This folllows a procedure  we have learnt at school*/
         binary=binaryForm(a);
         System.out.println("Using  customised feature: "+binary);
        
    }
    
    /*To change number n to base 2*/
    static String binaryForm(int n){
        int cpy=n;
        String binary="";  
        while(cpy!=0){
            int rem=cpy%2;  //store the remainder
            cpy=cpy/2;       
            binary=rem+binary;
        }
        return binary;
    }

}
