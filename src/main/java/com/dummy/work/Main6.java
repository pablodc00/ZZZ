package com.dummy.work;

public class Main6 {

    public static void main(String[] args) {
        String s = "";
        
        StringBuffer sb1 = new StringBuffer("Hi");
        StringBuffer sb2 = new StringBuffer("Hi");
        StringBuffer sb3 = new StringBuffer(sb2);
        StringBuffer sb4 = sb3;
        
        if(sb1.equals(sb2)) s += "1";
        if(sb2.equals(sb3)) s += "2";
        if(sb3.equals(sb4)) s += "3";
        
            
        String s1 = "Hi";
        String s2 = "Hi";
        String s3 = s2;
        
        if(s1.equals(s2)) s += "4";
        if(s2.equals(s3)) s += "5";
        
        System.out.println(s);

    }

}
