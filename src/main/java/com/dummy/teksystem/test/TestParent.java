package com.dummy.teksystem.test;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

class Parent {

    public String s;
    public List<Integer> indices;
    public Parent(String s) {
        this.s = s;
        indices = new LinkedList<>();
        for (int i=0; i<this.s.length(); i++) {
            indices.add(i);
        }
    }
}


class TestParent {
    public static void main(String[] args) {
        Stream.of(new Parent("Mercury"), new Parent("Venus"), new Parent("Earth"))
        .flatMap(i -> i.indices.stream())
        .mapToInt( j -> j)
        .max()
        .ifPresent(s -> System.out.println(s));
    }
}

