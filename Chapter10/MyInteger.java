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
public class MyInteger {
    int myValue;
    MyInteger(int value) {
        myValue = value;
    }
    public int getInt() {
        return myValue;
    }
    
    public boolean isEven(int number) {
        return((number % 2) == 0);
    }
    public boolean isEven() {
        return this.isEven(myValue);
    }
    public boolean isEven(MyInteger mine) {
        return this.isEven(mine.getInt());
    }
    
    public boolean isOdd(int number) {
        return((number % 2) != 0);
    }
    public boolean isOdd() {
        return this.isOdd(myValue);
    }
    public boolean isOdd(MyInteger mine) {
        return this.isOdd(mine.getInt());
    }
    
    public boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                 return false;
            }
        }
        return true;
    }
    public boolean isPrime() {
        return this.isPrime(myValue);
    }
    public boolean isPrime(MyInteger mine) {
        return this.isPrime(mine.getInt());
    }
    
    public boolean equals(int i) {
        return (i == myValue);
    }
    public boolean equals(MyInteger mine) {
        return this.equals(mine.getInt());
    }
    
    public int[] parseInt(char[] myCharArray) {
        int[] myIntArray = new int[myCharArray.length];
        for (int i = 0; i<myCharArray.length; i++) {
            myIntArray[i] = ((int)myCharArray[i]) - 48;
        }
        return myIntArray;
    }
    
    public int parseInt(String myString) {
        return Integer.parseInt(myString);
    }
}
