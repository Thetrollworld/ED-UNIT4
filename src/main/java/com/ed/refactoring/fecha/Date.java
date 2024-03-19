/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ed.refactoring.fecha;

/**
 *
 * @author elena
 * @version 1.0
 */


public class Date {

    private int day;

    private int month;

    private int year;
    
 /**
  * This is the constructor we will use for creating dates
  * @param day // shows us the day we're on.
  * @param month // show us the month we're on.
  * @param year // show us the year we're on.
  */

    public Date(int day, int month, int year) {

        this.day = day;

        this.month = month;

        this.year = year;

    }
/**
 * This method validates if the day or month is within the limits
 * @return //returns if we have or haven't inserted a valid date
 */
    public boolean validation() {

        if (day < 1 || day > 31) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

// determinamos la cantidad de días del mes:
        int daysPerMonth = 0;

        switch (month) {

            case 1:
                daysPerMonth = 31;
                break;

            case 3:
                daysPerMonth = 31;
                break;

            case 5:
                daysPerMonth = 31;
                break;

            case 7:
                daysPerMonth = 31;
                break;

            case 8:
                daysPerMonth = 31;
                break;

            case 10:
                daysPerMonth = 31;
                break;
                
            case 12:
                daysPerMonth = 31;
                break;

            case 4:
                daysPerMonth = 30;
                break;

            case 6:
                daysPerMonth = 30;
                break;

            case 9:
                daysPerMonth = 30;
                break;

            case 11:
                daysPerMonth = 30;
                break;

            case 2: // verificación de año bisiesto

                if ((year % 400 == 0)
                        || ((year % 4 == 0) && (year % 100 != 0))) {
                    daysPerMonth = 29;
                } else {
                    daysPerMonth = 28;
                }

                break;

        }

        if (day > daysPerMonth) {
            return false;
        } else {
            return true;
        }

    }

}
