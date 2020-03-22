package com.dummy.algorithms;

import java.util.Stack;

public class LargestAreaHistogram {

    public static void main(String[] args) {
        int[] hist = {2,3,1,4,5,4,2};
        int result = largestRectanglularAreaInHistogram(hist);
        System.out.println(result);
    }

    
    
    private static int largestRectanglularAreaInHistogram(int[] hist) {
        final Stack<Integer> s = new Stack<>();

        int maxArea = 0;
        int tp;
        int areaWithTop;

        int i = 0;
        while (i < hist.length) {
            if (s.empty() || hist[s.peek()] <= hist[i]) {
                s.push(i++);
            } else {
                tp = s.pop();
                int w = s.empty() ? i : i - s.peek() - 1;
                areaWithTop = hist[tp] * w;

                if (maxArea < areaWithTop)
                    maxArea = areaWithTop;
            }
        }

        while (!s.empty()) {
            tp = s.pop();
            int w = s.empty() ? i : i - s.peek() - 1;
            areaWithTop = hist[tp] * w;

            if (maxArea < areaWithTop)
                maxArea = areaWithTop;
        }

        return maxArea;
    }    
    
    
}
