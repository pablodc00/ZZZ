package com.dummy.work;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        
        System.out.println(UUID.randomUUID());

        /*
        String landingPageUrl = "http://sandbox.shopyourway.com/app/128/l/sweepstakes/sw-gabi-skyp-w9-3/35449";
        String uri_right = "/landing/sweepstakes/sw-gabi-skyp-w9-3/35449";
        String uri_wrong = "/landing/sweepstakes/sw-gabi-skyp-w9-3/35450";
        
        String[] pathInfoArray =  uri_right.split("/");
        String pathInfo = String.join("/", pathInfoArray[pathInfoArray.length - 3], pathInfoArray[pathInfoArray.length - 2], pathInfoArray[pathInfoArray.length - 1]);
        
        landingPageUrl.contains("/sweepstakes/sw-gabi-skyp-w9-3/35450");
        
        System.out.println(pathInfo);
        */
        
        /*
        int count = 4;

        if (count >= 0)
            if (count == 0)
                System.out.println("first output");
        else System.out.println("second output");
        System.out.println("third output");
        */
        
        /*
        List<Number> plants = new ArrayList<Number>();
        //plants.add(new Number());
        List<? extends Number> trees = plants;
        Number plant = trees.get(0);
        */
        
        /*
        int count = 1;

        do {
          System.out.println("Count is: " + count);
          count++;
        } while (count < 2);        
        */
    }

}
