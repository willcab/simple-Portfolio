/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;

import java.util.Collection;
import java.lang.Math;
import java.util.Calendar;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ghost
 */
public class Portfolio {

    Collection<Stocks> collStock; //the collection

    // returns the profit annualized of the Portfolio between those dates. 
    public Double Profit(Date first, Date last) {
        Double valueinit = 0.0;
        Double valuefnl = 0.0;
        int years = getDiffYears(first, last);
        for (Stocks stock : collStock) {
            valueinit += stock.price(first);
            valuefnl += stock.price(last);
        }
        return (Math.pow((valuefnl - valueinit), (1 / (years))) - 1) * 100;
    }
    //return years between the given dates
    public int getDiffYears(Date first, Date last) {
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int diff = b.get(YEAR) - a.get(YEAR);
        if (a.get(MONTH) > b.get(MONTH)
                || (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
            diff--;
        }
        return diff;
    }

    public Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }
}
