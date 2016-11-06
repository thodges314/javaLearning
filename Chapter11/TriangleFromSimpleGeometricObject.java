/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

/**
 *
 * @author Java
 */
public class TriangleFromSimpleGeometricObject 
extends SimpleGeometricObject {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;
    
    //constructors
    public TriangleFromSimpleGeometricObject() {
    }
    public TriangleFromSimpleGeometricObject
        (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    //getters
    public double getSide1() {
        return side1;
    } 
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    public double getArea() {
        double p = getPerimeter() / 2.0;
        double inRoot = p * (p - side1) * (p - side2) * (p - side3);
        return (inRoot >= 0) ? Math.pow(inRoot, 0.5) : null;
    }
    public double getPerimeter() {
        return((side1 + side2 > side3) &&
                (side1 + side3 > side2) && (side2 + side3 > side1)) ?
                (side1 + side2 + side3) : null;
    }
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
        
    
}
