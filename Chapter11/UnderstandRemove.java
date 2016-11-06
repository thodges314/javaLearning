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
public class UnderstandRemove {
    public static void main(String[] args) {
        ArrayList<String>testRemove = new ArrayList<>();
        for(int i = 1; i <= 5; i++)
            testRemove.add("cat");
        testRemove.add("dog");
        
        System.out.println("Before testRemove.remove(\"cat\"); " + 
                testRemove.toString());
        testRemove.remove("cat");
        System.out.println("After testRemove.remove(\"cat\"); " + 
                testRemove.toString());
        //removes the first instance only
    }
}
