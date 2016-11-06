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
public class CircleWithPrivateDataFields {
    //class fields
    private double radius = 1;
    private static int numberOfObjects = 0;
    
    //constructors
    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }
    
    public CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }
    
    //accessors
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
    
    public static int getNumberOfObjects() {    //needs to be static to grab
        return numberOfObjects;                 //static field numberOfObjects
    }
    
    //mutator
    public void setRadius(double newRadius) {
        radius = (newRadius >=0) ? newRadius : 0;
    }
}
