/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;
import java.io.PrintWriter;

/**
 *
 * @author Java
 */
public class Test {
    public static void main(String[] args) throws Exception {
        PrintWriter output = new java.io.PrintWriter("temp.txt");
        output.printf("amount is %f %e\r\n", 32.32, 32.32);
        output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
        output.printf("%6b\r\n", (1>2));
        output.printf("%6s\r\n", "Java");
        output.close();
    }    
}
