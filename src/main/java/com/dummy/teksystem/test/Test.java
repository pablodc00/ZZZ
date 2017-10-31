package com.dummy.teksystem.test;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {

/*    public static int count;
    static {
        System.out.println("In block 1");
        count = 10;
    }
    
    private int[] data;
    {
        System.out.println("In block 2");
        data = new int[count];
        for (int i = 0; i < count; i++) {
            data[i] = i;
        }
    }*/
    
    
    public static void main(String[] args) {
        
/*        System.out.println("Count = " + count);
        System.out.println("Before 1st ...");
        Test test = new Test();
        System.out.println("Before 2nd ...");
        Test test2 = new Test();*/
        
        
        //YearMonth ym1 = YearMonth.of(2015, Month.SEPTEMBER);
        //YearMonth ym2 = YearMonth.of(2016, Month.FEBRUARY);
                
        
        //System.out.println(ym1.until(ym2, ChronoUnit.MONTHS));
        //System.out.println(ym1.minus(Period.ofMonths(4)).getMonthValue());
        //System.out.println(ym2.compareTo(ym1));
        
        //System.out.println(Runtime.getRuntime().totalMemory());
        //System.out.println(Runtime.getRuntime().maxMemory());
        //System.out.println(Runtime.getRuntime().freeMemory());
        
        Supplier<String> i = () -> "Car";
        Consumer<String> c = x -> System.out.print(x.toLowerCase());
        Consumer<String> d = x -> System.out.print(x.toUpperCase());
        c.andThen(d).accept(i.get());
        //System.out.println();
        
        
        //new Integer("N");
        
        
    }

}
