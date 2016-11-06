/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author Java
 */
public class BindingDemo {

    public static void main(String[] args) {
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);
        DoubleProperty d3 = new SimpleDoubleProperty(3);
        d1.bind(d2.multiply(d2));
        d3.bindBidirectional(d2);
        System.out.println("d1 is " + d1.getValue() + ", d2 is "
                + d2.getValue() + " and d3 is " + d3.getValue());
        d2.setValue(88.8);
        System.out.println("d1 is " + d1.getValue() + ", d2 is "
                + d2.getValue() + " and d3 is " + d3.getValue());
        d3.setValue(14.4);
        System.out.println("d1 is " + d1.getValue() + ", d2 is "
                + d2.getValue() + " and d3 is " + d3.getValue());

    }

}
