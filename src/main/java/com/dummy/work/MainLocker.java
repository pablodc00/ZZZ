package com.dummy.work;

public class MainLocker {

    public static void main(String[] args) {
        
        int cityLength = 5; 
        int cityWidth = 7; 
        int[] lockerXCoordinates = {2, 4}; 
        int[] lockerYCoordinates = {3, 7};
        

        
        int[][] result = new int[cityLength][cityWidth];
        int aux = 0;
        int current = 0;
        for (int i=0; i<cityWidth; i++) {            
            for (int j=0; j<cityLength; j++) {
                aux = 1000;
                for (int x=0; x<lockerXCoordinates.length; x++) {
                    current = Math.abs(lockerXCoordinates[x]-(j+1)) + Math.abs(lockerYCoordinates[x]-(i+1));
                    if (current < aux) {
                        aux = current;
                    }                    
                }
                result[j][i] = aux;
            }
        }
        //return result;

    }

}
