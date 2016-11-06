/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02;

/**
 *
 * @author Admin
 */
public class CheckPoint1 {
    public static void main(String[] args) {
        System.out.println("56%6 = " + (56%6));
        System.out.println("78%-4 = " + (78%-4));
        System.out.println("-34%5 = " + (-34%5));
        System.out.println("-34%-5 = " + (-34%-5));
        System.out.println("5%1 = " + (5%1));
        System.out.println("1%5 = " + (1%5));
        System.out.println("");
        
        System.out.println("Su=0, Mo=1, Tu=2, We=3, Th=4, Fr=5, Sa=6");
        System.out.println("Today is Tu.  2+100 = 100 days from now.");
        System.out.println("(2+100)%7="+((2+100)%7));
        System.out.println("");
        
        System.out.println("25/4 = "+(25/4));
        System.out.println("((float)25)/4 = "+(((float)25)/4));
        System.out.println("");
        
        System.out.println("System.out.println(2 * (5 / 2 + 5 / 2));"+
                (2 * (5 / 2 + 5 / 2)));
        System.out.println("System.out.println(2 * 5 / 2 + 2 * 5 / 2);"+
                (2 * 5 / 2 + 2 * 5 / 2));
        System.out.println("System.out.println(2 * (5 / 2));"+
                (2 * (5 / 2)));
        System.out.println("System.out.println(2 * 5 / 2);"+
                (2 * 5 / 2));
        System.out.println("");
        
        System.out.println("25 / 4 is "+ 25 / 4);
        System.out.println("25 / 4.0 is "+ 25 / 4.0);
        System.out.println("3 * 2 / 4 is "+ 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 is "+ 3.0 * 2 / 4);    
        System.out.println("");
        
        System.out.println("Math.pow(2,3.5)" + Math.pow(2,3.5));
        System.out.println("");
        
        double a = 6.5;
        a += a + 1;
        System.out.println(a);
        a = 6;
        a /= 2;
        System.out.println(a);
        System.out.println("");
        
        // predict 7 6 7 7
        int b = 6;
        int c = b++;
        System.out.println("b = " + b + ", c = " + c );
        b = 6;
        c = ++b;
        System.out.println("b = " + b + ", c = " + c );
        System.out.println("");
        
    }
    
}
