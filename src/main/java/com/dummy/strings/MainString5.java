package com.dummy.strings;

import java.text.NumberFormat;

public class MainString5 {

    public static void main(String[] args) {
        long points = 23456789;
        
        String sPoints = NumberFormat.getInstance().format(points);
        
        System.out.println(sPoints);

    }

}
