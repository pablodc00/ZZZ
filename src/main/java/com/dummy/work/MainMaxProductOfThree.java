package com.dummy.work;

import java.util.Arrays;

public class MainMaxProductOfThree {

    public static void main(String[] args) {
        //int[] A = {-3, 1, 2, -2, 5, 6};
        int[] A = {-5, 5, -5, 4};

        Arrays.sort(A);
        
        int result = 0;
        int N = A.length;

        //return result;
        result =  Math.max(A[0] * A[1] * A[N-1], A[N-3] * A[N-2] * A[N-1]);
        
        int val = result;
        System.out.println(val);
    }
    


}
