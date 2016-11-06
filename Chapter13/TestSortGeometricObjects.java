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
public class TestSortGeometricObjects {

    public static void main(String[] args) {
        //ArrayList<GeometricObject> shapes = new ArrayList<>();
        GeometricObject[] shapes = new GeometricObject[5];
        shapes[0] = new Triangle(2.0, 3.0, 4.0);
        shapes[1] = new Triangle(6, 6, 8);
        shapes[2] = new Rectangle(5, 3);
        shapes[3] = new Circle(4);
        shapes[4] = new Circle(1);

        java.util.Arrays.sort(shapes);

        for (GeometricObject shape : shapes) {
            System.out.println("\n" + shape.toString());
            System.out.println("" + shape.getArea());
        }

        System.out.println("The larger of items 2 and 3 is: ");
        System.out.println(GeometricObject.max(shapes[1], shapes[2]));

    }

}
