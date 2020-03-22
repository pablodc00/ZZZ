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

public class MainReportSears03 {

    @SuppressWarnings("serial")
    public static void main(String[] args) throws IOException {
        
        String cvsSplitBy = "\\|";
        
        BufferedReader br = null;
        String line = "";
        
        
        //enrollments of promo PE ID: 36998
        String fileEnrollments = "/home/pablo.dcristofaro/03-enrollments-in-promo.csv";
        List<String> promoEnrollments = new ArrayList<>();
        br = new BufferedReader(new FileReader(fileEnrollments));
        br.readLine();
        while ((line = br.readLine()) != null) {
            promoEnrollments.add(line.replaceAll(",", ""));
        }
        if (br != null) {
            br.close();
        }         

        
        
        
        //2017
        Map<String, List<String>> mapUserEnrollments = new TreeMap<>();
        Map<String, String> mapUserSywid = new TreeMap<>();
        String file2017;
        
        
        System.out.println("start 04");
        file2017 = "/home/pablo.dcristofaro/04.csv";
        br = new BufferedReader(new FileReader(file2017));
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] array2017 = line.split(cvsSplitBy);

            mapUserEnrollments.putIfAbsent(array2017[1].replaceAll(",", ""), new ArrayList<>());
            mapUserEnrollments.get(array2017[1].replaceAll(",", "")).add(array2017[0].replaceAll(",", ""));
            
            mapUserSywid.putIfAbsent(array2017[1].replaceAll(",", ""), array2017[2].replaceAll(",", ""));
        }
        if (br != null) {
            br.close();
        }
        System.out.println("end 04");

/*       
        file2017 = "/home/pablo.dcristofaro/02.csv";
        br = new BufferedReader(new FileReader(file2017));
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] array2017 = line.split(cvsSplitBy);

            mapUserEnrollments.putIfAbsent(array2017[1].replaceAll(",", ""), new ArrayList<>());
            mapUserEnrollments.get(array2017[1].replaceAll(",", "")).add(array2017[0].replaceAll(",", ""));
            
            mapUserSywid.putIfAbsent(array2017[1].replaceAll(",", ""), array2017[2].replaceAll(",", ""));
        }
        if (br != null) {
            br.close();
        }        
        
        
        file2017 = "/home/pablo.dcristofaro/03.csv";
        br = new BufferedReader(new FileReader(file2017));
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] array2017 = line.split(cvsSplitBy);

            mapUserEnrollments.putIfAbsent(array2017[1].replaceAll(",", ""), new ArrayList<>());
            mapUserEnrollments.get(array2017[1].replaceAll(",", "")).add(array2017[0].replaceAll(",", ""));
            
            mapUserSywid.putIfAbsent(array2017[1].replaceAll(",", ""), array2017[2].replaceAll(",", ""));
        }
        if (br != null) {
            br.close();
        }          
        
       
        file2017 = "/home/pablo.dcristofaro/01.csv";
        br = new BufferedReader(new FileReader(file2017));
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] array2017 = line.split(cvsSplitBy);

            mapUserEnrollments.putIfAbsent(array2017[1].replaceAll(",", ""), new ArrayList<>());
            mapUserEnrollments.get(array2017[1].replaceAll(",", "")).add(array2017[0].replaceAll(",", ""));
            
            mapUserSywid.putIfAbsent(array2017[1].replaceAll(",", ""), array2017[2].replaceAll(",", ""));
        }
        if (br != null) {
            br.close();
        }          
*/ 
        
        //nov/dec2016        
        String sywid_yes = "/home/pablo.dcristofaro/sywid_yes_01.csv";
        Writer writerYes = new FileWriter(sywid_yes);
        
        String sywid_no = "/home/pablo.dcristofaro/sywid_no_02.csv";
        Writer writerNo = new FileWriter(sywid_no);
        
        List<String> workList;
        String workValue;
        
        String file2016 = "/home/pablo.dcristofaro/01-novdec2016.csv";
        br = new BufferedReader(new FileReader(file2016));
        br.readLine();
        while ((line = br.readLine()) != null) {
            // de los que jugaron en nov/dec/2016 me fijo si tienen enrollement en jan/apr/2017
            workList = mapUserEnrollments.get(line.replaceAll(",", ""));
            // si jugaron en 2017 me fijo si jugaron la promo PE ID: 36998 o no            
            if (null != workList) {
                // si tienen un solo enrollment y jugaron la promo
                if (workList.size() == 1 && promoEnrollments.contains(workList.get(0))) {
                    writerYes.append(mapUserSywid.get(line.replaceAll(",", "")));
                    writerYes.append("\n");
                } else if (workList.size() > 1) {
                    // si tienen mas de un enrollment pero el primer enrollment fue la promo PE ID: 36998
                    workValue = workList.stream().mapToLong(i -> Long.parseLong(i)).min().toString();
                    if (promoEnrollments.contains(workValue)) {
                        writerYes.append(mapUserSywid.get(line.replaceAll(",", "")));
                        writerYes.append("\n");
                    // si jugaron la promo pero el primer enrollment no fue la promo PE ID: 36998
                    } else {
                        writerNo.append(mapUserSywid.get(line.replaceAll(",", "")));
                        writerNo.append("\n");
                    }
                    
                 // si no jugaron la promo PE ID: 36998    
                } else {
                    writerNo.append(mapUserSywid.get(line.replaceAll(",", "")));
                    writerNo.append("\n");
                }
            }
        }
        if (br != null) {
            br.close();
        }        
        
        
        writerYes.flush();
        writerYes.close();

        writerNo.flush();
        writerNo.close();
        
        System.out.println("End");
    }
    

}
