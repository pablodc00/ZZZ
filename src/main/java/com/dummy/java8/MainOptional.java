package com.dummy.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainOptional {

    public static void main(String[] args) {

//        String vari = "test";
//        Optional<String> optional = Optional.ofNullable(vari);
//
//        System.out.println(optional.get());



        List<String> strings = new ArrayList<>();
        strings.add(null);
        strings.add("test");

        String firstString = strings.stream()
            //.filter(Objects::nonNull)
            .findFirst()      // Exception thrown here
            .orElse("StringWhenListIsEmpty");


        System.out.println(firstString);

    }

}
