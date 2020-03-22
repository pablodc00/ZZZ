package com.dummy.algorithms;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

    public static void main(String[] args) {
        int[] numbers = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        //int[] numbers = {1, -3, 71, 68, 17};
        int min = minimumAbsoluteDifference(numbers);
        System.out.println(min);
        
    }
     
   public static int minimumAbsoluteDifference(int[] numbers) {
       
        Arrays.sort(numbers);

        int min = Integer.MAX_VALUE;
        int aux = 0;
        
        for (int i = 0; i < numbers.length -1; i++) {
            aux = Math.abs(numbers[i] - numbers[i+1]);
            if (aux < min) {
                min = aux;
            }
        }

        return min;
        
    }

}
