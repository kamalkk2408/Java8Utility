package com.kishore.kamal.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        String[] arr = {"abc", "bcd", "cde", "def"};
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



    }
}
