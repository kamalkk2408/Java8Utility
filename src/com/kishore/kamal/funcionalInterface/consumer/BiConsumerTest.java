package com.kishore.kamal.funcionalInterface.consumer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTest {
    public static void main(String[] args) {
        BiConsumer<List<Integer>, List<Integer>> consumer = (a, b) -> {
            if(a.size() == b.size()) System.out.println("Same size");
            else System.out.println("Different Size");
        };


        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        consumer.accept(list1,list2);

    }


}
