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
public class Rectangle
        extends GeometricObject {

    private double width;
    private double height;

    //constructors
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    //setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    /**
     *
     * @return
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea() {
        return height * width;
    }

    //overrides
    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            return (width
                    == ((Rectangle) o).width)
                    && (height
                    == ((Rectangle) o).height);
        } else {
            return this == o;
        }
    }

    public String toString() {
        return "Rectangle:\n" + super.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.width)
                ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.height)
                ^ (Double.doubleToLongBits(this.height) >>> 32));
        return hash;
    }

}
