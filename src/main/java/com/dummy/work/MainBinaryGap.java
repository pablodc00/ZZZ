package com.dummy.work;

import java.util.Arrays;
import java.util.Comparator;

public class MainBinaryGap {

    public static void main(String[] args) {

        
        String str1 = Integer.toBinaryString(5);
        
        String str2 = str1.replaceAll("1", "");
        if (str2.length() == 0) {
            System.out.println(str2.length());
            return;
        }
        
        str1 = "0000011000010001";
        
        str1 = str1.replaceFirst("^(0*)", "");
        
        StringBuilder sb = new StringBuilder(str1);
                
        str1 = sb.reverse().toString().replaceFirst("^(0*)", "");
        str2 = str1.replaceAll("1", "");
        if (str2.length() == 0) {
            System.out.println(str2.length());
            return;
        }
        
        
        String[] array1 = str1.split("1");
        
        
        

        String maxStr =  
        Arrays.asList(array1).stream()
                .filter(s -> s.contains("0"))
                .max(Comparator.comparing(String::length))
                .get();
        


        
        System.out.println(maxStr);
        
        

    }

}
