package com.dummy.work;

import java.util.*;

public class Contains {

    public static void main(String[] args) {
	    //System.out.println("Annagram - anagram");
	    //System.out.println(contains("Annagram", "anagram"));
		
	    //System.out.println("Ronald Hernandez - Hernandez Ronald");
	    //System.out.println(contains("Ronald Hernandez", "Hernandez Ronald"));        
        
	    //System.out.println("Ronald Hernandez - Hernandez Ronald");
	    //System.out.println(contains("Ronald Hernandez3", "Hernandez R3onald"));        

	    //System.out.println("Ronald Hernandez - Hernandez Ronald");
	    //System.out.println(contains("Ronald Hernandez3", "Hernandez R3onald"));
	    
	    System.out.println("Ronald Hernandez - Hernandez Ronald");
	    System.out.println(contains("Ronald Hernandez", "Hernandez R3onald"));	    
	    
	    
    }

	public static boolean contains(String str1, String str2) {
	    
	    char[] ch1 = new char[str1.length()];
	    for (int i=0; i<ch1.length; i++) {
	        ch1[i] = str1.charAt(i);
	    }
	    Arrays.sort(ch1); 
	    
	    
	    char[] ch2 = new char[str2.length()];
	    for (int i=0; i<ch2.length; i++) {
	        ch2[i] = str2.charAt(i);
	    }
	    Arrays.sort(ch2);
	    
	    
	    if (ch2.length > ch1.length) {
	        return false;
	    }
	    
	    char[] ch3 = Arrays.copyOfRange(ch1, 0, ch2.length);
	    return Arrays.equals(ch3, ch2);
	    
	}    
    
}
