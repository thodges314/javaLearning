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
public class TestGeometricObject {

    public static void main(String[] args) {
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);
        GeometricObject geoObject3 = new Triangle(3,4,5);

        System.out.println("The two objects have the same area? "
                + equalArea(geoObject1, geoObject2));

        //display Circle
        displayGeometricObject(geoObject1);

        //display rectangle
        displayGeometricObject(geoObject2);
        
        //display triangle
        displayGeometricObject(geoObject3);
    }

    //compare areas
    public static boolean equalArea(GeometricObject object1,
            GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println("\nThe area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }

}
