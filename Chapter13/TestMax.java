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
public class TestMax {

    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);
        Rectangle r1 = new Rectangle(1, 2);
        Rectangle r2 = new Rectangle(3, 4);
        System.out.println("Circle: \n" + GeometricObject.max(c1, c2).toString());
        System.out.println("Rectangle: \n" + GeometricObject.max(r1, r2).toString());
        System.out.println("Both: \n" + GeometricObject.max(c1, r2).toString());
    }

}
