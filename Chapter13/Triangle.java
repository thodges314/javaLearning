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
public class Triangle
        extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    //constructors
    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color,
            boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);

    }

    //setters
    public void setSide(double size, int side)
            throws IllegalArgumentException {
        switch (side) {
            case 1:
                this.side1 = size;
                break;
            case 2:
                this.side2 = size;
                break;
            case 3:
                this.side3 = size;
                break;
            default:
                throw new IllegalArgumentException("Possible sides are 1, 2 or 3.");

        }
    }
    //getters

    public double getSide(int side)
            throws IllegalArgumentException {
        switch (side) {
            case 1:
                return (side1);
            case 2:
                return (side2);
            case 3:
                return (side3);
            default:
                throw new IllegalArgumentException("Possible sides are 1, 2 or 3.");

        }
    }

    //overrides
    @Override
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2.0;
        return (Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));

    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Triangle) {
            return (side1 == ((Triangle) o).side1)
                    && (side2 == ((Triangle) o).side2)
                    && (side3 == ((Triangle) o).side3);
        } else {
            return this == o;
        }
    }

    @Override
    public String toString() {
        return "Triangle:\n" + super.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.side1)
                ^ (Double.doubleToLongBits(this.side1) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.side2)
                ^ (Double.doubleToLongBits(this.side2) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.side3)
                ^ (Double.doubleToLongBits(this.side3) >>> 32));
        return hash;
    }
}
