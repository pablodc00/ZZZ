package com.dummy.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LargestRectangleHistogram {
	
	private static int max_area = 0;

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		/*
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(2);
		list.add(3);
		*/		
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		largestRectangle(list);
		System.out.println(max_area);
	}

    public static long largestRectangle(List<Integer> list) {                
        
        for (int i = 1; i <= list.size(); i++) {
            helper(list.subList(0, i));
        }     
        return max_area;
    }
    
    private static void helper(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = list.size(); i>0; i--) {
            count++;
            if (list.get(i-1) < min) {
                min = list.get(i-1);
            }
            if ((min * count) > max_area) {
                max_area = min * count;
            }
        }
    }	
	
}
