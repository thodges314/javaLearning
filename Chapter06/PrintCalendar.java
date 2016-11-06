/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter06;

import java.util.Scanner;

/**
 *
 * @author thodges
 */
public class PrintCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //prompt user for year
        System.out.print("Enter the full year: ");
        int year = input.nextInt();
        
        //prompt user to enter month
        System.out.print("Enter a month as an integer: ");
        int month = input.nextInt();
        
        //print full calendar
        printMonth(year, month);
    }
    
    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }
    
    public static void printMonthTitle(int year, int month) {
        System.out.println("   " + getMonthName(month) + "   " + year);
        System.out.println("+---------------------------+");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
    
    public static String getMonthName( int month ) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }
        return monthName;
    }
    
    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
        
        //pad space before first day of month
        int i;
        for(i = 0; i < startDay; i++)
            System.out.print("    ");
        
        for(i = 1; i<= numberOfDaysInMonth; i++) {
            System.out.printf("%4d",i);
            
            if((i + startDay) % 7 == 0)
                System.out.println("");
        }
        System.out.println();
    }
    
    //get the start day of month/year
    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        
        int totalNumberOfDays = getTotalNumberOfDays(year,month);
        
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }
    
    //get total number of days since Jan 1 1800
    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        
        for (int i = 1800; i<year; i++)
        if (isLeapYear(i))
            total = total + 366;
        else
            total = total + 365;
        
        for (int i = 1; i < month; i++)
            total = total + getNumberOfDaysInMonth(year, i);
        
        return total;
    }
    
    //get number of days in a month
    public static int getNumberOfDaysInMonth(int year, int month) {
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
                month == 10 || month == 12) return 31;
        if(month == 4 || month == 6 || month == 9 || month == 11) return 30;
        if (month == 2) return (isLeapYear(year) ? 29:28);
        return 0;
    }
    
    //determine if leap year
    public static boolean isLeapYear(int year) {
        return year % 400 == 0|| (year % 4 == 0 && year % 100 != 0);
    }
    
}
