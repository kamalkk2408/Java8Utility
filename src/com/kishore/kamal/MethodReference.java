package com.kishore.kamal;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReference {

    private static Function<String, String> toUpperCase = a -> (a.toUpperCase());
    private static Function<String, String> toUpperCase1 = String::toUpperCase;
    private static Predicate<String> isUpperCase = MethodReference::isUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCase.apply("test"));
        System.out.println(toUpperCase1.apply("test"));
        System.out.println(isUpperCase.test("test"));


    }

    public static boolean isUpperCase(String string){
       return string.equals(string.toUpperCase());
    }
}
