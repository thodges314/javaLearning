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
public class TestRemove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Long string: ");
        String lString = input.nextLine();
        System.out.print("Remove: ");
        String rString = input.nextLine();
        String safeRString = (" " + rString + " ");
        System.out.println(lString.replace(safeRString, "  "));
        
    }
}
