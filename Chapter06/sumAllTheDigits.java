/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter06;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author thodges
 */
public class sumAllTheDigits {
    
    //find a double power of 10
    public static long power10(int t) {
        long returnValue = 1L;
        for(int k = 1; k <= t; k++) {
            returnValue *= 10L;
        }
        return returnValue;
    }
    //return the number of digits in long n
    public static int numberOfDigits(long n) {
        //find number of digits using log base 10
        int b = (int)(Math.log10(n)+1);
        //starts having trouble after 14 digits - correct for this
        if (b > 14) b = (int)Math.log10(n/power10(10)) + 11;        
        return b;
    }
    
    //return the digit of long n at position int d
    public static int getNthDigit(long n, int d) {
        return (int)((n % power10(d)) / power10(d-1));
    }
    
    //sum of digits
    public static int sumOfDigits(long n) {
        int sum = 0;
//      for(int k = 0; (Math.pow(10,k) <= number); k++){
        int digits = numberOfDigits(n);
        for(int k=1; k<= digits; k++){
            sum += getNthDigit(n,(k));
        }
        return sum;
    }
    
    //reverse the number
    public static long reverse(long n) {
        int digits = numberOfDigits(n);
        long palindrome = 0;
        for(int k=1; k<= digits; k++){
            long thisDigit = (getNthDigit(n, k));
            palindrome += (thisDigit * power10(digits - k));
        }
        return palindrome;
    }
    
    public static boolean isPalindrome(long n) {
        return (n == reverse(n));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = 0;
        do {
            System.out.print(
                    "Enter an number between 1 and 9,223,372,036,854,775,807): "
            );
            number = input.nextLong();
            //int digits = numberOfDigits(number);
            System.out.printf("The sum of the digits of %,d is %,d.%n", number,
                    sumOfDigits(number));
             System.out.printf("This number in reverse is %,d.%n", 
                     reverse(number));
            if(isPalindrome(number)) System.out.printf("%,d is a palindrome.", 
                    number);
            System.out.println();
        } while (number != 0);
        
    }

}
