package com.dummy.algorithms;

import java.util.Arrays;

public class GCD {

    public static void main(String[] args) {
        //int[] arr = {2, 3, 4, 5, 6};
        //int[] arr = {2, 4, 6, 8, 10};
        int[] arr = {4, 8, 16, 20};
        int gcd = generalizedGCD(arr);
        System.out.println(gcd);

    }
    
    private static int generalizedGCD(int[] arr) {
                
        Arrays.sort(arr);        
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % arr[0]) != 0) {
                flag = false;
                break;
            } 
        }
        
        return (flag ? arr[0] : 1);
    }

}
