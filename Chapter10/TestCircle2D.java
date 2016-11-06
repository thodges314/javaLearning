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
public class TestCircle2D {
    public static void main(String[] args) {
        Circle2D circ1 = new Circle2D(2, 2, 2.5);
        
        System.out.printf("circ1.contains(3,3) = %s.%n",
                circ1.contains(3, 3) ? "True" : "False");
        System.out.printf("circ1.contains(new Circle2D(4, 5, 10.5)) = %s.%n",
                circ1.contains(new Circle2D(4, 5, 10.5)) ? "True" : "False");
        System.out.printf("circ1.overlaps(new Circle2D(3, 5, 2.3)) = %s.%n",
                circ1.overlaps(new Circle2D(3, 5, 2.3)) ? "True" : "False");
        
    }
    
}
