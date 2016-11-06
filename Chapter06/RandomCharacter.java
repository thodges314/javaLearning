/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter06;

/**
 *
 * @author thodges
 */
public class RandomCharacter {
    // Generate random character between ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    
    //Generate random lower case character
    public static char getRandomLowerCaseCharacter(){
        return getRandomCharacter('a','z');
    }
    
    //Generate random upper case character
    public static char getRandomUpperChaseCharacter(){
        return getRandomCharacter('A','Z');
    }
    
    //Generate random digit character
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0','9');
    }
    
    //Generate a random character
    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000','\uFFFF');
    }
   
}
