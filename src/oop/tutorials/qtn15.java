/**
 * Write a Java program to create and display unique three-digit number using
 * 1, 2, 3, 4. Also count how many three-digit numbers are there.
 */
package oop.tutorials;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

/**
 *This program will create three digit numbers using 1,2,3,4 for example 213 is a three digit number containing 1,2,3 and 4.
 * @author Muleya
 */
public class qtn15 {

    public static void main(String args[]) {
        TreeSet s=getNums();
        System.out.println("The three digit numbers formed by 1,2,3,4 are: \n" + s.toString());
        System.out.println("The total is : "+s.size());
    }

    static TreeSet getNums() {
        Set s = new TreeSet<>();
        for (int i = 100; i < 1000; i++) {
            String n = String.valueOf(i);
            if (Pattern.matches("[1-4]*", n)) {
                s.add(n);
            }
        }
        return (TreeSet) s;
    }

}
