package com.dummy.work;

public class Foo {
    static volatile Integer y = new Integer(0);
    
    public void foo() {
        y = new Integer(10);
        update(y);
        System.out.println(y);
    }
    
    public void update(Integer y) {        
        y = new Integer(30);
    }
    
    static String fizzBuzz(int untilVal) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        
        for (int i = 1; i <= untilVal; i++) {
            
            if (i % (3*5) == 0) {
                sb.append("FizzBuzz");
                flag = false;
            }
            if (i % 3 == 0) {
                sb.append("Fizz");
                flag = false;
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
                flag = false;
            }
            if (flag) {
                sb.append(i);
                flag=false;
            }
            
            sb.append("\n");            
        }
        
        return sb.toString();
    }
}
