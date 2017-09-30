package com.dummy.mulesoft;

import java.util.HashMap;

public class Solution {

    public int solution(IntList L, int M) {
        // write your code in Java SE 7
        HashMap<Integer, Integer> stats = new HashMap<Integer, Integer>();
        int index = 0;
        
        while (L.next != null) {
            index++;
            stats.put(L.value, L.value);
            L = L.next;
        }
        
        if (M > index) {
            return -1;
        }
        
        int key = index + 2 - M; 
        int value = stats.get(key);
        return value;
    }
    
    
    
    public int solution(int[] A) {
        
        HashMap<Integer, Integer> summarize = new HashMap<Integer, Integer>(); 
        int result = 0;
        int maxValue = 0;
        
        Integer aux = null;
        Integer value = null;
        Integer key = null;
        for (int i = 0; i < A.length; i++) {
            key = new Integer(A[i]);
            aux = summarize.get(key);
            if (aux == null) {
               value = 1; 
            } else {
               value ++; 
            }
            if (value > maxValue) {
                maxValue = value;
                result = key;
            }            
            summarize.put(key, value);
        }
        
        
        return result;
    }    
    
}
