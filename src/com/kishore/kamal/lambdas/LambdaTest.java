package com.kishore.kamal.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaTest {
    public static void main(String[] args) {

        removeDuplicate();
    }

    /**
     * .distinct()
     * .collect()
     */
    private static void removeDuplicate(){
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "aaa", "aa");
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }
}
