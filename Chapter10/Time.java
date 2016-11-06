/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author Java
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    private GregorianCalendar cal;
    
    Time() {
        cal = new GregorianCalendar();
        SetInstanceTime(cal);
 //       hour = cal.get(cal.HOUR_OF_DAY);
 //       minute = cal.get(cal.MINUTE);
 //       second = cal.get(cal.SECOND);
    }
    Time(long milli) {
        setTime(milli);
    }
    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
      public void setTime(long elapseTime) {
        cal = new GregorianCalendar();
        cal.setTimeInMillis(elapseTime);
        SetInstanceTime(cal);
      }
      private void SetInstanceTime(GregorianCalendar cal) {
        this.hour = cal.get(cal.HOUR_OF_DAY);
        this.minute = cal.get(cal.MINUTE);
        this.second = cal.get(cal.SECOND);
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    } 
}
