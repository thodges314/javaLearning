/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09;

/**
 *
 * @author thodges
 */
public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        //create circle with radius 5
        CircleWithPrivateDataFields myCircle =
                new CircleWithPrivateDataFields(5.0);
        
        //print initial cirlce info
        System.out.printf("The area of the circle with radius %,.2f is %,.4f.%n"
                , myCircle.getRadius(), myCircle.getArea());
        
        //increase circle size
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.printf("The area of the circle with radius %,.2f is %,.4f.%n"
                , myCircle.getRadius(), myCircle.getArea());
        
        //objects created
        System.out.printf("The number of objects created is %d.%n",
                myCircle.getNumberOfObjects());
        
        //test printCircle
        printCircle(myCircle);
    }
    
    public static void printCircle(CircleWithPrivateDataFields c) {
        System.out.printf("The area of the circle with radius %,.2f is %,.4f.%n"
                , c.getRadius(), c.getArea());
    }
}

