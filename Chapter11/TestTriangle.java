/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;
import java.util.Scanner;

/**
 *
 * @author Java
 */
public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Creating a new triangle.");
        System.out.print("Enter three side lengths: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        TriangleFromSimpleGeometricObject triangle = new
            TriangleFromSimpleGeometricObject(side1, side2, side3);
        System.out.print("Enter the color: ");
        String color = input.next();
        triangle.setColor(color);
        System.out.print("Filled? (y/n) ");
        String filled = input.next();
        triangle.setFilled((filled.charAt(0) == 'y'));
        
        System.out.println("\n\nYour Triangle\narea = " + triangle.getArea() +
                "\nperimeter = " + triangle.getPerimeter() + "\ncolor = " +
                triangle.getColor() + "\ntriangle is " + (triangle.isFilled() ?
                "filled" : "not filled"));
    }
    
}
