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
public class BigIntegerDivisible {
    static BigInteger biggie;
    
    static void makeBig() {
        biggie = new BigInteger("1");
        BigInteger ten = new BigInteger("10");
        for(int i=0; i<50; i++) {
            biggie = biggie.multiply(ten); 
        }
    }
    static boolean divisible(int i){
        BigInteger divisor = BigInteger.valueOf(i);
        BigInteger zero = new BigInteger("0");
        return (biggie.remainder(divisor).equals(zero));
    }
    public static void main(String[] args) {
        int count = 0;
        makeBig();
        BigInteger one = new BigInteger("1");
        do {
            if(divisible(2) && count < 50) {
                System.out.println(biggie);
                count++;
            }
            else if (divisible(3) && count < 50) {
                System.out.println(biggie);
                count++;
            }
            biggie = biggie.add(one);
        }while (count < 50);
    }
}
