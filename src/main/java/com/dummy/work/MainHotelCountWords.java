package com.dummy.work;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MainHotelCountWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String[] arrayWords = words.split(" ");
        int reviews = scanner.nextInt();

        Map<Integer, String> treeMap = new TreeMap<>();
        
        
        for (int i = 0; i < reviews; i++) {
            int hotelId = scanner.nextInt();
            scanner.nextLine();
            final String textReview = scanner.nextLine(); 

            treeMap.putIfAbsent(hotelId, textReview);
            treeMap.computeIfPresent(hotelId, (num, val) -> val + " " + textReview);

        }

        scanner.close();
        
        int sum = 0;
        Map<Integer, Integer> treeMap2 = new TreeMap<>(Collections.reverseOrder());
        
        
        for (Entry<Integer, String> entry  : treeMap.entrySet()) {
            for (int i = 0; i < arrayWords.length; i++) {
                sum = sum + entry.getValue().split(arrayWords[i]).length -1;
            }
            treeMap2.put(sum, entry.getKey());
            sum = 0;
        }

        
        for (Entry<Integer, Integer> entry  : treeMap2.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        



    }

}
