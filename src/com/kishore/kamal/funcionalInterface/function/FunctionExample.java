package com.kishore.kamal.funcionalInterface.function;

import java.util.function.Function;

public class FunctionExample {
    private static Function<String, String> f1 = name -> name.toUpperCase();
    private static Function<String, String> f2 = name  -> name.concat(" concat");
    private static Function<String, Integer> f3 = name -> name.length();

    public static void main(String[] args) {

        System.out.println(f1.apply("java 8"));
        System.out.println(f2.apply("java 8"));
        System.out.println(f1.andThen(f2).apply("java 8"));
        System.out.println(f1.compose(f2).apply("java 8"));
        System.out.println(f1.compose(f2).andThen(f3).apply("java 8"));



    }
}
