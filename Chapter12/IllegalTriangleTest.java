/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;
import java.util.*;

/**
 *
 * @author Java
 */
public class IllegalTriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter triangle sides: ");
                double s1 = input.nextDouble();
                double s2 = input.nextDouble();
                double s3 = input.nextDouble();
            
                TriangleMakesException triangle = new
                    TriangleMakesException(s1, s2, s3);
                System.out.println("Triangle area is " + triangle.getArea() +
                        ".");
            }
            catch (IllegalTriangleException | NullPointerException ex) {
                System.out.println("That is not a valid triangle.");
            }
            catch (InputMismatchException ex) {
                System.out.println("That is not a valid triangle.");
                input.next();
                input.next();
                input.next();
            }
        }
    }
    
}
