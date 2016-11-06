/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;
import java.math.BigInteger; 
        
 
/**
 *
 * @author Java
 */
public class CheckPointTests {
    public static void main(String[] args) {
        Integer i = new Integer("23");
        Integer j = new Integer(23); //unnecessary boxing
        Integer k = Integer.valueOf("23");
        Integer l = Integer.parseInt("23", 8);
        Integer m = (Integer.valueOf("23")).intValue(); //unnecessary unboxing
        Integer n = (Double.valueOf("23.4")).intValue();
        System.out.println(""+i+j+k+l+m+n);
        
        Integer x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(x.compareTo(new Integer(4)));
        
        Integer z = 3 + new Integer(5); //unnecessary boxing
        Double w = 3d;
        
        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("2");
        BigInteger c = a.multiply(b); // 9223372036854775807 * 2
        System.out.println(c);
                
        
    }
    
}
