/**
 * The number, 197, is called a circular prime because all rotations of the digits:
 * 197, 971, and 719, are themselves prime.
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31,
 * 37, 71, 73, 79, and 97. How many circular primes are there below one
 * million?
 */
package oop.tutorials;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Muleya
 */
public class qtn4 {

    public static void main(String args[]) {
        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            if (qtn2.isPrime(i)) {
                /**
                 * Here we check if i is a prime number or not. Note: I did
                 * write the codes for checking if it is a prime number in
                 * question 2. Therefore calling that function here
                 */
                if (qtn4.isCircularPrimeNum(i)) {
                    count++;
                    //System.out.println(i);
                }
            }
        }
        
        System.out.println("The number of circular primes below million is: "+count);
    }

    static boolean isCircularPrimeNum(int n) {
        for(Object i: rotate(n)){
            if (!qtn2.isPrime(Long.parseLong((String) i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Used to rotate a number e.g the rotations of 197 are 197, 971, and 719
     *
     * @param n a number that we want to rotate
     * @return return a List of rotations of a given number n;
     */
    static Set rotate(int n) {
        Set rotations = new TreeSet();

        if (n < 10) {   //if n is a single digit e.g 8 then we return itself
            rotations.add(String.valueOf(n));  // (^.^) n is a rotation of itself by default
            return rotations;
        }
        char[] nstr = String.valueOf(n).toCharArray();   //The best method to get rotations of a number is to change it to string

        for (int i = 0; i < nstr.length; i++) {
            char[] tmp1 = nstr.clone();
            for (int j = 0; j < nstr.length; j++) {
                char tmp = tmp1[i];
                tmp1[i] = tmp1[j];
                tmp1[j] = tmp;
                rotations.add(String.valueOf(tmp1));
            }
        }

        return rotations;
    }
}
