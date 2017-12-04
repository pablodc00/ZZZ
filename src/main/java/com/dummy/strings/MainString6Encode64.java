package com.dummy.strings;



import java.util.Base64;

public class MainString6Encode64 {

    public static void main(String[] args) {

        String decode64 = "campaignId:62237|messageId:1d9d0da8614042d5ada70de5308cbc2e111417|linkId:intdv3h_hotels_row2_price|userAgent:Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/62.0.3202.94 Chrome/62.0.3202.94 Safari/537.36|requestUrl:http://localhost:8080/emt-service/lt|";
        String encode64 = Base64.getEncoder().encodeToString(decode64.getBytes());

        System.out.println(encode64);

    }
}
