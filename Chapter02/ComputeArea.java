/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

/**
 *
 * @author Admin
 */
public class ComputeArea {
    public static void main(String[] args)
    {
        double radius;
        double area;
        
        radius = 20;
        
        area = radius * radius * 3.14159;
        
        System.out.println("The area for the circle of radius " + radius + 
                " is " + area);
    }
    
}
