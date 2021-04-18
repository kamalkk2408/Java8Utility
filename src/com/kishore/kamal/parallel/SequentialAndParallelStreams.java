package com.kishore.kamal.parallel;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SequentialAndParallelStreams {
    public static void main(String[] args) {
        String[] arr = {"1", "2","3","4","5","6","7", "8", "9", "10" };
        System.out.println("--------Sequential---------------------");
        printStreams(Arrays.stream(arr).sequential());
        System.out.println("--------Parallel---------------------");
        printStreams(Arrays.stream(arr).parallel());
    }

    static void printStreams(Stream<String> stream){
        stream.forEach(s ->{
            System.out.println(LocalDateTime.now() + " Value :: " + s +" :: "+Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
