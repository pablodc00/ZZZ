package com.dummy.google;

import java.util.Scanner;


public class Sherlock {

    static int countPairs(int a, int b, long n, int k) {
        int pairs = 0;
        // TODO: Add logic to count the number of pairs modulo 10^9+7 (1000000007)
        for (int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if (i!=j) {
                    if ( isDivisibleBy( (Math.pow(i,a) + Math.pow(j,b)), k ) ) {
                        pairs++;
                    }
                }
            }
        }
        return pairs;
    }

    static boolean isDivisibleBy(double number, int target) {
        return number % target == 0;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the number of test cases.
        int testCaseCount = scanner.nextInt();
        for (int caseIndex = 1; caseIndex <= testCaseCount; caseIndex++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            long n = scanner.nextLong();
            int k = scanner.nextInt();

            int pairs = countPairs(a, b, n, k);
            System.out.println("Case #" + caseIndex + ": " + pairs);
        }

        //int pairs = countPairs(1, 1, 5, 3);
//        int pairs = countPairs(1, 1, 2, 2);
//        System.out.println("Case #1: " + pairs);

    }
}
