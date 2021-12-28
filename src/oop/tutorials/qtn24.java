/*
Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.
 */
package oop.tutorials;

import java.util.Scanner;

/**
 *
 * @author Carron Muleya
 */
public class qtn24 {

    public static void main(String[] args) {
        int oNum = 0, pNum = 0, eNum = 0, nNum = 0, zeroNum = 0;  // pNum stores positive numbers, nNum stores negative , oNum store odd numbers and etc
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < 20; i++) {     // Asking for 20 numbers[loop]
            
            System.out.printf("Enter %d number:", (i + 1));
            int in = s.nextInt();
            
            pNum += in > 0 ? 1 : 0;                  //increment if the number is more than zero     
            nNum += in < 0 ? 1 : 0;
            zeroNum += in == 0 ? 1 : 0;
            oNum += in % 2 != 0 ? 1 : 0;
            eNum += in % 2 == 0 ? 1 : 0;

        }
        System.out.println("Positive numbers= "+pNum);
        System.out.println("Negative ="+nNum);
        System.out.println("Odd number=> "+oNum);
        System.out.println("Even numbers =>"+eNum);
        System.out.println("Zero numbers"+zeroNum);
    }

}
