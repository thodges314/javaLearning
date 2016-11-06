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
public class TestDataCluster {
    static double orderedPairs[][];
    
    static void getValues(int i){
        //orderedPairs = new double[2][i];
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter %d ordered pairs of x,y values: ",i);
        for(int countEntry = 0; countEntry < i; countEntry++){
            for(int countXY = 0; countXY < 2; countXY++){
                orderedPairs[countXY][countEntry] = input.nextDouble();
            }
        }       
    }
    public static void main(String[] args) {
        int i = 5;
        orderedPairs = new double[2][i];
        getValues(i);
        MyRectangle2D boundingRectangle = 
                new DataCluster(orderedPairs).getRectangle();
        System.out.printf("The bounding rectangle's center (%.2f, %.2f), ",
                boundingRectangle.getX(), boundingRectangle.getY());
        System.out.printf("width %.1f, height %.1f.%n",
                boundingRectangle.getWidth(), boundingRectangle.getHeight());
    }
    
}
