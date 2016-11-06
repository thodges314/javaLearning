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
public class TestEqualsOverride {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle1 = 
                new CircleFromSimpleGeometricObject(16);
        CircleFromSimpleGeometricObject circle2 = 
                new CircleFromSimpleGeometricObject(16);
        RectangleFromSimpleGeometricObject rectangle1 =
                new RectangleFromSimpleGeometricObject(3,4);
        RectangleFromSimpleGeometricObject rectangle2 =
                new RectangleFromSimpleGeometricObject(3,4);
        RectangleFromSimpleGeometricObject rectangle3 =
                new RectangleFromSimpleGeometricObject(33,44);
    
        //circle method refd with private variable, rectangle is not
    
        System.out.println("c1 == c2 ? " + circle1.equals(circle2));
        System.out.println("r1 == r2 ? " + rectangle1.equals(rectangle2));
        System.out.println("r1 == r2 ? " + rectangle1.equals(rectangle3));
        System.out.println("c1 == r1 ? " + circle1.equals(rectangle1));
        //apparently it's ok because they are in the same *class*
    }
}
