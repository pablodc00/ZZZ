package com.dummy.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {

    public static void main(String[] argList) {

        String sequence = "abcbacabfdefdeffdihjhjiijjihi";

        //System.out.println(sequence.substring(1, 2));

        int size = sequence.length();
        //System.out.println(size);
        //System.out.println(sequence.substring(1, size));
        List<String> listSubsequences = new ArrayList<>();


        String subsequence = "";
        boolean flag = true;

        String current;
        String subCurrent;
        int count = 0;

        for (int i = 0; i < size; i++) {
            current = sequence.substring(i, i+1);
            if (subsequence.contains(current) || subsequence.length()==0) {
                subsequence = subsequence + current;
                count++;
            } else if (subsequence.length() > 0) {
                for (int j = 0; j < subsequence.length(); j++) {
                    subCurrent = subsequence.substring(j, j+1);
                    if (sequence.substring(i+1, size).contains(subCurrent)) {
                        flag=false;
                        break;
                    }
                }
                if (flag) {
                    listSubsequences.add(subsequence);
                    count=0;
                    subsequence = "";
                } else {
                    subsequence = subsequence + current;
                    count++;
                }
                flag=true;
            }
        }

        listSubsequences.add(subsequence);

        System.out.println("END");


    }
}
