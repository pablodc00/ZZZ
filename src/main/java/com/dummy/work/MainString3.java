package com.dummy.work;

public class MainString3 {

    public static void main(String[] args) {


        String sequence = "abcbacabfdefdeffdihjhjiijjihi";
        int size = sequence.length();


        System.out.println(sequence.substring(0, 1));
        System.out.println(sequence.substring(0, size));
        System.out.println(sequence.substring(size -1, size));

        String s1 = new String( "Test" );
        String s2 = new String( "Test" );
        
        
        System.out.println( s1 == s2 ); // false
        System.out.println( s1.equals( s2 )); // true
        
        
        System.out.println("END");
        
        
    }
}
