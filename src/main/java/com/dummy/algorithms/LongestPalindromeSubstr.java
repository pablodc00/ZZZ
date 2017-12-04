package com.dummy.algorithms;

public class LongestPalindromeSubstr {

    public static void main(String[] args) {
        /**
        "cbbd"
        "bb"
        
        "babad"
        "bab"
        */
        
        String result; 
        result = longestPalindromeSubstr("cbbd");
        System.out.println(result);
        
        result = longestPalindromeSubstr("babad");
        System.out.println(result);


    }

    
    static String longestPalindromeSubstr(String s) {
        int n = s.length();

        boolean matrix[][] = new boolean[n][n];

        int maxLength = 1;
        for (int i = 0; i < n; i++) {
            matrix[i][i] = true;
        }

        int begin = 0;
        for (int i = 0; i < n-1; ++i) {
            if (s.charAt(i) == s.charAt(i+1)) {
                matrix[i][i+1] = true;
                begin = 1;
                maxLength = 2;
            }
        }


        for (int j = 3; j <= n; ++j) {
            for (int k = 1; k < n - j + 1; ++k) {
                int l = k + j -1;

                if (matrix[k + 1][l - 1] && s.charAt(k) == s.charAt(l)) {

                    matrix[k][l] = true;

                    if (j > maxLength) {
                        begin = k;
                        maxLength = j;
                    }
                }
            }
        }

        return s.substring(begin, begin + maxLength).toString();
    }    
    
}
