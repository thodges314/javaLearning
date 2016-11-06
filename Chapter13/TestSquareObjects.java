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
public class TestSquareObjects {

    public static void main(String[] args) {
        GeometricObject[] shapes = new GeometricObject[5];
        shapes[0] = new Triangle(2.0, 3.0, 4.0);
        shapes[1] = new Square(6);
        shapes[2] = new Rectangle(5, 3);
        shapes[3] = new Circle(4);
        shapes[4] = new Square(1);

        java.util.Arrays.sort(shapes);

        for (GeometricObject shape : shapes) {
            //System.out.println("\n" + shape.toString());
            System.out.print("\n" + shape.getArea());
            if (shape instanceof Colorable) {
                ((Square) shape).howToColor();
            }
        }
    }

}
