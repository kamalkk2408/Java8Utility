package com.kishore.kamal.funcionalInterface.consumer;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("Java 8");

        Consumer<String> consumer1= (s) -> System.out.println(s.toLowerCase());
        consumer1.accept("Java 8");


        consumer.andThen(consumer1).accept("Java 8");

    }
}
