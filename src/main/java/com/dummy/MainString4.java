package com.dummy;

public class MainString4 {
    public static void main(String[] args) {

        String url = "http://mysite.com?param1=value1&u=https://www.despegar.com.ar/search/hotels";
        String param = "&emtSource=Y2FtcGFpZ25JZDo2MjIzNzttZXNzYWd";

        int index = url.indexOf("&u=http");

        String completeUrl = url.substring(0, index) + param + url.substring(index);
        System.out.println(completeUrl);


    }
}
