package com.dummy.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Amazon01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public List<List<Integer>> optimalUtilization(
            int deviceCapacity, 
        List<List<Integer>> foregroundAppList, 
        List<List<Integer>> backgroundAppList) {
        
        List<Integer> listForegroundApp = new ArrayList<>();
        Map<Integer, Integer> mapForegroundApp = new HashMap<>();
        
        List<Integer> listBackgroundApp = new ArrayList<>();
        Map<Integer, Integer> mapBackgroundApp = new HashMap<>();
        
        
        for (List<Integer> fga : foregroundAppList) {
            listForegroundApp.add(fga.get(1));
            mapForegroundApp.put(fga.get(1), fga.get(0));
        }
        Collections.sort(listForegroundApp, Collections.reverseOrder());
        

        for (List<Integer> bga : backgroundAppList) {
            listBackgroundApp.add(bga.get(1));
            mapBackgroundApp.put(bga.get(1), bga.get(0));
        }
        Collections.sort(listBackgroundApp, Collections.reverseOrder());
        
        
        List<List<Integer>> finalList = new ArrayList<>();
        
        
        int great = 0;
        int aux = 0;
        for (Iterator iteratorf = listForegroundApp.iterator(); iteratorf.hasNext();) {
            Integer fga = (Integer) iteratorf.next();
            if (fga.intValue()  < deviceCapacity) {
                for (Iterator iteratorb = listBackgroundApp.iterator(); iteratorb.hasNext();) {
                    Integer bga = (Integer) iteratorb.next();
                    if (bga.intValue()  < deviceCapacity) {
                        aux = fga.intValue() + bga.intValue();
                        if (aux <= deviceCapacity && aux >= great  ) {
                            great = aux;
                            finalList.add(
                                    Arrays.asList( new Integer[] { mapForegroundApp.get(fga), mapBackgroundApp.get(bga) }  )
                                    );
                        }
                    }
                }
            }
            
        } 

        return finalList;
        
        
    }
    
    
    public List<List<Integer>> closetXdestinations(int numDestinations, List<List<Integer>> allLocations, int numDeliveries) {
        
        Map<Integer, List<Integer>> mapLocations = new HashMap<>();
        List<Integer> allDistances = new ArrayList<>(); 
        
        int distance = 0;
        for (List<Integer> location : allLocations) {
            distance = calculateDistance(location);
            allDistances.add(distance);
            mapLocations.put(distance, location);
        }
        
        Collections.sort(allDistances);
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < numDeliveries; i++) {
            finalList.add(mapLocations.get(allDistances.get(i)));
        }
        return finalList;
        
    }
    
    private int calculateDistance(List<Integer> location) {
        return (int) (Math.pow(location.get(0), 2) + Math.pow(location.get(1), 2)); 
    }
}


