package com.dummy.java8;

import java.util.Optional;

public class MainOptional {

    public static void main(String[] args) {

        String vari = "test";
        Optional<String> optional = Optional.ofNullable(vari);

        System.out.println(optional.get());

    }
}
