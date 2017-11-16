package com.dummy.work;

public class MainString3 {

    public static void main(String[] args) {


        String sequence = "abcbacabfdefdeffdihjhjiijjihi";
        int size = sequence.length();


        System.out.println(sequence.substring(0, 1));
        System.out.println(sequence.substring(0, size));
        System.out.println(sequence.substring(size -1, size));

    }
}
