/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;
import java.util.ArrayList;

/**
 *
 * @author Java
 */
public class TestArrayList {
    public static void main(String[] args) {
        //create arraylist for cities
        ArrayList<String> cityList = new ArrayList<>();
        
        //add cities
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");
        
        System.out.println("List size: " + cityList.size());
        System.out.println("Miami on list? " + cityList.contains("Miami"));
        System.out.println("The location of Denver on the list: " +
                cityList.indexOf("Denver"));
        System.out.println("List is empty? " + cityList.isEmpty());
        
        cityList.add(2, "Xian");
        //adds Xian at position 2 (3) and bumps everything forward
        cityList.remove("Miami");
        //removes Miami, bumps everything back by 1
        cityList.remove(1);
        //removed city at position 1(2)
        System.out.println(cityList.toString());
        //prints citylist
        
        for(int i = cityList.size() - 1; i >= 0; i--)
            System.out.print(cityList.get(i) + " ");
        System.out.println();
        
        //now for circles
        ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();
        
        list.add(new CircleFromSimpleGeometricObject(2));
        list.add(new CircleFromSimpleGeometricObject(3));
        
        System.out.println("The area of the first circle: " +
                list.get(0).getArea());
    }
    
}
