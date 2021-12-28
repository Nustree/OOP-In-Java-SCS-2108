/*
 * Write a Java program to print the sum (addition), multiply, subtract,
divide and remainder of two numbers prime numbers. The user should
input the prime numbers.
 */
package oop.tutorials;

import java.util.Scanner;

/**
 *
 * @author Muleya
 */
public class qtn6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] twoNums = new int[2];
        System.out.println("Input Two prime numbers: ...");
        int i = 0;
        while (i < 2) {
            int in = s.nextInt();
            if(qtn2.isPrime(in)){
                 twoNums[i]=in;
                 i++;
            }else{
                System.out.println("Value is not a prime number, try again ");
            }
        }
        System.out.printf("The %s of %d and %d is %d\n","Sum",twoNums[0],twoNums[1],add(twoNums[0],twoNums[1]));
        System.out.printf("The %s of %d and %d is %d\n","Subtraction",twoNums[0],twoNums[1],subtract(twoNums[0],twoNums[1]));
        System.out.printf("The %s of %d and %d is %d\n","Multiplication",twoNums[0],twoNums[1],product(twoNums[0],twoNums[1]));
        System.out.printf("The %s of %d and %d is %d\n","Remainder",twoNums[0],twoNums[1],remainder(twoNums[0],twoNums[1]));
        System.out.printf("The %s of %d and %d is %d\n","Division",twoNums[0],twoNums[1],divide(twoNums[0],twoNums[1]));
    }
    
    static int product(int a,int b){
        return a*b;
    }
     static int add(int a,int b){
        return a+b;
    } static int subtract(int a,int b){
        return a-b;
    } static int divide(int a,int b){
        return a/b;
    } 
    static int remainder(int a,int b){
        return a%b;
    }
    
}
