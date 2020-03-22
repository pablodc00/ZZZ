package com.dummy.work;

import java.util.HashMap;
import java.util.Map;

public class Main3MapCompute {

    public static void main(String[] args) {

        Map<String, Integer> mymap = new HashMap<>();
        
        /*
        mymap.compute("A", (k, v) -> v == null ? 1 : v + 1);
        mymap.compute("B", (k, v) -> v == null ? 1 : v + 1);
        mymap.compute("A", (k, v) -> v == null ? 1 : v + 1);
        mymap.compute("A", (k, v) -> v == null ? 1 : v + 1);
        mymap.compute("C", (k, v) -> v == null ? 1 : v + 1);
        System.out.println(mymap);
        */
        
        mymap.put("A", 10);
        mymap.put("A", 50);
        System.out.println(mymap);
        
   
  
/*
        Map<String, String> mymap2 = new HashMap<>();
        mymap2.putIfAbsent("A", "B");
        mymap2.putIfAbsent("A", "C");
        System.out.println(mymap2);
*/        
        
        //Map<String, Integer> mymap = new HashMap<>();
        //mymap.putIfAbsent("A", 1);
        //mymap.putIfAbsent("A", 1);
        //mymap.putIfAbsent("B", 0);
        //mymap.putIfAbsent("C", 0);
        //System.out.println(mymap);
        
        
        //mymap.computeIfPresent("A", v -> v + 1);
        

        
        //mymap.compute("A", (k, v) -> v + 1);
        //mymap.compute("B", (k, v) -> v + 1);
        //mymap.compute("A", (k, v) -> v + 1);
        //mymap.compute("A", (k, v) -> v + 1);
        //mymap.compute("C", (k, v) -> v + 1);
        //System.out.println(mymap);

    }

}
