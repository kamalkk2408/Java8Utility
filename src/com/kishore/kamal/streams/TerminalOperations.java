package com.kishore.kamal.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.summingInt;

public class TerminalOperations {
    public static void main(String[] args) {
        String[] arr = {"abc", "bcd", "cde2", "def2"};
        String string = Stream.of(arr).collect(Collectors.joining());
        System.out.println(string);

        System.out.println("----------------");
        String string1 = Stream.of(arr).collect(Collectors.joining(" : "));
        System.out.println(string1);


        System.out.println("----------------");
        String string2 = Stream.of(arr).collect(Collectors.joining("-","[","]"));
        System.out.println(string2);
        //Count
        System.out.println("----------------");
        System.out.println("count is :: "+Stream.of(arr).collect(Collectors.counting()));
        //Group by
        System.out.println("----------------");
        Map<Object, List<String>> group = Stream.of(arr).collect(Collectors.groupingBy(a -> "bbb".compareTo(a)));
        Stream.of(group).forEach(System.out::println);

        System.out.println("----------------");
        Map<String, List<String>> group1 = Stream.of(arr).collect(Collectors.groupingBy(a -> "bbb".compareTo(a) >0 ?"Greater": "Smaller"));
        group1.entrySet().stream().forEach(v -> System.out.println(v.getKey() + ": " + v.getValue() ));

        System.out.println("----------------");
        Map<Integer, Map<String,List<String>>> group2 = Stream.of(arr).collect(Collectors.groupingBy(String::length,Collectors.groupingBy((a -> "bbb".compareTo(a) >0 ?"Greater": "Smaller"))));
        Stream.of(group2).forEach(System.out::println);

        System.out.println("----------------");
        Map<Integer,List<String>> group3 = Stream.of(arr).collect(Collectors.groupingBy(String::length, HashMap::new, Collectors.toList()));
        Stream.of(group3).forEach(System.out::println);

        System.out.println("----------------");
        Map<Integer,Integer> group4 = Stream.of(arr).collect(Collectors.groupingBy(String::length, summingInt(String::length)));
        Stream.of(group4).forEach(System.out::println);
    }
}
