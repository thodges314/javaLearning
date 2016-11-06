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
public class CircleFromSimpleGeometricObject
    extends SimpleGeometricObject {
    private double radius;
    
    //contructors
    public CircleFromSimpleGeometricObject() {
    }
    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }
    public CircleFromSimpleGeometricObject(double radius, String color, boolean
            filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    
    //setters
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //getters
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getDiameter() {
        return 2 * radius;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    
    //display
    public void printCircle() {
        System.out.println("The circle was created " + getDateCreated() +
                " and the radius is " + radius);
    }
    @Override
    public String toString() {
        return super.toString()+"\nradius is " + radius;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof CircleFromSimpleGeometricObject)
            return radius == ((CircleFromSimpleGeometricObject)o).radius;
        else
            return this == o;
    }
}
