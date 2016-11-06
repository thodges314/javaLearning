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
public class TestRandomCharacter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;
        
        //Print random characters between 'a' and 'z', 25 per line
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = RandomCharacter.getRandomLowerCaseCharacter();
            if((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
    
}
