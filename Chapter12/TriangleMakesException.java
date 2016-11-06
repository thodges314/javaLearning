/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;
import Chapter11.TriangleFromSimpleGeometricObject;
/**
 *
 * @author Java
 */
public class TriangleMakesException 
extends TriangleFromSimpleGeometricObject {

    //constructors
    public TriangleMakesException
        (double side1, double side2, double side3)
        throws IllegalTriangleException {
        super(side1, side2, side3);
        if  ((side1 + side2 < side3) || (side1 + side3 < side2) ||
                (side2 + side3 < side1)){
            throw new IllegalTriangleException();
        }
    }
}