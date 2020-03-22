package com.dummy.work;

import java.time.LocalDate;
import java.util.Date;

public class Dummy {
    
    private static final Integer LOAN_TERMS = 36;

    public static void main(String[] args) {
        /*
        Double dou1 = 10D;
        Double dou2 = 15D;
        
        Double result = dou1 * dou2;
        System.out.println(result);
        
        long date = new Date().getTime();
        System.out.println(date);

        LocalDate localDate = LocalDate.parse("nada");
        System.out.println(localDate);
        */
        
        double rate = 0.07;
        int loanAmount = 1000;
        double monthlyRepayment = calculateRepayment(rate, loanAmount);
        System.out.println(monthlyRepayment);
        System.out.println(monthlyRepayment * LOAN_TERMS);

    }

    
    private static Double calculateRepayment(Double rate, Integer loanAmount) {
        double monthlyRate = rate / 12;
        double cacheCalc = Math.pow(1 + monthlyRate, LOAN_TERMS);
        double repayment = loanAmount *
                ( monthlyRate * cacheCalc / (cacheCalc - 1) );
        return repayment;
}    
    
}
