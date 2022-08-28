package com.dummy.google;

import java.util.*;

public class RecordBreacker {

    public static int numberOfRecordBreakingDays(int numberOfDays, int[] visitors) {
        int recordBreakingDays = 0;
        int max = 0;

        for (int i=0; i<visitors.length; i++) {
            if (i+1 <= visitors.length && visitors[i] > max) {
                if (i+1 == visitors.length) {
                    recordBreakingDays++;
                    continue;
                }
                if (i+1 < visitors.length && visitors[i] > visitors[i+1]) {
                    recordBreakingDays++;
                }
            }
            if (visitors[i] > max) {
                max = visitors[i];
            }
        }

        return recordBreakingDays;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // Get number of test cases in input
//        int testCaseCount = scanner.nextInt();
//        // Iterate through test cases
//        for (int tc = 1; tc <= testCaseCount; ++tc) {
//            // Get number of days for this test case
//            int numberOfDays = scanner.nextInt();
//            // Get attendance for each day
//            int[] visitorsPerDay = new int[numberOfDays];
//            for (int d = 0; d < numberOfDays; ++d) {
//                visitorsPerDay[d] = scanner.nextInt();
//            }
//            // Print results
//            int answer = numberOfRecordBreakingDays(numberOfDays, visitorsPerDay);
//            System.out.println("Case #" + tc + ": " + answer);
//        }

//        int numberOfDays = 8;
//        int[] visitorsPerDay = {1, 2, 0, 7, 2, 0, 2, 0};

        int numberOfDays = 6;
        int[] visitorsPerDay = {4, 8, 15, 16, 23, 42};

//        int numberOfDays = 9;
//        int[] visitorsPerDay = {3, 1, 4, 1, 5, 9, 2, 6, 5};

        int answer = numberOfRecordBreakingDays(numberOfDays, visitorsPerDay);
        System.out.println("Case #" + 1 + ": " + answer);
    }
}
