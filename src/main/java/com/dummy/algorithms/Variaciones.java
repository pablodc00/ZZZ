package com.dummy.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Variaciones {

	public static void main(String[] args) {		
		List<Integer> mainList = Arrays.asList(4,1,3,2);		
		List<List<Integer>> resultList = new ArrayList<>();
		List<Integer> auxList = null;
		int j=0;
		
		for (int i = 0; i < mainList.size(); i++) {
			
			auxList = Arrays.asList(mainList.get(i));
			resultList.add(auxList);

			if (i+1 <= mainList.size()) {
				j = i+1;
				while (j < mainList.size()) {
					auxList = new ArrayList<>();
					auxList.addAll(mainList.subList(0, i+1));
					auxList.add(mainList.get(j));
					resultList.add(auxList);
					j++;
				}
				
			}
		}
		
		for (List<Integer> tempList : resultList) {
			System.out.println(tempList);
		}

	}


}
