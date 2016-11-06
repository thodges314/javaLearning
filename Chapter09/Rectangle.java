/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09;

/**
 *
 * @author Java
 */
public class Rectangle {
    private double width = 1;
    private double height = 1;
    
    public Rectangle() {}
    
    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
