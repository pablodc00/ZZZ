package com.dummy.work;

import java.time.LocalDate;
import java.util.Date;

public class Dummy {

    public static void main(String[] args) {

        Double dou1 = 10D;
        Double dou2 = 15D;
        
        Double result = dou1 * dou2;
        System.out.println(result);
        
        long date = new Date().getTime();
        System.out.println(date);

        LocalDate localDate = LocalDate.parse("nada");
        System.out.println(localDate);
    }

}
