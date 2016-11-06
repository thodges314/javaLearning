/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09;

/**
 *
 * @author thodges
 */
public class TestSimpleCircle {
    public static void main(String[] args) {
        // Create a simple circle with default radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.printf("The area of a circle with radius %,.0f is %,.4f.%n",
                circle1.getRadius(), circle1.getArea());
        
        //Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.printf("The area of a circle with radius %,.0f is %,.4f.%n",
                circle2.getRadius(), circle2.getArea());
        
        //Create a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.printf("The area of a circle with radius %,.0f is %,.4f.%n",
                circle3.getRadius(), circle3.getArea());
        
        //Modify circle radius
        circle2.setRadius(100);
        System.out.printf("The area of a circle with radius %,.0f is %,.4f.%n",
                circle2.getRadius(), circle2.getArea());
        
        
    }
    
}

class SimpleCircle {
    double radius = 1;
    
    SimpleCircle() {
    }
    
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }
    
    double getRadius() {
        return radius;
    }
    
    double getArea() {
        return Math.pow(radius,2)* Math.PI;
    }
    
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}