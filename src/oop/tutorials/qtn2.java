/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
package oop.tutorials;



/*
 This program takes a lot of time to complete...<Be patient>. Consider updating the codes for performance..
*/

/**
 *
 * @author Muleya
 */
public class qtn2 {
    
     public static void main(String[] args) {
        long largest=0;
        for(long i=1;i<600851475143l;i++){
            if(qtn2.isFactor(i, 600851475143l)){  //to chck if i is a factor of 600851475143
                if(qtn2.isPrime(i)){   //to check is it is a prime number
                    System.out.println(i);
                    largest=i;
                }
            }
        }
        
        System.out.println("The largest prime factor is "+largest);
    }
    
    
    
    /**
     * @param n the integer number to check
     * @return true if the number if prime number and false in not.
     */
    static boolean isPrime(long n){
        if(n==0||n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;   //if there is any number which is a factor of n then we know that n is not a prime number....
            }
        }
        return true;
    }
    
    /**
     * 
     * @param t the number that we want to check if n is its factor(in this case t is 600851475143) 
     * @param n the numbr that we want to check if it is a factor of t or not
     * @return true if n is factor of t and false if n is not a factor of t
     */
    static boolean isFactor(long n,long t){
        return t%n==0;
    }
}
