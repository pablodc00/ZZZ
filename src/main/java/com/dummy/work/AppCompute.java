package com.dummy.work;

import java.util.HashMap;
import java.util.Map;

public class AppCompute {

    public static void main(String[] args) {
        Map<String, Integer> dummy = new HashMap<>();
        dummy.compute("one", (k, v) -> v == null ? 1 : v + 1);
        dummy.compute("one", (k, v) -> v == null ? 1 : v + 1);
        dummy.compute("two", (k, v) -> v == null ? 1 : v + 1);
        dummy.compute("three", (k, v) -> v == null ? 1 : v + 1);
        dummy.compute("one", (k, v) -> v == null ? 1 : v + 1);
        
        System.out.println(dummy);
        

        System.out.println(dummy.getOrDefault("four", 0));
        System.out.println(dummy.getOrDefault("one", 0));
        
        
    }

}
