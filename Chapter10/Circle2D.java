/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;
//import java.lang.Math;

/**
 *
 * @author Java
 */
public class Circle2D {
    private double x;
    private double y;
    private double radius;
    
    //CONSTRUCTORS
    Circle2D() {    //default constructor - x = 0, y = 0 radius = 1
        this(0,0,1);
    }
    Circle2D(double x, double y, double radius){    //circle with center x, y
        this.x = x;                                 // and radius radius
        this.y = y;
        this.radius = radius;
    }
    
    //GETTERS
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getRadius() {                     //return radius
        return radius;
    }
    public double getArea() {                       //returns area
        return (Math.PI * Math.pow(radius, 2.0));
    }
    public double getPerimeter() {                  //returns perimeter
        return (Math.PI * 2 * radius);
    }
    public boolean contains(double x, double y) {   //contains point x, y
        return (Math.pow((x-this.x), 2.0) + Math.pow((x-this.x), 2.0)
                <= Math.pow(this.radius, 2.0));
    }
    public boolean contains(Circle2D circ) {        //is circle enclosed
        double x1 = this.x;
        double y1 = this.y;
        double r1 = this.radius;
        double x2 = circ.getX();
        double y2 = circ.getY();
        double r2 = circ.getRadius();
        
        return ((r2 <= r1) &&
                (r1 - distance(x1, y1, x2, y2) >= r2));
    }
    public boolean overlaps(Circle2D circ) {        //do circles overlap
        double x1 = this.x;
        double y1 = this.y;
        double r1 = this.radius;
        double x2 = circ.getX();
        double y2 = circ.getY();
        double r2 = circ.getRadius();
        
        return(distance(x1, y1, x2, y2) <= (r1 + r2));
    }
    
    //INTERNAL OPERATIONS
    private double distance(double x1, double y1, double x2, double y2) {
        return(Math.pow((Math.pow((x1 - x2), 2.0) + Math.pow((y1 - y2), 2.0)), 
                0.5));
    }
    
}
