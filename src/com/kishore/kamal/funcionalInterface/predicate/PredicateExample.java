package com.kishore.kamal.funcionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> lessThan = a -> (a >= 50);
        boolean result = lessThan.test(15);
        System.out.println("result : " + result);
    }
}
