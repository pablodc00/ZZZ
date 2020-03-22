package com.dummy.work;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
     
        
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }
        map.forEach((id, val) -> System.out.println(val));
        
        
        map.computeIfPresent(3, (num, val) -> val + num);
        map.get(3);             // val33

        map.computeIfPresent(9, (num, val) -> null);
        map.containsKey(9);     // false

        map.computeIfAbsent(23, num -> "val" + num);
        map.containsKey(23);    // true

        map.computeIfAbsent(3, num -> "bam");
        map.get(3);             // val33        
        
        
        /////////////////////////////////////////////
        
        int[] A = {10, 20};
        Arrays.asList(A).size();

        
        Map<Integer, String> map2 = new HashMap<>();
        int i = 10;
        map2.remove(i);
        map2.put(i, "Dummy");
        map2.entrySet().iterator().next().getValue();
        Collection values = map2.values();
    }

}
