package com.dummy.teksystem.test;

import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] argList) {
        StringBuilder str = new StringBuilder();
        for (String arg : argList) {
            if (str.indexOf(arg) < 1) {
                str.append(arg+" ");
            }
        }
        System.out.println(str.toString());
        Scanner sc = new Scanner(str.toString());
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                System.out.println(sc.nextInt() + " ");
            } else {
                sc.next();
            }
        }
    }
}
