/*
 * Write a Java program that takes three numbers as input and display the product
of two numbers.
 */
package oop.tutorials;

import java.util.*;

/*
 I failed to understand this question. Consider to update if not correct
*/


/**
 *
 * @author Muleya
 */
public class qtn5 {
    
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int []threeNums=new int[3];
        System.out.println("Input three numbers: ...");
        for(int i=0; i<3;i++){
            threeNums[i]=s.nextInt();
        }
        
        System.out.printf("Product of %d and %d is: %d",threeNums[0],threeNums[1],(int)(threeNums[0]*threeNums[1]));
        
    }
    
}
