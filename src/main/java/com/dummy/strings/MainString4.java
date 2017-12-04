package com.dummy.strings;

public class MainString4 {
    public static void main(String[] args) {

        String url = "http://mysite.com?param1=value1&u=https://www.despegar.com.ar/search/hotels";
        String param = "&emtSource=Y2FtcGFpZ25JZDo2MjIzNzttZXNzYWd";

        int index = url.indexOf("&u=http");

        String completeUrl = url.substring(0, index) + param + url.substring(index);
        //System.out.println(completeUrl);

        url = "https://www.despegar.com.ar/search/Hotel/576/2018-07-26/2018-08-01/1?hotelOid=614733&mktdata=&n=e&ltype=sell&br=DESPEGAR&c=toruk_cross_selling_hotels_1&co=null&pr=null&kw=AR&cm=toruk_cross_selling_hotels_1&etype=pers&tclid=despegar&emtSource=Y2FtcGFpZ25JZDo2MjIzNzttZXNzYWdlSWQ6MWQ5ZDBkYTg2MTQwNDJkNWFkYTcwZGU1MzA4Y2JjMmUxMTE0MTc7bGlkOmludGR2M2hfaG90ZWxzX3JvdzJfcHJpY2U7YWdlbnRTdHJpbmc6TW96aWxsYS81LjAgKFgxMTsgVWJ1bnR1OyBMaW51eCB4ODZfNjQ7IHJ2OjU3LjApIEdlY2tvLzIwMTAwMTAxIEZpcmVmb3gvNTcuMDtyZXF1ZXN0VXJsOmh0dHA6Ly9sb2NhbGhvc3Q6ODA4MC9lbXQtc2VydmljZS9sdDt0cmFja2luZ0lkOjM5NzJmZDVkLWM4ZmItNGEzZC1iMmZkLTVkYzhmYjRhM2RmODtyZWZlcmVyOm51bGw7YnJhbmQ6bG9jYWxob3N0&id=201711291508383238752081955575&trackeame_user_id=12C473225F181507056449022ce3df9b9-9e4d-43d8-9c07-29c61ba34525281574#sorting=best_selling_descending&page=1&view=list";
        boolean flag = url.contains("emtSource");
        System.out.println(flag);


    }
}
