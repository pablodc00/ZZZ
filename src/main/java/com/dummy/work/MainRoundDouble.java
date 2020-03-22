package com.dummy.work;

import java.math.BigDecimal;

public class MainRoundDouble {

    public static void main(String[] args) {

        String temp1 = "0.99899";
        String[] temp2 = temp1.split("[.]");
        String temp3 = temp2[1].substring(0, 3);
        
        Double toBeTruncated = new Double("0.99999");

        Double truncatedDouble = new BigDecimal(toBeTruncated)
            .setScale(3)
            .doubleValue();
        
        System.out.println(truncatedDouble);
        


    }

}
