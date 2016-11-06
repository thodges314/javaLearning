/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

/**
 *
 * @author Java
 */
public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger myInt = new MyInteger(7);
        System.out.printf("myInt has value : %d.%n%n", myInt.getInt());
        
        System.out.printf("myInt.isEven() = %s.%n", (myInt.isEven()) ? 
                "True" : "False");
        System.out.printf("myInt.isOdd() = %s.%n", (myInt.isOdd()) ? 
                "True" : "False");
        System.out.printf("myInt.isPrime() = %s.%n%n", (myInt.isPrime()) ?
                "True" : "False");
        
        System.out.printf("myInt.isEven(6) = %s.%n", (myInt.isEven(6)) ? 
                "True" : "False");
        System.out.printf("myInt.isOdd(6) = %s.%n", (myInt.isOdd(6)) ? 
                "True" : "False");
        System.out.printf("myInt.isPrime(6) = %s.%n%n", (myInt.isPrime(6)) ?
                "True" : "False");
        
        MyInteger myInt2 = new MyInteger(6);
        System.out.printf("myInt2 has value : %d.%n%n", myInt2.getInt());
        
        System.out.printf("myInt.isEven(myInt2) = %s.%n",
                (myInt.isEven(myInt2)) ? "True" : "False");
        System.out.printf("myInt.isOdd(myInt2) = %s.%n", 
                (myInt.isOdd(myInt2)) ? "True" : "False");
        System.out.printf("myInt.isPrime(myInt2) = %s.%n%n",
                (myInt.isPrime(myInt2)) ? "True" : "False");
        
        System.out.printf("myInt.equals(7) = %s.%n",
                (myInt.equals(7)) ? "True" : "False");
        System.out.printf("myInt.equals(myInt2) = %s.%n%n",
                (myInt.equals(myInt2)) ? "True" : "False");
        
        System.out.print("myInt.parseInt('8','6','7','5','3','0','9') = ");
        char[] charArray = {'8','6','7','5','3','0','9'};
        int[] parseInt = myInt.parseInt(charArray);
        for(int i = 0; i < parseInt.length; i++) {
            System.out.print(parseInt[i] + " ");
        }
        System.out.println(".");
        
        System.out.printf("myInt.parseInt(\"802701\") = %d.%n", 
                myInt.parseInt("802701"));
    }
    
}
