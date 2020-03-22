package com.dummy.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;


class DecibinaryVO implements Comparable<DecibinaryVO>{
    private Long decibinary;
    private Long decimal;
    
    public DecibinaryVO(Long decibinary, Long decimal) {
        this.decibinary = decibinary;
        this.decimal = decimal;        
    }

    public void setDecibinary(Long decibinary) {
        this.decibinary = decibinary;
    }

    public Long getDecibinary() {
        return decibinary;
    }
    
    public void setDecimal(Long decimal) {
        this.decimal = decimal;
    }    

    public Long getDecimal() {
        return decimal;
    }

    @Override
    public int compareTo(DecibinaryVO other) {
        return this.getDecimal().equals(other.getDecimal()) 
                ? (int) (this.getDecibinary() - other.getDecibinary()) 
                : (int) (this.getDecimal() - other.getDecimal()) ; 

    }
    
    @Override
    public String toString() {
        return this.getDecibinary() + "-" + this.getDecimal();
    }
    
}

/*
SortedSet<DecibinaryVO> db = new TreeSet<>();        

DecibinaryVO db1 = new DecibinaryVO(12,4);
DecibinaryVO db2 = new DecibinaryVO(100, 4);
DecibinaryVO db3 = new DecibinaryVO(20, 4);
DecibinaryVO db4 = new DecibinaryVO(4,4);
DecibinaryVO db5 = new DecibinaryVO(11,3);
DecibinaryVO db6 = new DecibinaryVO(3,3);
DecibinaryVO db7 = new DecibinaryVO(1,1);

db.add(db1);
db.add(db2);
db.add(db3);
db.add(db4);
db.add(db5);
db.add(db6);
db.add(db7);        

System.out.println(db);
*/


/*    
List<DecibinaryVO> db = new ArrayList<>();

DecibinaryVO db1 = new DecibinaryVO(12,4);
DecibinaryVO db2 = new DecibinaryVO(100, 4);
DecibinaryVO db3 = new DecibinaryVO(20, 4);
DecibinaryVO db4 = new DecibinaryVO(4,4);
DecibinaryVO db5 = new DecibinaryVO(11,3);
DecibinaryVO db6 = new DecibinaryVO(3,3);
DecibinaryVO db7 = new DecibinaryVO(1,1);
DecibinaryVO db8 = new DecibinaryVO(0,0);

db.add(db1);
db.add(db2);
db.add(db3);
db.add(db4);
db.add(db5);
db.add(db6);
db.add(db7);
db.add(db8);

Collections.sort(db);

System.out.println(db);

int index = db.indexOf(db3);
System.out.println(index);
*/

/*
DecibinaryVO vo = getDecibinary(2016);        
System.out.println(vo);
*/

/*
List<DecibinaryVO> db = new ArrayList<>();

DecibinaryVO db1 = new DecibinaryVO(2016,24);
DecibinaryVO db2 = new DecibinaryVO(2008,24);
db.add(db1);
db.add(db2);
Collections.sort(db);        
System.out.println(db);
*/


//List<DecibinaryVO> dbList = new ArrayList<>();
//DecibinaryVO vo = getDecibinary(0);
//dbList.add(vo);


//DecibinaryVO vo = new DecibinaryVO(0,0);
//dbList.add(vo);


/*
DecibinaryVO vo = null;

for (int i=0; i<=1000; i++) {
    vo = getDecibinary(i);
    //map.compute(vo.getDecimal(), (k, v) -> v == null ? 1 : v + 1);            
    dbList.add(vo);
}
*/


/*
for (Map.Entry<Integer, Integer> item : map.entrySet()) {
    System.out.println(item.getKey() + " --- " + item.getValue());
}
*/


/*
for (int i=0; i<=100000; i++) {
    System.out.println(i+1 + " --- " + dbList.get(i).getDecibinary() + " --- " + dbList.get(i).getDecimal());
}        
*/

/*
DecibinaryVO db1 = getDecibinary(1);
dbList.add(db1);

db1 = getDecibinary(2);
dbList.add(db1);

db1 = getDecibinary(3);
dbList.add(db1);

db1 = getDecibinary(4);
dbList.add(db1);

db1 = getDecibinary(10);
dbList.add(db1);
*/

/*
Collections.sort(dbList);

for (int i=0; i<=1000; i++) {
    //System.out.println(i+1 + " --- " + dbList.get(i).getDecibinary() + " --- " + dbList.get(i).getDecimal());
    //System.out.println(i+1 + " --- " + dbList.get(i).getDecibinary());
    System.out.println(dbList.get(i).getDecibinary());
}
*/

//System.out.println(dbList);


/*
System.out.println(dbList.get(1-1));
System.out.println(dbList.get(2-1));
System.out.println(dbList.get(3-1));
System.out.println(dbList.get(4-1));
System.out.println(dbList.get(10-1));
*/



public class Decibinary {

    
    
    private static Map<Integer, Integer> map = new TreeMap<>();
    
    public static void main(String[] args) {


        //Map<Long,Long> cache = new TreeMap<>();
        
        //int N = 20;
        //int res = 1 << N;
        //System.out.println("res: "+ Integer.toBinaryString(res) );
                        
        //long result = decibinaryNumbers(4);
        
        //System.out.println(result);
        
        
        DecibinaryVO vo = null;
        //vo = getDecibinary(40001011100000101L);
        
        
        List<DecibinaryVO> dbList = new ArrayList<>();

        for (long i=4020; i<=4030; i++) {
            vo = getDecibinary((long)i);
            //map.compute(vo.getDecimal(), (k, v) -> v == null ? 1 : v + 1);            
            dbList.add(vo);
        }
        Collections.sort(dbList);
        
        List<Long> deciList = dbList.stream().map(v -> v.getDecimal()).distinct().collect(Collectors.toList());
        for (Long l : deciList) {
            System.out.print(l);
            System.out.print(", ");
        }

        
        
        /*
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }
        */
        
        
        
        
        /*
        for (Iterator iterator = dbList.iterator(); iterator.hasNext();) {
            DecibinaryVO decibinaryVO = (DecibinaryVO) iterator.next();
            System.out.println(decibinaryVO.getDecibinary() + " --- " + decibinaryVO.getDecimal());
        }
        */
        
        
        
    }
    
    /*
    private static long decibinaryNumbers(long x) {
        if (x == 1 || x == 2 || x == 3) {return x-1;}
        
        long aux = 0;
        
        if (memoMap.containsKey(x-1)) {
            aux = memoMap.get(x-1);
        } else {
            aux = decibinaryNumbers(x-1);
        }
        
        long res = aux * (long) Math.pow(2, x-1);
        for (int i=1; i<x-1; i++) {
            res += decibinaryNumbers(i) * Math.pow(2, i);
        }
        
        
        memoMap.put(x, res);
        return res;        
    }
    */
    
    private static DecibinaryVO getDecibinary(Long decibinary) {        
        String aux = decibinary.toString();
        
        String d;
        long decimal = 0;
        int j = aux.length();
        for (int i = 0; i < aux.length(); i++) {
            j--;
            d = aux.substring(i, i+1);
            decimal += Integer.parseInt(d) * Math.pow(2, j);
        }
        
        return new DecibinaryVO(decibinary, decimal);
    }

}
