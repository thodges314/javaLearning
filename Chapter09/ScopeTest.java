/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09;

/**
 *
 * @author Java
 */
public class ScopeTest {
    private static int i=0;
    private static int j=0;
    
    public static void main(String[] args) {
        int i = 2;
        int k = 3;
        
        {
            int j=3;
            System.out.println("i + j is " + (i + j));
        }
        k = i + j;
        System.out.println("k is " + k);
        System.out.println("j is " + j);
    }
    
}
