package com.dummy.work;

public class Main {

    public static void main(String[] args) {

        String landingPageUrl = "http://sandbox.shopyourway.com/app/128/l/sweepstakes/sw-gabi-skyp-w9-3/35449";
        String uri_right = "/landing/sweepstakes/sw-gabi-skyp-w9-3/35449";
        String uri_wrong = "/landing/sweepstakes/sw-gabi-skyp-w9-3/35450";
        
        String[] pathInfoArray =  uri_right.split("/");
        String pathInfo = String.join("/", pathInfoArray[pathInfoArray.length - 3], pathInfoArray[pathInfoArray.length - 2], pathInfoArray[pathInfoArray.length - 1]);
        
        landingPageUrl.contains("/sweepstakes/sw-gabi-skyp-w9-3/35450");
        
        System.out.println(pathInfo);
        
    }

}
