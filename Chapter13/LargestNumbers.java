/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

import java.util.ArrayList;
import java.math.*;

/**
 *
 * @author Java
 */
public class LargestNumbers {

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);       //integer
        list.add(3445.53);  //double
        list.add(new BigInteger("3432323234343101"));
        //BigInteger
        list.add(new BigDecimal("2.0909090981343433344343"));
        //BigDecimal
        System.out.println("The largest number is " + getLargestNumber(list));
        System.out.println("Sorted smallest to largest: ");
        sort(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);
            }
        }
        return number;
    }

    public static void sort(ArrayList<Number> list) {
        int maxIndex = (list.size());
        for (int i = maxIndex; i > 0; i--) {
            Number biggest = getLargestNumber(new ArrayList<>(list.subList(0, i)));
            list.add(i, biggest);
            list.remove(biggest);
        }

    }
}
