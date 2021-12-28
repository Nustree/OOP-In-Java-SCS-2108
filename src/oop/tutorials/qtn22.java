/**
 * Write a Java program that reads a floating-point number and prints
”zero” if the number is zero.
Otherwise, print ”positive” or ”negative”. Add ”small” if the absolute value of
the number is less than
1, or ”large” if it exceeds 1,000,000.
 */
package oop.tutorials;

import java.util.Scanner;

/**
 *
 * @author Muleya
 */
public class qtn22 {

    public static void main(String args[]) {
       System.out.println("Enter a number");
       float a=new Scanner(System.in).nextInt();
       System.out.println((a==0 ? "Zero": a>0? "Positive":"Negative") + (Math.abs(a)<1? " Small":Math.abs(a)>1000000? " Large":""));
       
       /*Problem solved*/
    }
}
