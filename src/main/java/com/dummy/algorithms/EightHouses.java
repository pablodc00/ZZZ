package com.dummy.algorithms;

import java.util.ArrayList;
import java.util.List;

public class EightHouses {

    public static void main(String[] args) {
        int [] housesArray = {1,0, 0, 0, 0, 1, 0, 0};
        List<Integer> resultList = cellCompete(housesArray, 1);
        //int i = 1;
        //int j = 0 ^ 0;
        //System.out.println(j);

    }

    
    private static List<Integer> cellCompete(int[] cells, int k) {
       
        int n = cells.length;
        int temp[] = new int[n]; 
        for (int i = 0; i < n; i++) {
            temp[i] = cells[i];
        }
      
        List<Integer> resultList = new ArrayList<>();
        
        // Iterate for k days 
        while (k-- > 0) { 
              
            // Finding next values for corner cells 
            temp[0] = 0 ^ cells[1]; 
            temp[n - 1] = 0 ^ cells[n - 2]; 
          
            // Compute values of intermediate cells 
            // If both cells active or inactive, then  
            // temp[i]=0 else temp[i] = 1. 
            for (int i = 1; i <= n - 2; i++) 
                temp[i] = cells[i - 1] ^ cells[i + 1]; 
          
            // Copy temp[] to cells[] for next iteration 
            for (int i = 0; i < n; i++) {
                cells[i] = temp[i]; 
            }

        }
    
        for (int i = 0; i < temp.length; i++) {
            resultList.add(temp[i]);
        }
        
        return resultList;
    }
}
