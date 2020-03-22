package com.dummy.work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {

    private static List<Integer> visited = new ArrayList<>();
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        //int amountOfTestCases = sc.nextInt();
        int amountOfTestCases = 1;
        String result;
        
        for (int i=0; i<amountOfTestCases; i++) {
            
            //n = sc.nextInt();
            //m = sc.nextInt();
            
            n = 6;
            m = 3;
            
            if (2 > n || n > 100) {
                System.out.println("NO");
                continue;
            }
            if (0 > m || m > 100) {
                System.out.println("NO");
                continue;
            }

            
            int[] cerosAndUnos = new int[n];
            String[] cerosAndUnosStr = new String[n];
//            for (int j=0; j<n; j++) {
//                cerosAndUnos[j] = sc.nextInt();
//            }

            String array = "0 0 1 1 1 0";
            cerosAndUnosStr = array.split(" ");
            
            for(int j = 0; j < cerosAndUnosStr.length; j++) {
                cerosAndUnos[j] = Integer.parseInt(cerosAndUnosStr[j]);
            }

            visited.clear();
            result = validate(cerosAndUnos, m, 0) ? "YES" : "NO";
            System.out.println(result);
        }
        sc.close();

    }
    
    private static boolean validate(int[] cerosAndUnos, int m, int current)  {

        boolean result = true;
        
        if (current < 0) {
            return false;
        }
        
        if (visited.contains(current)) {
            return false;
        } else {
            visited.add(current);
        }
        
        if (cerosAndUnos[current] == 1) {
            return false;
        }
        
        if ((current == cerosAndUnos.length - 1) || current + m > cerosAndUnos.length - 1) {
            return true;
        }        
        
        return validate(cerosAndUnos, m, current +1) || validate(cerosAndUnos, m, current -1) || validate(cerosAndUnos, m, current +m); 


    }
}
