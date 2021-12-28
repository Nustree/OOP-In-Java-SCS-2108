/*Write a Java program to print the area and perimeter of a circle
 */
package oop.tutorials;

import java.util.Scanner;

/**
 *
 * @author Muleya
 */
public class qtn7 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int radius = s.nextInt();

        double area = (Math.PI * (Math.pow(radius, 2)));
        double perimeter=Math.PI*radius;  //To be corrected
        System.out.println("Area of a circle =" + area);
        System.out.println("Perimeter of a circle =" + perimeter);
    }
}
