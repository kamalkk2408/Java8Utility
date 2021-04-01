package com.kishore.kamal.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamExample {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1,2,3,4,5);
        s1.forEach(System.out::println);

        Stream<Integer> s2 = Stream.of(new Integer[]{1,2 , 3, 4, 5, 6});

        s2.map(i -> i%2 == 0).peek(System.out::println).collect(Collectors.toList()).forEach(System.out::print);

    }
}
