package com.dummy.barclays;

import java.io.IOException;

public class MainBalancedEmoticosFB {

    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        //InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        //BufferedReader in = new BufferedReader(reader);

        String output;
        String line = ")(";

        output = "YES";
        String s = line.replaceAll("[^:\\(\\)]", "");

        for (int i = 0; i < s.length() / 2; i++) {
            String lead = "";
            String trail = "";
            if (s.charAt(i) == '(' && s.charAt(s.length() - i - 1) == ')') {
                if (i > 0) {
                    lead = s.substring(0, i);
                    trail = s.substring(s.length() - i, s.length());
                }
                s = lead + s.substring(i + 1, s.length() - i - 1) + trail;
                --i;
            }
        }
        s = s.replaceAll(":\\(", "");
        s = s.replaceAll(":\\)", "");

        for (int i = 0; i < s.length(); i++) {  
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                output = "NO";
            }
        }

        

        System.out.println(output);

    }

}
