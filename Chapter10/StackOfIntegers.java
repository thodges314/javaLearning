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
public class StackOfIntegers {
    private int[] elements;
    private int size = 0;
    
    public StackOfIntegers() {
        this(16);
    }
    
    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }
    
    public boolean empty() {
        return (size == 0);
    }
    
    public int peek() {
        return (size > 0) ? elements[(size-1)] : 0;
    }
    
    public void push(int value) {
        elements[size++] = value;
    }
    
    public int pop() {
        return elements[--size];
    }
    
    public int getSize() {
        return size;
    }
}
