package com.dummy.barclays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class MainString3 {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      int x = 1;
      StringBuilder sb = new StringBuilder();
      char[] arrayChar = line.toCharArray();
      for (char item : arrayChar) {
        if (!Character.isWhitespace(item)) {
          if ( (x & 1) == 0 ) {
            item = Character.toLowerCase(item);
          } else { 
            item = Character.toUpperCase(item);
          }
        } else {
            x++;
        }
        sb.append(item);
        x++;
      }
      System.out.println(sb);
    }
  }
}