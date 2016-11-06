/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

/**
 *
 * @author Java
 */
public class Circle
        extends GeometricObject {

    private double radius;

    //contructors
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
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

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    //display
    public void printCircle() {
        System.out.println("The circle was created " + getDateCreated()
                + " and the radius is " + radius);
    }

    @Override
    public String toString() {
        return "Circle:\n" + super.toString() + "\nradius is " + radius;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            return radius == ((Circle) o).radius;
        } else {
            return this == o;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.radius) ^ (Double.doubleToLongBits(this.radius) >>> 32));
        return hash;
    }
}
