package com.dummy.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RadioTransmitters {

    private static int count = 0;

    public static void main(String[] argList) {
        List<Integer> list = Arrays.asList(7, 2, 4, 6, 5, 9, 12, 11);
        //List<Integer> list = Arrays.asList(7, 2, 6, 5, 12, 11);
        Collections.sort(list);
        Integer[] intArray = list.toArray(Integer[]::new);
        //int test = Arrays.binarySearch(intArray, 8);
        //test++;
        int result = hackerlandRadioTransmitters(intArray, 4);
    }

    public static int hackerlandRadioTransmitters(Integer[] intArray, int k) {
        int tmp = 0;
        int x = 0;
        int low = 0;
        int cover = 0;

        Integer[] copiedArray = null;
        while(x < intArray.length) {
            low = Arrays.binarySearch(intArray, intArray[x] +k);
            if (low < 0) {
                copiedArray = Arrays.copyOfRange(intArray, x+1, intArray.length);
                if (intArray[x] +k <= intArray[intArray.length-1]) {
                    count++;
                    return hackerlandRadioTransmitters(copiedArray, k);
                } else {
                    x++;
                }
            } else {
                tmp = Arrays.binarySearch(intArray, intArray[low] +k);
                while (tmp < 0 && x < intArray.length) {
                    low++;
                    tmp = Arrays.binarySearch(intArray, intArray[low]);
                }
                count++;
                copiedArray = Arrays.copyOfRange(intArray, tmp, intArray.length);
                return hackerlandRadioTransmitters(copiedArray, k);
            }

        }

        return count;
    }
}
