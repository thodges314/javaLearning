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
public class Test {
    public static void main(String[] args) {
        System.out.println("Hi, ABC, good".matches("ABC "));    //false
        System.out.println("Hi, ABC, good".matches(".*ABC.*")); //trye
        System.out.println("A,B;C".replaceAll(",;","#"));       //not working
        System.out.println("A,B;C".replaceAll("[,;]","#"));     //works
        
        String[] tokens = "A,B;C".split("[,;]");                //works
        for (int i=0; i<tokens.length; i++)
            System.out.print(tokens[i]+" ");
        System.out.println("\n");
        
        
        String s = "Hi, Good Morning!";
        System.out.println(m(s));
        
    }
    
    public static int m(String s) {
        int count = 0;
        for (int i=0; i<s.length(); i++)
            if(Character.isUpperCase(s.charAt(i)))
                count ++;
        return count;
    }
    
}
