/**
 * Write a Java program to reverse a string.
 */
package oop.tutorials;

import java.util.Scanner;

/**
 *
 * @author Muleya
 */
public class qtn13 {

    public static void main(String args[]) {
         
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        
        String n=s.nextLine();
        
        System.out.printf("Reversed String  of %s is %s.",n, reverseString(n));
    }
    
    
    static String reverseString(String s){
        String rv="";
        char data[]=s.toCharArray();
        for(int i=0; i<data.length; i++){
            rv+=data[(data.length-1)-i];
        }
        return rv;
    }
}
