/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;
import java.util.Scanner;

/**
 *
 * @author Java
 */
public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        
        System.out.println("Ignoring nonalphanumeric characters, \nis \""
        + s + "\" a palindrome? " + isPalindrome(s));
    }
    
    public static boolean isPalindrome(String s) {
        String s1 = filter(s);
        
        String s2 = reverse(s1);
        
        return s2.equals(s1);
    }
    
    public static String filter(String s) {
        StringBuilder builder = new StringBuilder();
        
        for (int i=0; i<s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
              builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
    
    public static String reverse(String s) {
        StringBuilder builder = new StringBuilder(s);
        builder.reverse();
        return builder.toString();
    }
}
