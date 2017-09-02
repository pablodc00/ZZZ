package com.dummy.work;

import java.text.NumberFormat;

public class Main4Strings {

    public static void main(String[] args) {
        long points = 23456789;
        
        String sPoints = NumberFormat.getInstance().format(points);
        
        System.out.println(sPoints);

    }

}
