package com.dummy.work;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.joda.time.DateTime;

public class Main8Date {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(new DateTime(date.getTime()).toDateMidnight().toDate());
        
        
        Date date1 = new Date(2016, 12, 20, 15, 05, 20);
        Date date2 = new Date(2016, 12, 20, 15, 05, 21);
        
        System.out.println(date1.compareTo(date2));
        
        System.out.println(date1);
        //Date date2 = Date.valueOf(LocalDateTime.now());
        //System.out.println(date2);
        
        
        //Instant instant1 = date1.toInstant();
        LocalDate localDate1 = Instant.ofEpochMilli(date1.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate1);
        
        LocalDate localDate2 = Instant.ofEpochMilli(date2.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate2);
        
        System.out.println(localDate1.compareTo(localDate2));
        
    }

}
