/*
 *Write a Java program to print the area and perimeter of a rectangle given the
width and length.
 */
package oop.tutorials;

import java.util.Scanner;

/**
 *
 * @author Muleya
 */
public class qtn8 {
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter width: ");
        int width = s.nextInt(); 
        System.out.println("Enter heith: ");
        int height = s.nextInt();

        double area = width*height;
        double perimeter= Math.pow(width,2)+Math.pow(height,2);
        System.out.println("Area of a rectangle =" + area);
        System.out.println("Perimeter of a rectangle =" + perimeter);
    }
}
