/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dummy.work;

import java.lang.reflect.Array;

/**
 *
 * @author pablo
 */
public class AppReflection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int dims[] = new int[]{5, 10, 15};
         Object arr = Array.newInstance(Integer.TYPE, dims);

         Object arrobj = Array.get(arr, 3);
         Class cls = arrobj.getClass().getComponentType();
         System.out.println(cls);
         arrobj = Array.get(arrobj, 5);
         Array.setInt(arrobj, 10, 37);

         int arrcast[][][] = (int[][][])arr;
         System.out.println(arrcast[3][5][10]);

    }

}
