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
public class TestOctagonClone {

    public static void main(String[] args) {
        try {
            Octagon oct = new Octagon(4);
            Octagon oct1 = oct;
            Octagon oct2 = (Octagon) oct.clone();

            System.out.println("oct == oct1: " + (oct == oct1));
            System.out.println("oct == oct2: " + (oct == oct2));
            System.out.println("oct.equals(oct2): " + oct.equals(oct2));
            oct1.setSide(3);
            System.out.println("oct1.setSide(3)");
            System.out.println("oct: " + oct.getArea());
            System.out.println("oct1: " + oct1.getArea());
            System.out.println("oct2: " + oct2.getArea());
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }
    }

}
