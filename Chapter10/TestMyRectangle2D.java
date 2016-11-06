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
public class TestMyRectangle2D {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2.0, 2.0, 5.5, 4.9);
        System.out.println(
                "MyRectangle2D r1 = new MyRectangle2D(2.0, 2.0, 5.5, 4.9);");
        System.out.printf("r1.contains(3,3) = %s.%n", r1.contains(3,3) ?
                "True" : "False");
        System.out.printf(
                "r1.contains(new MyRectangle2D(4, 5, 10.5, 3.5)) = %s.%n", 
                r1.contains(new MyRectangle2D(4, 5, 10.5, 3.5)) ?
                        "True" : "False");
        System.out.printf(
                "r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)) = %s.%n", 
                r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)) ?
                        "True" : "False");
    }
    
}
