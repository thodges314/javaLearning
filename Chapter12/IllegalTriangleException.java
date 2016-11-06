/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author Java
 */
public class IllegalTriangleException extends Exception {

    public IllegalTriangleException() {
        super("Invalid side lengths.");
    }
}
