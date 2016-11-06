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
public class Square
        extends GeometricObject implements Colorable {

    private double side;

    //constructors
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        setColor(color);
        setFilled(filled);
    }

    //setters
    public void setSide(double side) {
        this.side = side;
    }

    //getters
    public double getSide() {
        return side;
    }

    /**
     *
     * @return
     */
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea() {
        return side * side;
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
            return (side
                    == ((Square) o).side);
        } else {
            return this == o;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.side)
                ^ (Double.doubleToLongBits(this.side) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Square:\n" + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.print("Color all four sides.");
    }

}
