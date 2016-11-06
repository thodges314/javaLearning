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
public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for(int i = 0; i< objects.length; i++) {
            if(objects[i] instanceof Edible)
                System.out.println(((Edible)objects[i]).howToEat());
            if (objects[i] instanceof Animal) {
                System.err.println(((Animal)objects[i]).sound());
            }
        }
    }
    
}
