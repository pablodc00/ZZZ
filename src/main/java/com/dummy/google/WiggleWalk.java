package com.dummy.google;

import java.io.*;
import java.util.*;

public class WiggleWalk {

    private static int[] endPosition(int N, int R, int C, int Srr, int Scc, String instructions) {
        // TODO: implement this method to return the row and column where the robot
        // finishes.
        boolean visited[][] = new boolean[R][C];
        int Sr = Srr-1;
        int Sc = Scc -1;
        visited[Sr][Sc] = true;
        boolean flag;

        String inst;
        for (int i=0; i<instructions.length(); i++) {
            inst = instructions.substring(i, i+1);
            flag = true;
            if (inst.equals("N")) {
                while (flag) {
                    if (visited[Sr][Sc]) {
                        Sr--;
                    } else {
                        visited[Sr][Sc] = true;
                        flag = false;
                    }
                }
            } else if (inst.equals("S")) {
                while (flag) {
                    if (visited[Sr][Sc]) {
                        Sr++;
                    } else {
                        visited[Sr][Sc] = true;
                        flag = false;
                    }
                }
            } else if (inst.equals("E")) {
                while (flag) {
                    if (visited[Sr][Sc]) {
                        Sc++;
                    } else {
                        visited[Sr][Sc] = true;
                        flag = false;
                    }
                }
            } else if (inst.equals("W")) {
                while (flag) {
                    if (visited[Sr][Sc]) {
                        Sc--;
                    } else {
                        visited[Sr][Sc] = true;
                        flag = false;
                    }
                }
            }
        }

        return new int[] {Sr +1, Sc +1};
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int t = 1; t <= T; ++t) {
            int N = in.nextInt();
            int R = in.nextInt();
            int C = in.nextInt();
            int Sr = in.nextInt();
            int Sc = in.nextInt();
            String instructions = in.next();
            int[] ans = endPosition(N, R, C, Sr, Sc, instructions);
            System.out.println("Case #" + t + ": " + ans[0] + " " + ans[1]);
        }

//        String instructions = "EEWNS";
//        int[] ans = endPosition(5, 3, 6, 2, 3, instructions);
//        System.out.println("Case #1: " + ans[0] + " " + ans[1]);

//        String instructions = "NEESSWWNESE";
//        int[] ans = endPosition(11, 5, 8, 3, 4, instructions);
//        System.out.println("Case #1: " + ans[0] + " " + ans[1]);

    }
}
