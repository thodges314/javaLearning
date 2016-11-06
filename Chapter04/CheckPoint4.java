/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter04;

import static java.lang.Math.*;

/**
 *
 * @author Admin
 */
public class CheckPoint4 {
    public static void main(String[] args){
        System.out.println("Math.sqrt(4) = " + sqrt(4));
        System.out.println("Math.log(Math.E) = " + log(E));
        System.out.println("Math.rint(-2.5) = " + rint(-2.5));
        System.out.println("Math.ceil(-2.5) = " + ceil(-2.5));
        System.out.println("Math.floor(-2.5) = " + floor(-2.5));
        System.out.println("Math.round(-2.5f) = " + round(-2.5f));
        System.out.println("Math.round(-2.5) = " + round(-2.5));
        System.out.println("Math.rint(2.5) = " + rint(2.5));
        System.out.println("Math.ceil(2.5) = " + ceil(2.5));
        System.out.println("Math.floor(2.5) = " + floor(2.5));
        System.out.println("Math.round(2.5f) = " + round(2.5f));
        System.out.println("Math.round(2.5) = " + round(2.5));
        //round() gives an integer, rint() gives a double.
        
        //convert pi/7 to an angle in degrees and assigns the result to a
        //variable.
        double rad = PI / 7;
        double deg = toDegrees(rad);
        System.out.println("\n" + rad + " radians or " + deg + " degrees.");
        
        //gives a random number between 34 and 55
        int randNumber = (int)(random() * 22) + 34;
        System.out.println("\nRandom number between 34 and 55 " + randNumber);
        int randNumber999 = (int)(random() * 1000);
        System.out.println("Random number between 0 and 999 " + randNumber999);
        double randNumber555 = random() * 50 + 5.5;
        System.out.println("Random number bewteen 5.5 and 55.5 " +
                randNumber555);
        
        //character increment.
        //char is a character primative
        //String is a string object
        char ch = 'a';
        System.out.println("");
        System.out.println(++ch);
        
        //ASCII codes
        int char1 = '1';
        int charA = 'A';
        int charB = 'B';
        int charLittleA = 'a';
        int charLittleB = 'b';
        System.out.println("\n1 is " + char1 + "\nA is " + charA + "\nB is " +
                charB + "\na is " + charLittleA + "\nb is " + charLittleB);
        
        //casting test
        char c = 'A';
        int i = (int)c;
        System.out.println("\n"+i);
        
        float f = 1000.34f;
        i = (int)f;
        System.out.println(i);
        
        double d = 1000.34;
        i = (int)d;
        System.out.println(i);
        
        i = 97;
        c = (char)i;
        System.out.println(c);
        
        //ascii conversion etx 4.13
        //predict: b, c and ascii code of -2?!
        char x = 'a';
        char y = 'c';
        System.out.println("");
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(x - y);
        //oh... he NUMBER -2  but try this " " (32) + " " (32) = @ (64) ?
        x = ' ';
        y = ' ';
        System.out.println(x + y); // no  printed 64
        System.out.println(2 * x); // still 64
        
        //random lowercase letter
        c = (char)((int)(random()*26)+97);
        System.out.println("\n"+c);
        
    }
    
}
