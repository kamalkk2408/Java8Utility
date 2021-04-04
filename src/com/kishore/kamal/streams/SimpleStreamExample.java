package com.kishore.kamal.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamExample {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1,2,3,4,5);
        s1.forEach(System.out::println);

        Stream<Integer> s2 = Stream.of(new Integer[]{1,2 , 3, 4, 5, 6});

        //peek
        s2.map(i -> i%2 == 0).peek(System.out::println).collect(Collectors.toList()).forEach(System.out::print);

        //map
        List<Person> personList1 = new ArrayList<>();
        for(int i =0;i< 10;i++){
            personList1.add(new Person(i, " personList1" + String.valueOf(i)));

        }


        System.out.println("map Example");
        personList1.stream().map(Person::getName).peek(System.out::println).collect(Collectors.toList()).forEach(System.out::print);

        //flatmap
        List<Person> personList2 = new ArrayList<>();

        for(int i =0;i< 10;i++){
            personList2.add(new Person(i, " personList2" + String.valueOf(i)));
        }
        List<List<Person>> pList = new ArrayList<>();
        pList.add(personList1);
        pList.add(personList2);

        System.out.println("\n..............\n flat map Example");
        pList.stream().flatMap(List::stream).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("\n..............\n Sorted example");
        pList.stream().flatMap(List::stream).sorted(Comparator.comparing(a -> a.name)).collect(Collectors.toList()).stream().forEach(System.out::println);

        countExample(pList);

        //reduce
        System.out.println(personList2.stream().map(p -> p.getId()).reduce( 0, (a,b)-> (a+b)));

    }

    private static void countExample(List<List<Person>> pList) {
        System.out.println("\n..............\n Count example :: " +  pList.stream().flatMap(List::stream).sorted(Comparator.comparing(a -> a.name)).collect(Collectors.toList()).stream().count());
        pList.stream().flatMap(List::stream).sorted(Comparator.comparing(a -> a.name)).collect(Collectors.toList()).stream().count();
    }

    static class Person implements Comparable<Person>{
        int id;
        String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Person o) {
           return this.id < o.id ? -1 : ( this.id == o.id ? 0 : 1);
        }
    }
}
