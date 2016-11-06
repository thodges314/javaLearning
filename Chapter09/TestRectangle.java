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
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle[] rect = new Rectangle[2];
        rect[0] = new Rectangle(4,40);
        rect[1] = new Rectangle(3.5,35.9);
        
        for(int n=0; n<=1; n++) {
            System.out.printf("Rectangle %d has width %.1f and height %.1f.%n", 
                    (n+1), rect[n].getWidth(), rect[n].getHeight());
            System.out.printf("The area is %,.2f and the perimeter if %,.1f.%n",
                    rect[n].getArea(), rect[n].getPerimeter());
        }
    }
    
}
