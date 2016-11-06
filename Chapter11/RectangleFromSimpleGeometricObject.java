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
public class RectangleFromSimpleGeometricObject 
    extends SimpleGeometricObject {
    private double width;
    private double height;
    
    //constructors
    public RectangleFromSimpleGeometricObject() {
    }
    public RectangleFromSimpleGeometricObject(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public RectangleFromSimpleGeometricObject
        (double width, double height, String color, boolean filled) {
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
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public double getArea() {
        return height * width;
    }
    
    //overrides
    @Override
    public boolean equals(Object o) {
        if (o instanceof RectangleFromSimpleGeometricObject)
            return (width ==
                    ((RectangleFromSimpleGeometricObject)o).width)
                    &&
                    (height ==
                    ((RectangleFromSimpleGeometricObject)o).height);
        else
            return this == o;
    }
}
