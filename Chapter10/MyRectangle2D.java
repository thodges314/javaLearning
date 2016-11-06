/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

/**
 *
 * @author Java
 */
public class MyRectangle2D {
    //fields
    private double x;
    private double y;
    private double width;
    private double height;
    
    //constructors
    MyRectangle2D() {
        this(0, 0, 1, 1);
    }
    MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    //setters
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    
    //getters
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2*(width + height);
    }
    public boolean contains(double x, double y) {
        double xL = this.x - width/2;
        double xR = this.x + width/2;
        double yB = this.y - height/2;
        double yT = this.y + height/2;
        return ((x >= xL) && (x <= xR) && (y >= yB) && (y <= yT));
    }
    public boolean contains(MyRectangle2D r) {
        double x = r.getX();
        double y = r.getY();
        double width = r.getWidth();
        double height = r.getHeight();
        double xL = x - width/2;
        double xR = x + width/2;
        double yB = y - height/2;
        double yT = y + height/2;
        return (contains(xL, yT) && contains(xL, yB) && contains (xR, yT) &&
                contains(xR,yB));
    }
    public boolean overlaps(MyRectangle2D r) {
        double x = r.getX();
        double y = r.getY();
        double width = r.getWidth();
        double height = r.getHeight();
        return (Math.abs(x-this.x) <= Math.abs((width + this.width)/2) &&
                Math.abs(y-this.y) <= Math.abs((width + this.width)/2));
    }
}
