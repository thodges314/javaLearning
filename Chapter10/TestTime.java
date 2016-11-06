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
public class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        
        System.out.printf("%2d:%02d:%02d%n", time1.getHour(), time1.getMinute(), 
                time1.getSecond());
//        System.out.println("");
        System.out.printf("%2d:%02d:%02d%n", time2.getHour(), time2.getMinute(), 
                time2.getSecond());
    }
    
}
