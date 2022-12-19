package com.dummy.google;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gbus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the number of test cases.
        int t = scanner.nextInt();
        for (int caseIndex = 1; caseIndex <= t; caseIndex++) {
            // Read the GBus specifications.
            int n = scanner.nextInt();
            GBus[] gBuses = new GBus[n];
            for (int i = 0; i < n; i++) {
                gBuses[i] = new GBus(scanner.nextInt(), scanner.nextInt());
            }
            // Read the city set P.
            int p = scanner.nextInt();
            int[] cities = new int[p];
            for (int i = 0; i < p; i++) {
                cities[i] = scanner.nextInt();
            }
            // Solve the test case.
            int[] counts = countBuses(gBuses, cities);
            // Format the output.
            StringBuffer countStringBuffer = new StringBuffer();
            for (int count : counts) {
                countStringBuffer.append(" " + count);
            }
            System.out.println("Case #" + caseIndex + ":" + countStringBuffer);
        }

//        List<GBus> gBuses = new ArrayList<>();
//        gBuses.add(new GBus(15,25));
//        gBuses.add(new GBus(30,35));
//        gBuses.add(new GBus(45,50));
//        gBuses.add(new GBus(10,20));
//
//        int[] cities = {15, 25};
//        int[] counts = countBuses(gBuses.stream().toArray(GBus[]::new), cities);
//
//
//        StringBuffer countStringBuffer = new StringBuffer();
//        for (int count : counts) {
//            countStringBuffer.append(" " + count);
//        }
//        System.out.println("Case #1:" + countStringBuffer);

    }

    /** Calculates how many GBuses serve each city. */
    static int[] countBuses(GBus[] gBuses, int[] cities) {
        // TODO(you): Implement this method to return an array of the number of buses serving each city.
        int count;
        int[] result = new int[cities.length];

        for (int i=0; i<cities.length; i++) {
            count = 0;
            for (int j=0; j< gBuses.length; j++) {
                if (cities[i] >= gBuses[j].a && cities[i] <= gBuses[j].b ) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }

    /** Specifies the endpoints of a GBus route: the GBus serves cities A through B. */
    private static class GBus {
        /** Represents city A. */
        int a;
        /** Represents city B. */
        int b;

        GBus(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }


}
