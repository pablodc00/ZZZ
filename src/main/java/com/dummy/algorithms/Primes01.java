package com.dummy.algorithms;

import java.math.BigInteger;

class Prime {


    public void checkPrime(int... numbers) {
        
        StringBuilder sb = new StringBuilder();
        for (int n : numbers) {
            if (BigInteger.valueOf(n).isProbablePrime(1)) {
                sb.append(n+" ");
            }
        }
        System.out.println(sb.toString().trim());
        
      
    }
    
}    


public class Primes01 {

    public static void main(String[] args) {

       
        int n1=7;
        int n2=18;
        int n3=2;
        int n4=5;
        int n5=10;

        /*         
        int n1=2;
        int n2=1;
        int n3=3;
        int n4=4;
        int n5=5;        
        
        int n1=2;
        int n2=9;
        int n3=45;
        int n4=6;
        int n5=7;

        
        int n1=3;
        int n2=8;
        int n3=6;
        int n4=1;
        int n5=4;
*/
        
        
        
        Prime ob=new Prime();
        ob.checkPrime(n1);
        ob.checkPrime(n1,n2);
        ob.checkPrime(n1,n2,n3);
        ob.checkPrime(n1,n2,n3,n4,n5);  

    }

}
