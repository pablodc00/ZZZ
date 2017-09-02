package com.dummy.work;

import java.util.concurrent.atomic.AtomicInteger;

public class MainString {

    public static void main(String[] args) {
        
        
        AtomicInteger ai = new AtomicInteger(10);
        ai.toString();
        

        String s = "aaaa|bbbb|cccc|ddddd";
        
        int index = s.indexOf("|");

        s.substring(1);
        
        s = s.substring(index+1);
        
        System.out.println(index);
        System.out.println(s);
        
        
        String s2 = "AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7";
        String[] array2 = s2.split("[\\s]*,[\\s]*");
        String[] array = s2.split(",");
        
        System.out.println(array[1].length());
        System.out.println(array2[1].length());
        
        System.out.println(s2);
        
        
        String s3 = "ABC";
        String s4 = s3.substring(0, 1);
        s4 = s3.substring(1, 2);
        s4 = s3.substring(2);

        System.out.println(s3);

    }

}
