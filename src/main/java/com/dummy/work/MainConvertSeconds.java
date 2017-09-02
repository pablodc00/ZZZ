package com.dummy.work;

public class MainConvertSeconds {

    public static void main(String[] args) {
        int input = 83643;
        
        int hours = input / 3600;
        int minutes = (input % 3600) / 60;
        int seconds = (input % 3600) % 60;
   
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

    }

}
