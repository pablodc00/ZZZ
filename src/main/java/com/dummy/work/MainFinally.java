package com.dummy.work;

public class MainFinally {

    public static void main(String[] args) {
        int i = resultFinally();
        System.out.println(i);

    }

    private static int resultFinally() {
        int i=2;
        int j=1;
        try {
            //i=1;
            return j;
        } finally {
            //i=2;
            return i;
        }
    }
    
}
