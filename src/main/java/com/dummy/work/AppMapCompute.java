package com.dummy.work;

//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class AppMapCompute {
 public int solution(int[] A) {
     // write your code in Java SE 8
     Map<Integer, Integer> map = new HashMap<>();

     for (int a: A) {
         map.putIfAbsent(a, 0);
         map.computeIfPresent(a, (num, val) -> val + 1);            
     }
     
     return map.entrySet()
         .stream()
         .filter(entry -> entry.getValue()%2 > 0)
         .findFirst()
         .get()
         .getKey();

 }
}