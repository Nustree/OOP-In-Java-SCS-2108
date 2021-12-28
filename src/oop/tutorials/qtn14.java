/**
 * Write a Java program to count the letters, spaces, numbers and other
 * characters of an input string.
 */
package oop.tutorials;

import java.util.Scanner;

/**
 *
 * @author Muleya
 */
public class qtn14 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String n = s.nextLine();
        
        /*example*/
        System.out.println("Number of whitespace "+ countWhiteSpace(n));
    }
    
    /**
     * To count the white spaces in a String
     * @param s
     * @return 
     */
    static int countWhiteSpace(String s){
        int count=0;
        char ch[]=s.toCharArray();
        for(char ch1: ch){
            count+= Character.isWhitespace(ch1) ? 1:0;   // If this doesnt work consider checking  by using: if(ch1==' '){count++;} or otherways 
        }
        return count;
    }
    
    /**
     * To count the occurence of numeric values in a string
     * @param s
     * @return 
     */
     static int countNums(String s){
         int count=0;
        char ch[]=s.toCharArray();
        for(char ch1: ch){
            count+= Character.isDigit(ch1) ? 1:0;   // If this doesnt work consider changing the  codes 
        }
        return count;
    }
     
     
     /**
      * To count ocurence of letters in a string s
      * @param s
      * @return 
      */
     static int countLetters(String s){
         int count=0;
        char ch[]=s.toCharArray();
        for(char ch1: ch){
            count+= Character.isLetter(ch1) ? 1:0;   // If this doesnt work consider changing the  codes 
        }
        return count;
    }
     
     
     /**
      * Count upperCase letters
      * @param s
      * @return 
      */
     static int countU(String s){
        int count=0;
        char ch[]=s.toCharArray();
        for(char ch1: ch){
            count+= Character.isUpperCase(ch1) ? 1:0;   // If this doesnt work consider using if(ch1>63 && ch1<91){ count++; } ei check usin ASCII codes
        }
        return count;
        
    }
     
     /**
      * Count lowercase letters
      * @param s
      * @return 
      */
     static int countL(String s){
         int count=0;
        char ch[]=s.toCharArray();
        for(char ch1: ch){
            count+= Character.isLowerCase(ch1) ? 1:0;   // If this doesnt work consider using if(ch1>48 && ch1<64){ count++; } ei check usin ASCII codes
        }
        return count;
    }
     
     /**This lets us learn about the Character java class **/
     
}
