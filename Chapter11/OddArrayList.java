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
public class OddArrayList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new CircleFromSimpleGeometricObject(2));
        list.add(new java.util.Date());
        list.add("String is here.");
        list.add(new SavingsAccount(44,1000000));
        for(int i = 0; i < list.size(); i++)
            System.out.println((list.get(i)).toString());
    }
}
