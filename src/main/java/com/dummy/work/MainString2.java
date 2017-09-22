package com.dummy.work;

import org.apache.commons.lang3.StringUtils;

public class MainString2 {

    public static void main(String[] args) {
        

        String s1 = " ";
        String s2 = null;

        StringUtils.isBlank(s1);
        StringUtils.isBlank(s2);
        StringUtils.isNoneBlank(s2);

        StringUtils.isEmpty(s1);
        StringUtils.isEmpty(s2);

    }

}
