package com.dummy.work;

import java.util.HashMap;
import java.util.Map;

public class MainMapLambda {

    public static void main(String[] args) {
        
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int a: A) {
            map.putIfAbsent(a, 0);
            map.computeIfPresent(a, (num, val) -> val + 1);
        }
        
        int result = map.entrySet()
            .stream()
            .filter(entry -> entry.getValue()%2 > 0)
            .findFirst()
            .get()
            .getKey();
        
        System.out.println(result);
    }

}
