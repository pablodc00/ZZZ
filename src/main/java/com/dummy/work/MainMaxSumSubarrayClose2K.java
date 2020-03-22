package com.dummy.work;

import java.util.TreeSet;

public class MainMaxSumSubarrayClose2K {

    public static void main(String[] args) {
        
        //ceiling
        // creating a TreeSet 
        TreeSet <Integer>treeadd = new TreeSet<Integer>();
          
        // adding in the tree set
        treeadd.add(12);
        treeadd.add(11);
        treeadd.add(16);
        treeadd.add(15);
          
        // getting ceiling value for 13
        System.out.println("Ceiling value for 13: "+treeadd.ceiling(13));
        // Ceiling value for 13: 15
        /////////////////////////////////////////////////////////////////
        
        
        //Maximum Sum of Subarray Close to K
        int[] arr = {35,81,43,5,8,501,3,203};
        int k = 19;

        int sum=0;
        TreeSet<Integer> set = new TreeSet<Integer>();
        int result=Integer.MIN_VALUE;
        set.add(0);
     
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
     
            Integer ceiling = set.ceiling(sum-k);
            if(ceiling!=null){
                result = Math.max(result, sum-ceiling);
            }
     
            set.add(sum);
        }
     
        
        System.out.println(result);
        //return 48
    }

}
