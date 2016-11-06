/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09;
import java.util.Date;
/**
 *
 * @author Java
 */
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        long lapsedTime;
        for(int n = 4; n<=11; n++) {
            lapsedTime = (long) Math.pow(10, n);
            date.setTime(lapsedTime);
            System.out.printf("%,d : %s%n", lapsedTime, date.toString());
        }
    }
    
}
