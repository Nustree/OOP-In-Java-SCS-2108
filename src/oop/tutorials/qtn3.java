/**
 * A palindromic number reads the same both ways. The largest palindrome
 * made from the product of two 2-digit numbers is 9009 = 91 X 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
package oop.tutorials;

/**
 *
 * @author Muleya
 */
public class qtn3 {
     public static void main(String[] args) {
         int largest=0,d1=0,d2=0;  //largest is for storing the largest palindrome and d1,d2 are three digit number 1 and 2
         for(int i=100;i<1000;i++){
             for(int j=100;j<1000;j++){
                 int product=j*i;
                 if(qtn3.isPalindrome(product)){
                    largest=product;
                    d2=i;d1=j;
                 }
             }
         }
         System.out.printf("The largest palindrome made from the product of two 3-digit numbers is %d = %d X %d.\n",largest,d1,d2);
    }
     /**
      * 
      * @param n The number that we want to check if it is a palindrome
      * @return  true if n is palindrome
      */
     static boolean isPalindrome(int n){
         return n==qtn3.reverseNum(n);
     }
     /**
      * 
      * @param n The number that we want to reverse 
      * @return the corresponding reversed number of n
      */
     static int reverseNum(int n){
         int l = n,reversed=0;
         while(l>9){
            int rem=l%10;  //Store the reminder when we divide l by 10 e.g 19/10 , reminder is 9;
            l=l/10;   //Store the vlaue when we divide l by 10 e.g 19/10 , results is 1
            reversed=(rem*10)+(reversed*10); 
         }
          reversed+=l;
         return reversed;
     }
     
     
    
}
