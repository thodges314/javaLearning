/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09;
import java.util.GregorianCalendar;
/**
 *
 * @author Java
 */
public class TestGregorian {
    public static void main(String[] args){
        GregorianCalendar greg = new GregorianCalendar();
        System.out.printf("%d/%d/%d%n", greg.get(greg.MONTH),
                greg.get(greg.DAY_OF_MONTH), greg.get(greg.YEAR));
        greg.setTimeInMillis(1234567898765L);
        System.out.printf("%d/%d/%d%n", greg.get(greg.MONTH),
                greg.get(greg.DAY_OF_MONTH), greg.get(greg.YEAR));        
    }
    
}
