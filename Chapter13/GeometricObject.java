/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

import java.util.Date;

/**
 *
 * @author Java
 */
public abstract class GeometricObject implements Comparable<GeometricObject>,
        Cloneable {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /* Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new Date();
    }

    /* Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    /* Return color */
    public String getColor() {
        return color;
    }

    /* Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /* return boolean for if filled */
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color
                + " and filled: " + filled;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        GeometricObject geoClone = (GeometricObject) super.clone();
        geoClone.dateCreated = (Date) (dateCreated.clone());
        return geoClone;
    }

    public static GeometricObject max(GeometricObject a, GeometricObject b) {
        if (a.getArea() > b.getArea()) {
            return a;
        } else if (a.getArea() < b.getArea()) {
            return b;
        } else {
            return null;
        }
    }

    /* ABSTRACT method getArea */
    public abstract double getArea();

    /* ABSTRACT method getPerimeter */
    public abstract double getPerimeter();

}
