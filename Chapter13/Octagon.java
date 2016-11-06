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
public class Octagon extends GeometricObject {

    private double side;

    //constructors
    public Octagon() {

    }

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon(double side, String color, boolean filled) {
        this.side = side;
        setColor(color);
        setFilled(filled);
    }

    //seters
    public void setSide(double side) {
        this.side = side;
    }

    //getters
    public double getSide() {
        return side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public double getArea() {
        return (2 + 2 * Math.sqrt(2)) * Math.pow(side, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Octagon) {
            return (side == ((Octagon) o).side);
        } else {
            return this == o;
        }

    }

    @Override
    public String toString() {
        return "Octagon:\n" + super.toString();
    }
}
