package com.dummy.work;

import java.util.Arrays;
import java.util.Scanner;

public class MainSumArrayBigNumbers {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int amountOfNumbers = sc.nextInt();
        sc.nextLine();
        String numbers = sc.nextLine();
        
        String[] numbersArray = numbers.split(" ");
        long result = Arrays.stream(numbersArray)
            .mapToLong(number -> Long.parseLong(number))
            .sum();
            
        
        System.out.println(result);

    }

}
