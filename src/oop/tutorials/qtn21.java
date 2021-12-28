/**
 * Take three numbers from the user and print the greatest number
 */
package oop.tutorials;

import java.util.Scanner;

/**
 *
 * @author Muleya
 */
public class qtn21 {

    public static void main(String args[]) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int n[]=new int[3];
       for(int i=0;i<3;i++){
              n[i]= s.nextInt();
          
       }
       /*This line uses builtin in methods from Integer class ................. you can define your own method to perform this task*/
       System.out.println("The largest is "+ (Integer.max(Integer.max(n[0], n[1]),Integer.max(n[2], n[1]))));
    }
}
