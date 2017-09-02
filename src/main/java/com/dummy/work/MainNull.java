package com.dummy.work;

public class MainNull {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //Long test = 10L;
        Long test = null;
        
        if (null != test) {
            System.out.println("not null");
        } else {
            System.out.println("null");
        }
            

    }

}
