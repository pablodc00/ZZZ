package com.dummy.teksystem.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test2 {


    
    public static void main(String[] args) {
        
        ParentA obj = new ChildB();
        
        //Number i = new Serializable();
        
        //meth(args);
        
        // TODO Auto-generated method stub
        //int x = 5;
        //x = x >> 1;
        //x = ~x;
        //x += 3;
        
        String str1 = "My String";
        String str2 = new String("My String");
        
        //System.out.println(str1 == str2);
        //System.out.println(str1.hashCode() == str2.hashCode());
        //System.out.println(String.parse(str1) == str2);
        //System.out.println(str1.matches(str2));
        //System.out.println(str1.equals(str2));
        
        
        int i = 1;
        int j = 2;
        if (i == j) {};
    }

    
    public void meth(String[] args) {
        System.out.println(args);
        System.out.println(args[1]);
    }
    
    public void writeFile() {
        Path inputFile = Paths.get("input.txt");
        Path outputFile = Paths.get("output.txt");
        
        BufferedReader reader;
        try {
            reader = Files.newBufferedReader(inputFile, Charset.defaultCharset());
            BufferedWriter writer = Files.newBufferedWriter(outputFile, Charset.defaultCharset());
            String lineFromFile = "";
            while ((lineFromFile = reader.readLine()) != null) {
                writer.append(lineFromFile);
            }            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
        
    }
}
