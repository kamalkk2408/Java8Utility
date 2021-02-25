package com.kishore.kamal.lambdas;

import java.util.Comparator;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        runnableExample();
        runnableExample1();
        runnableExample2();
        comparatorExample();
    }


    private static void runnableExample() {
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("::This is thread 1 ::");
            }
        };
        new Thread(t1).start();
    }

    private static void runnableExample1() {
        Runnable t2 = () -> System.out.println("::This is Thread 2::");
        new Thread(t2).start();
    }

    private static void runnableExample2(){
        new Thread(() ->{System.out.println("::This is Thread 2::");
            System.out.println("Testing");}).start();

    }

    private static void comparatorExample(){
        Comparator<Integer> comp = (x,y) -> x.compareTo(y);
        System.out.println(comp.compare(10,20));
    }

}
