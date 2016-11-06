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
public class DataCluster {
    private double orderedPairs[][];
    
    DataCluster(double[][] orderedVars){
        orderedPairs = orderedVars;
    }
    
    public MyRectangle2D getRectangle() {
        double littleX = returnSmallest(orderedPairs[0]);
        double bigX = returnBiggest(orderedPairs[0]);
        double littleY = returnSmallest(orderedPairs[1]);
        double bigY = returnBiggest(orderedPairs[1]);
        double x = middle(littleX, bigX);
        double y = middle(littleY, bigY);
        double width = size(littleX, bigX);
        double height = size(littleY, bigY);
        MyRectangle2D bounding = new MyRectangle2D(x, y, width, height);
        return bounding;
    }
        
    private double returnBiggest(double[] dblArray) {
        double rtn = dblArray[0];
        for(int i = 1; i < dblArray.length; i++) {
            if(dblArray[i] > rtn) rtn = dblArray[i];
        }
        return rtn;
    }
    private double returnSmallest(double[] dblArray) {
        double rtn = dblArray[0];
        for(int i = 1; i < dblArray.length; i++) {
            if(dblArray[i] < rtn) rtn = dblArray[i];
        }
        return rtn;
    }
    private double middle(double little, double big){
        return (little + big) / 2;
    }
    private double size(double little, double big) {
        return (big - little);
    }
    
}
