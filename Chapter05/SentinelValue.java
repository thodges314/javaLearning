/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter05;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer (input ends for 0): ");
        int data = input.nextInt();
        
        int sum = 0;
        while (data != 0) {
            sum += data;
            
            System.out.print("Enter an integer (input ends for 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
    
}
