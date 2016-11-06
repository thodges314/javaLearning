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
public class TestRef {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        System.out.printf("i is %d and j is %d.%n", i,j);
        System.out.printf("j = i and i = 2%n");
        j=i;
        i=2;
        System.out.printf("i is %d and j is %d.%n", i,j);
    }
    
}
