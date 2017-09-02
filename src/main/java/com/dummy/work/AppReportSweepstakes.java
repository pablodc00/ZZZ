package com.dummy.work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.util.TreeMap;

public class AppReportSweepstakes {

    @SuppressWarnings("serial")
    public static void main(String[] args) throws IOException {
        
        String cvsSplitBy = "\\|";
        

        

        BufferedReader br = null;
        String line = "";


        
        // userid sywid
        String csvUserSyw = "/home/pablodc00/a-sears-report/userid_sywid-02.csv";
        Map<String, String> userSywMap = new TreeMap<>();
        br = new BufferedReader(new FileReader(csvUserSyw));
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] lineArray = line.split(cvsSplitBy);
            userSywMap.put(lineArray[0].replaceAll(",", ""), lineArray[1].replaceAll(",", ""));
        }
        if (br != null) {
            br.close();
        }        
        
        
        // platform info
        String csvPlatformInfo = "/home/pablodc00/a-sears-report/users-info-02.csv";
        Map<String, String[]> platformInfoMap = new TreeMap<>();
        br = new BufferedReader(new FileReader(csvPlatformInfo));
        while ((line = br.readLine()) != null) {
            String[] lineArray = line.split(cvsSplitBy);
            //sywid, member number, name, email
            platformInfoMap.put(lineArray[0], lineArray);
        }
        if (br != null) {
            br.close();
        }
        
        
        //enrollment user
        String csvEnrollmentUser = "/home/pablodc00/a-sears-report/enrollmet-user-02.csv";
        Map<String, String> enrollmentUserMap = new TreeMap<>();
        br = new BufferedReader(new FileReader(csvEnrollmentUser));
        while ((line = br.readLine()) != null) {
            String[] lineArray = line.split(cvsSplitBy);
            //enrollmentid, userid
            enrollmentUserMap.put( lineArray[1], lineArray[0]);
        }
        if (br != null) {
            br.close();
        }        
      
        
        // info promotion
        String csvInfoPromotion = "/home/pablodc00/a-sears-report/last-promo-02.csv";
        Map<String, String[]> infoPromotionMap = new TreeMap<>();
        br = new BufferedReader(new FileReader(csvInfoPromotion));
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] lineArray = line.split(cvsSplitBy);
            //enrollmentid, promotionid, enrollment date
            infoPromotionMap.put( lineArray[0].replaceAll(",", ""), lineArray);
        }
        if (br != null) {
            br.close();
        }        
        

        String infoPoint3 = "/home/pablodc00/a-sears-report/info-point-2.csv";
        Writer writeInfoPoint3 = new FileWriter(infoPoint3);


        // title
        writeInfoPoint3.append("sywid|email|name|member number|entry date|promotion\n");

        
        // make report       
        userSywMap.forEach( (k,v) -> {

            //platform info
            String[] array = platformInfoMap.get(v);
            StringBuilder sb = new StringBuilder();
            sb.append(v);
            sb.append("|");
            sb.append(array[3]);
            sb.append("|");
            sb.append(array[2]);
            sb.append("|");
            sb.append(array[1]);
            sb.append("|");
            
            // promotion info
            String enrollment = enrollmentUserMap.get(k);
            array = infoPromotionMap.get(enrollment);
            sb.append(array[2]);
            sb.append("|");
            sb.append(array[1].replaceAll(",", ""));
            sb.append("\n");
            
            try {
                writeInfoPoint3.append(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        if (br != null) {
            br.close();
        }        
        
        
        writeInfoPoint3.flush();
        writeInfoPoint3.close();
        

        
        

    }

}
