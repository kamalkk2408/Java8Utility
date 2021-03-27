package com.kishore.kamal;

import java.util.function.Consumer;

public class LambdaLocalVariable {
    static int I =100;
    public static void main(String[] args) {
        int i = 0;

        Consumer<Integer> con = x -> {
//            i =10; //doesn't work
                I =10;
        System.out.println(I);
        };
        con.accept(i);
        System.out.println(i);
        System.out.println(I);
    }
}
