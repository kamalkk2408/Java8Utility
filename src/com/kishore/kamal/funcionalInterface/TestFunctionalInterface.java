package com.kishore.kamal.funcionalInterface;

@FunctionalInterface
public interface TestFunctionalInterface {
    public void test();

    // we can have default method in functional interfaces
    default void testing(){
        System.out.println("testing default function");
    }

    //we can have static method
    static boolean isTrue(){
        return true;
    }
}
