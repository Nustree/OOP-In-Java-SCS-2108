/*
 Write a Java program that takes three numbers as input to calculate
and print the average of the numbers.
 */
package oop.tutorials;

import java.util.Scanner;

/**
 *
 * @author Muleya
 */
public class qtn9 {
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many number do u want to find their average:");
        int n=s.nextInt();
        int nums[]=new int[n];
       
       System.out.printf("Enter %d number: ",n);
       
       for(int i=0; i<n;i++){
           nums[i]=s.nextInt();
       }
        System.out.println("Average of given numbers is " + average(nums));
    }
    
    static int average(int arr[]){
        int av=0;
        for(int i: arr){
            av+=i;
        }
        return av/arr.length;
    }
}
