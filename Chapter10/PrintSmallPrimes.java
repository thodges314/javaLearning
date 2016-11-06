/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;
import java.util.Scanner;

/**
 *
 * @author Java
 */
public class PrintSmallPrimes {
    private static int NextFactor(int n){
        int factor = n;
        if(n>2) {
            for(int i = 2; i<n; i++){
                if(n%i==0){
                    factor = i;
                    break;
                }
            }
        }
        return factor;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackOfIntegers stack = new StackOfIntegers();
        System.out.print("What integer shall I factor? ");
        int numberToFactor = scanner.nextInt();
        int currentFactor;
        while(numberToFactor != 1) {
            currentFactor = NextFactor(numberToFactor);
            numberToFactor /= currentFactor;
            stack.push(currentFactor);
        }
        int howManyToPrint = stack.getSize();
        for(int currentEntry = howManyToPrint; currentEntry >=1; currentEntry--)
        {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
