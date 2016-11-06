/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter04;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class OrderTwoCities {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //enter two cities
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the next city: ");
        String city2 = input.nextLine();
        
        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphebetical order are " +
                    city1 + ", " + city2 + ".");
        else
            System.out.println("The cities in alphebetical order are " +
                    city2 + ", " + city1 + ".");
    }
    
}
