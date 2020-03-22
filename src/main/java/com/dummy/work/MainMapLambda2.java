package com.dummy.work;

import java.util.Arrays;

public class MainMapLambda2 {

    public static void main(String[] args) {
        
        String[] myArray = { "this", "is", "a", "sentence" };
        String result = Arrays.stream(myArray)
                .reduce("", (a,b) -> a + b);
        
        System.out.println(result);
    }

}
