package com.dummy.work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainReportSears02 {

    @SuppressWarnings("serial")
    public static void main(String[] args) throws IOException {
        
        String cvsSplitBy = "\\|";
        
        BufferedReader br = null;
        String line = "";
        
       
        //enrollments of promo PE ID: 36998
        String fileEnrollments = "/home/pablo.dcristofaro/11-played-direct-promo.csv";
        List<String> promoEnrollments = new ArrayList<>();
        br = new BufferedReader(new FileReader(fileEnrollments));
        br.readLine();
        while ((line = br.readLine()) != null) {
            promoEnrollments.add(line.replaceAll(",", ""));
        }
        if (br != null) {
            br.close();
        }         


        //nov/dec2016        
        String sywid_yes = "/home/pablo.dcristofaro/sywid_yes.csv";
        Writer writerYes = new FileWriter(sywid_yes);
        

        String file2016 = "/home/pablo.dcristofaro/01-novdec2016.csv";
        br = new BufferedReader(new FileReader(file2016));
        br.readLine();
        while ((line = br.readLine()) != null) {
            if (promoEnrollments.contains(line.replaceAll(",", ""))) {
                writerYes.append(line.replaceAll(",", ""));
                writerYes.append("\n");
            }
        }
        if (br != null) {
            br.close();
        }        
        
        
        writerYes.flush();
        writerYes.close();

        //writerNo.flush();
        //writerNo.close();
        
        System.out.println("End");
    }
    

}
