package com.dummy.teksystem.test;

import java.util.Locale;

public class Test5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Long i = new Long(10);
        //long j = 10;
        //System.out.println(i.equals(j));
        
/*        Test5 myClass = new Test5();
        Class c = myClass.getClass();
        try {
            System.out.println(c.getMethod("getNumber", null).toString());
            System.out.println(c.getDeclaredMethod("setNumber", null).toString());
        } catch (Exception e) {
            
        }
        
    }
        
        public Integer getNumber() {
            return 2;
        }
        
        public void setNumber(Integer n) {
            
        }*/
        
/*        SortedSet<Element> s = new TreeSet<Element>();
        s.add(new Element(15));
        s.add(new Element(10));
        s.add(new Element(25));
        s.add(new Element(10));
        System.out.println(s.first() + " " + s.size());*/

        Locale locale = new Locale("USA");
        System.out.println("Country: "+ locale.getCountry());
        

}
    
}
    
    

    
    class Element implements Comparable {
        int id;
        
        Element(int id) {
            this.id = id;
        }
        
        public int compareTo(Object obj) {
            Element e = (Element) obj;
            return this.id - e.id;
        }
        
        public String toString() {
            return "" + this.id;
        }
    }
   
    

